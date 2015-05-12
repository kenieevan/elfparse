#!/bin/bash
if [ $# -lt 1 ];then
  echo "Usage: $0 filename"
  exit
fi

elfName=$1

tmpfile=testfile
tmpfile1=testfile1
readelf --syms $elfName  > $tmpfile

#parse the syms, extract valid functions and fields
#startaddress  size   funcname
awk '{if($4~/FUNC/ && $7!~/UND/ && $3 != "0") print $2"\t"$3"\t"$8}' $tmpfile  > $tmpfile1

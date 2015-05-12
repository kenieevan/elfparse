import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Vector;


//describe the elf file, the function list. and the behavior of parsing
public class ElfParser
{
	private String elfName;
	
	private String asmCodeStore;
	private FuncSym curFunc;
	
	private Vector<FuncSym> funcTable; //all valid function are collected here
	
	ElfParser(String n)
	{
		elfName = n;
	}
	
	public void setupFuncTable()
	{
		//invoke parseelf.sh to generate sym list
		//read sym from the file line by line
		
		String cmd = "/home/jianmingf/test/parseelf.sh " + elfName;
		System.out.println("cmd is: " + cmd);
		
		
		try {
			Process p = Runtime.getRuntime().exec(cmd);
			Scanner in = new Scanner(Paths.get("testfile1"));
			String line;
			while((line = in.nextLine()) != null) {
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		//disassemble the sym. Need to invoke objdump -d for thousands of times. 
		//this maybe not efficient enough.
		
		
		
		//parse the asm code. Add caller, callee vector.
		
		
	}
	
	//search the function, if not exist, return null;
	public FuncSym locateFunc(String name)
	{
		return null;
	} 
	
	
	//disassem the function , save the asm code into asmCodeStore
	private void disasmFunc() 
	{
		return;
	}
	
	//parse the asm code, create the FuncSym into funcTable, setup the caller, callee links
	//return the number of callees
	private int parseFuncAsm()
	{
		return 0;
	}
	
	//the entry point;
	
	// setup the function table
	// get input 
	// print one function callers and callee.
	
	public static void main(String[] argv)
	{
		if (argv.length != 1) {
			System.out.println("Usage: input elf file path");
			return;
		}
		ElfParser p = new ElfParser(argv[0]);
		
		p.setupFuncTable();
		
		//while(true) {
			//get input from console. just test here
			//String func = "main";
			
			//locate the function and print it callee
			//FuncSym f = p.locateFunc(func);
			//f.printCallee();
		//}
	}
}

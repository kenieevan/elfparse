import java.util.Vector;



public class FuncSym {
	private String name;
	private int length;
	private double startAddr;
	private int type;  //undefined or defined
	private boolean bParsed;
	//private String asmCode;
	
	private Vector<FuncSym> callers;
	private Vector<FuncSym> callee;
	
	
	FuncSym(String n, int len, double addr)
	{
		name = n; 
		length = len;
		startAddr = addr;
	}
	
	public void printCaller(){}
	public void printCallee(){}
	
}





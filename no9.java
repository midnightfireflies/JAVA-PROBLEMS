import java.util.Scanner;


public class no9
{
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int x = scn.nextInt();
	int y = scn.nextInt();
	if(x>y)
	    System.out.println("GREATER = "+x);
	else
	    System.out.println("GREATER = "+y);
	scn.close();	
}
}

import java.util.Scanner;


public class no10
{
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int x = scn.nextInt();
	int y = scn.nextInt();
	int z = scn.nextInt();
	if(x>y && x>z){
	    System.out.println("GREATER = "+x);}
	else if(y>x && y>z){
	    System.out.println("GREATER = "+y);
	}
	else
	    System.out.println("GREATER = "+z);
	scn.close();
	}
}

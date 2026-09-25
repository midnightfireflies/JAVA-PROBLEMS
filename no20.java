import java.util.Scanner;
public class  no20{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        if(n < 1) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }
        else if(n == 1) {
            System.out.print(a+" ");
            sc.close();
            return;
        }
        else{
        System.out.print(a+" "+b+" ");
        for(int i=2; i<n; i++){
            int c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
        sc.close();
    }
    }
}
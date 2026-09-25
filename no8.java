import java.util.Scanner;

public class no8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println("NEGATIVE");
        }else if(n>0){
            System.out.println("POSITIVE");
        }else{
            System.out.println("ZERO");
        }
        sc.close();
    }

}

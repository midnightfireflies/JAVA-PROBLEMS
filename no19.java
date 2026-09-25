import java.util.Scanner;

public class no19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        for(int i=0; i<n; i++){
            sum *= n-i;
        }
        System.out.println("FACTORIAL = " +sum);
        sc.close();
    }
}

import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double f = (c * 9/5) + 32;
        System.out.printf("F = %.2f\n", f);
        sc.close();
    }
    
}

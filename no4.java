import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        double z = (double)x + y;
        double w = z/2;
        System.out.println("AVERAGE = " + w);
        sc.close();
    }
}

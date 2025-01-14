import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        while(true) {
            System.out.println("Please enter the number of sides. ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n < 1) {
                break;
            }
            double b = 360.0 / n;
            double a = b / 2;
            double s = 2 * Math.sin(Math.toRadians(a));
            double p = n * s;
            double pi = p / 2;
            System.out.printf("our Pi estimate is: %.10f%n", pi);
            System.out.println(pi);
        }

    }
}

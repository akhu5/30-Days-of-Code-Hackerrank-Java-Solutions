import java.util.Scanner;

public class RunningTime {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            int n = scanner.nextInt();
            int c = 0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    System.out.println("YO");
                    c++;
                    break;
                }
            }
            if (c == 0 && n >= 2)
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }
}

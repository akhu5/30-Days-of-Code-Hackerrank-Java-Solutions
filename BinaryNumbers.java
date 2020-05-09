import java.util.Scanner;

public class BinaryNumbers {

        private static final Scanner scanner = new Scanner(System.in);

        static long decimal2Binary (int n){
            if (n == 0)
                return 0;
            else
                return ((n % 2) + (10 * decimal2Binary(n/2)));
        }

        static int consecutive1count (long n){
            char[] s = (String.valueOf(n)).toCharArray();
            int max = 0, count = 0;
            for (char c : s) {
                if (Character.getNumericValue(c) == 1) {
                    count++;
                    if (count > max)
                        max = count;
                } else
                    count = 0;
            }
            return max;
        }

        public static void main(String[] args) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            scanner.close();
            System.out.println(consecutive1count(decimal2Binary(n)));
            System.out.println();
        }
    }

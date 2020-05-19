import java.util.Scanner;

public class NestedLogic {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int[] expectedReturn = new int[3];
        int[] actualReturn = new int[3];

        String[] actual = scanner.nextLine().split(" ");
        String[] expected = scanner.nextLine().split(" ");

        for (int i = 0 ; i < 3 ; i++){
            expectedReturn[i] = Integer.parseInt(expected[i]);
            actualReturn[i] = Integer.parseInt(actual[i]);
        }

        int fine = 0;

        if (actualReturn[2] > expectedReturn[2]){
            fine = 10000;
        }
        else if (actualReturn[2] == expectedReturn[2])  {
            if (actualReturn[1] > expectedReturn[1]){
                fine = 500 * (actualReturn[1] - expectedReturn[1]);
            }
            else {
                if (actualReturn[0] > expectedReturn[0]){
                    fine = 15 * (actualReturn[0] - expectedReturn[0]);
                }
            }
        }
        System.out.println(fine);
    }
}

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble();
        int tipPercent = scan.nextInt();
        int taxPercent = scan.nextInt();
        scan.close();
        double totalCost = mealCost * (1 + (double) tipPercent/100 + (double) taxPercent/100);
        System.out.println(Math.round(totalCost));
    }
}

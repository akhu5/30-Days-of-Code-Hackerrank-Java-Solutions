import java.util.*;

public class DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        int inputInteger = scan.nextInt();
        double intDecimal = scan.nextDouble();
        scan.nextLine();
        String inputWord = scan.nextLine();
        System.out.println(i + inputInteger);
        System.out.println(d + intDecimal);
        System.out.println(s + inputWord);
        scan.close();
    }
}
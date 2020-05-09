import java.util.Scanner;

public class LetsReview {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        scan.nextLine();
        for (int i = 0 ; i < t ; i++){
            String s = scan.nextLine();
            oddEven(s);
        }
        scan.close();
    }
    static void oddEven (String s){
        for (int i = 0 ; i < s.length(); i++){
            if (i % 2 == 0) {
                System.out.print(s.charAt(i));
            }
        }
        System.out.print(" ");
        for (int i = 0 ; i < s.length(); i++){
            if (i % 2 == 1) {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
    }
}

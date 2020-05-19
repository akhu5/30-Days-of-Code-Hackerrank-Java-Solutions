import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        ArrayList<String> nameList = new ArrayList<>();
        String regex = ".*@gmail.com";
        Pattern p = Pattern.compile(regex);
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            Matcher m = p.matcher(emailID);
            if (m.matches()){
                nameList.add(firstName);
            }
        }
        Collections.sort(nameList);
        for (String s : nameList)
            System.out.println(s);
        scanner.close();
    }
}

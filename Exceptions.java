
import java.util.*;

public class Exceptions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            System.out.println(Integer.parseInt(S));
        }
        catch (NumberFormatException ns){
            System.out.println("Bad String");
        }
    }
}
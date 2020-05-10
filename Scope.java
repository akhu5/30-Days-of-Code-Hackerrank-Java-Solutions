import java.util.*;
import java.util.Arrays;

class Difference {
    public int maximumDifference;
    private int[] elements;

    Difference(int[] a) {
        this.elements = a;
    }

    void computeDifference() {
        //Method 1:
        /*for (int i = 0; i < elements.length; i++) {
            for (int j = i; j < elements.length; j++) {
                int d = Math.abs(elements[i] - elements[j]);
                if (d > maximumDifference)
                    this.maximumDifference = d;
            }
        }*/

        //Method 2:
        Arrays.sort(elements);
        this.maximumDifference = elements[elements.length - 1] - elements[0];

        //Method 3:
        int min = 99, max = 1;
        for (int i : elements){
            if (min > i)
                min = i;
        }
        for (int i : elements){
            if (max < i)
                max = i;
        }
        this.maximumDifference = max - min;
    }
}

public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

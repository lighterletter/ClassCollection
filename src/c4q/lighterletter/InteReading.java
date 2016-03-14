package c4q.lighterletter;

/**
 * Created by c4q-john on 11/22/15.
 */
public class InteReading {
    public static void main(String[] args) {

        System.out.println(test("01101",4));

    }
    public static int test(String s, int last) {
        if (last < 0) {
            return 0;
        }
        if (s.charAt(last) == '0') {
            return 2 * test(s, last-1);
        }
        return 1 + 2 * test(s, last-1);
    }
}

package c4q.lighterletter;

/**
 * Created by c4q-john on 11/21/15.
 */
public class heart {
    public static void main(String[] args) {
        String s1 = "To err";
        String s2 = "is human!";
        s1 = forgive(s1, s2);
        System.out.println(s1 + " " + s2);
    }
    private static  String forgive(String me, String you) {
        String heart = me.substring(0, you.length() - me.length());
        you = "" + you.charAt(me.length());
        int amount = heart.length();
        me = me.substring(amount + 2) + me.charAt(amount);
        heart += understanding(you, 2) + you + me;
        return heart;
    }
    private static char understanding(String you, int num) {
        return (char)(you.charAt(0) + num);

    }
}

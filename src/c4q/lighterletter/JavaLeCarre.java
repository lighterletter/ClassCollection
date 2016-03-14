package c4q.lighterletter;

/**
 * Created by c4q-john on 11/22/15.
 */
public class JavaLeCarre  {


    public static void main(String[] args) {
        run();
    }
    public static void run() {
        int tinker = 36;
        int tailor = 54;
        int soldier = smiley(tailor, tinker);
        System.out.println("soldier = " + soldier);
    }
    private static int smiley(int tinker, int tailor) {
        int poorMan = guillam(tinker, tailor);
        System.out.println("poorMan = " + poorMan);
        int beggarMan = guillam(tailor + 9, tinker / 9);
        System.out.println("beggarMan = " + beggarMan);
        return poorMan + beggarMan;
    }
    private static int guillam(int karla, int mundt) {
        karla %= 10;
        mundt /= 10;
        return 100 * karla + mundt;
    }
}

class AbrahamJava {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int abraham = 12;
        int maryTodd = 56;
        thirteenthAmendment(maryTodd, abraham);
        System.out.println("abraham = " + abraham);
        System.out.println("maryTodd = " + maryTodd);
    }
    private static int thirteenthAmendment(int abraham, int maryTodd) {
        int robert = abraham % 10 + maryTodd / 10;
        System.out.println("robert = " + robert);
        System.out.println("abraham = " + abraham);
        edwinStanton(robert, abraham + maryTodd);
        edwinStanton(robert, abraham + maryTodd);
        abraham = thaddeusStevens(maryTodd, robert);
        System.out.println("abraham = " + abraham);
        return abraham;
    }
    private static void edwinStanton(int maryTodd, int abraham) {
        maryTodd = (abraham - maryTodd);
        System.out.println("maryTodd = " + maryTodd);
    }
    private static int thaddeusStevens(int maryTodd, int abraham) {
        System.out.println("maryTodd = " + maryTodd);
        return abraham;
    }
}
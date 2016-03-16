package c4q.lighterletter.CodingBat;

/**
 * Created by c4q-john on 3/16/16.
 */
public class MinCat {


    public static void main(String[] args) {
        System.out.println(minCat("hello","hi"));
        System.out.println(minCat("hello","java"));
        System.out.println(minCat("java ","hello"));
        System.out.println(minCat("pineapples","berries"));
        System.out.println(minCat("space","math"));
        System.out.println(minCat("data","structure"));
        System.out.println(minCat("vector","angle"));


    }

    public static String minCat(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();

        if( lengthA == lengthB  ){
            return a + b;
        }

        if (lengthA > lengthB){
            return a.substring(a.length()- lengthB, lengthA) + b;
        }

        return a + b.substring(b.length()-a.length());

    }
}

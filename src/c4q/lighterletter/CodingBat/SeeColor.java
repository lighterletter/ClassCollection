package c4q.lighterletter.CodingBat;

/**
 * Created by c4q-john on 3/16/16.
 *
 * Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
 * seeColor("redxx") → "red"
 * seeColor("xxred") → ""
 * seeColor("blueTimes") → "blue"
 */
public class SeeColor {

    public static void main(String[] args) {
        System.out.println(seeColor("bluexx"));
        System.out.println(seeColor("redxx"));
        System.out.println(seeColor("light"));
        System.out.println(seeColor("vectors"));
        System.out.println(seeColor("math"));
        System.out.println(seeColor("re"));
        System.out.println(seeColor(""));
        System.out.println(seeColor("blu"));
        System.out.println(seeColor("akdj ieb"));
    }

    public static String seeColor(String str) {

        if(str.length() < 3 ){
            return "";
        }

        if(str.substring(0,3).equals("red")) {
            return "red";
        } else if (str.length() >= 4 && str.substring(0,4).equals("blue")) {
            return "blue";
        }
        return "";
    }
}

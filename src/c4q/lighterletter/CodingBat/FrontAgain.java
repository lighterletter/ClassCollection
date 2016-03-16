package c4q.lighterletter.CodingBat;

/**
 * Created by c4q-john on 3/16/16.

 Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited"

 frontAgain("edited") → true
 frontAgain("edit") → false
 frontAgain("ed") → true

 */
public class FrontAgain {


    public static void main(String[] args) {
        System.out.println(frontAgain("edit"));
        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("jj"));
        System.out.println(frontAgain("jjjk"));
        System.out.println(frontAgain("jjjj"));
        System.out.println(frontAgain("ed"));
        System.out.println(frontAgain("javaja"));
    }

    public static boolean frontAgain(String str) {
        if(str.length() < 2){
            return false;
        }
        if(str.substring(0,2).equals(
                str.substring(str.length()-2,str.length()))){
            return true;
        }
        return false;
    }

}

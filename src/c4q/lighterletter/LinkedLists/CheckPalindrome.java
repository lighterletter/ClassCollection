package c4q.lighterletter.LinkedLists;

/**
 * Created by c4q-john on 3/23/16.
 */
public class CheckPalindrome {

    static Palindrome pal;


    public static void main(String[] args) {


        String word = "racecar";

        pal = new Palindrome(word.charAt(0));


        for(int i = 1; i <= word.length()-1; i++){
            pal.add(word.charAt(i));
        }

        System.out.println(pal.isPalindrome());


    }

}

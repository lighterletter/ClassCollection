package c4q.lighterletter;

/**
 * Created by c4q-john on 11/17/15.
 */
public class Parenthesis {

    public static void main(String[] args) {

        System.out.println(isBalanced("()()"));

        System.out.println();

        System.out.println(balancedP("()"));
        System.out.println("((()))");


    }
    public static  boolean isBalanced(String string){

        if (string == null || string.length() <= 0 ){
            return true;
        }

        char firstLetter = string.charAt(0);
        String restOfWord = string.substring(1);

        if (firstLetter == '(' ){
            restOfWord = restOfWord.replaceFirst("\\)","");
            string = restOfWord;
            return isBalanced(string);
        }
        return false;
    }

    public static boolean balancedP( String str){
        int count = 0;

        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == '('){
                count++;
            }
            if(str.charAt(i) == ')' && count >= 1 ){
                count--;
            }
        }

        if(count == 0) {return true;}

        return false;
    }
}
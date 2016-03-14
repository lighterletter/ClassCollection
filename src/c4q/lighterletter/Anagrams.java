package c4q.lighterletter;

/**
 * Created by c4q-john on 3/14/16.
 */
public class Anagrams {

    public static void main(String[] args) {


        System.out.println(checkAnagram("listen","silent"));
        System.out.println(checkAnagram2("listen","silent"));

        System.out.println();

        System.out.println(checkAnagram("meow","weoap"));
        System.out.println(checkAnagram2("meow","weoap"));

        System.out.println();


    }

    public static boolean checkAnagram(String str1, String str2 ){

        if(str1.length() != str2.length()){return false;}

        int count = 0;

        for(int i = 0; i < str1.length(); i++){
            for(int k = 0;k <  str2.length(); k++){

                if(str1.charAt(i) == str2.charAt(k)){ count++;}
            }
        }

        if(count == str1.length()){ return true;}

        return false;
    }

    public static boolean checkAnagram2(String str1, String str2){

        if(str1.length() != str2.length())
            return false;

        char[] firstString = str1.toCharArray();
        char[] secondString = str2.toCharArray();

        java.util.Arrays.sort(firstString);
        java.util.Arrays.sort(secondString);

        for(int i = 0; i < firstString.length; i++){
            if(firstString[i] != secondString[i]){
                return false;
            }
        }

        return true;
    }

}

package c4q.lighterletter;

/**
 * Created by c4q-john on 11/21/15.
 */
public class Mystery {

    public static void main(String[] args) {

        System.out.println(mystery("abcdefg"));

    }
    private static String mystery(String s){
        String result = "";
        int len = s.length();
        int j = 0;
        int k = 9;

        while(j <k ){
            if (j<4){
                result += s.charAt(k % len);
            }
            if (j/2 != 1){
                result += s.charAt( j % len);
            }
            j++;
            k--;
        }
        return result;
    }
}

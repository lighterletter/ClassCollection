package c4q.lighterletter;

/**
 * Created by c4q-john on 11/24/15.
 */
public class MaxArrayValue {
    public static void main(String[] args) {
        int[] array = { 5,3,2,1,6,7,4,3,8,9};

        System.out.println(maxArrayValue(array));

    }

    public static int maxArrayValue(int[] b ){

        int max = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i]>max){
                max = b[i];
            }
        }
        return max;
    }
}

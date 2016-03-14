package c4q.lighterletter;

/**
 * Created by c4q-john on 11/24/15.
 *
 * Write a method that accepts an int[] and returns a new, reversed array rather than modifying its argument in place.
 *
 *
 */
public class Arrays {


    public static void reverseInPlace(int[] arr){
        for (int i =0; i < arr.length /2; i++){
            int shift = arr[i];
            arr[i] = arr[arr.length -1 - i];
            arr[arr.length -1 - i] = shift;
        }
    }

    public static int[] returnNewReversed(int[] a ){
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[a.length -1 - i] = a[i];
        }
        return b;
    }

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int[] b = returnNewReversed(a);

        reverseInPlace(a);

//        for( int i : b){
//            System.out.print( i + " ");
//        }
        System.out.println();
        for ( int c : a){
            System.out.print( c + " ");
        }



    }



}

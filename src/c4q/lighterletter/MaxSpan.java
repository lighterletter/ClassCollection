package c4q.lighterletter;

/**
 * Created by c4q-john on 3/18/16.
 *Consider the leftmost and righmost appearances of some value in an array.
 * We'll say that the "span" is the number of elements between the two inclusive.
 * A single value has a span of 1. Returns the largest span found in the given array. (
 * Efficiency is not a priority.)

 Example:

 maxSpan({1, 2, 1, 1, 3}) → 4
 maxSpan({1, 4, 2, 1, 4, 1, 4}) → 6
 maxSpan({1, 4, 2, 1, 4, 4, 4}) → 6

 *
 */
public class MaxSpan {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 1, 1, 3};//4
        int[] arr2 = {1, 4, 2, 1, 4, 1, 4};//6
        int[] arr3 = {1, 4, 2, 1, 4, 4, 4};//6
        int[] arr4 = {3, 3, 3};//3
        int[] arr5 = {3, 3};//2

        System.out.println(maxSpan(arr1));
        System.out.println(maxSpan(arr2));
        System.out.println(maxSpan(arr3));
        System.out.println(maxSpan(arr4));
        System.out.println(maxSpan(arr5));

    }


    public static  int maxSpan(int[] nums) {

        int counter = 0;
        int largest = 0;

        for(int i =0; i < nums.length; i++){
            for(int j =0; j < nums.length; j++){

                if(nums[i] == nums[j]){
                    counter++;
                }
            }

            if(counter >= largest){
                largest = counter;
                counter = 0;

                if(largest > nums.length){
                    largest = nums.length-1;
                }
            }
        }

        return largest;

    }
}

package com.cj.learn.corejava;

import java.util.Arrays;

public class EvenOddSeparator 
{
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        separateEvenOdd(array);
        System.out.println("Array after separation: " + Arrays.toString(array));
    }

    public static void separateEvenOdd(int[] array) {
        int[] result = new int[array.length];
        int evenIndex = 0;
        int oddIndex = array.length - 1;

        for (int num : array) {
            if (num % 2 == 0) {
                result[evenIndex++] = num;
            } else {
                result[oddIndex--] = num;
            }
        }

        // Copy the result array back to the original array
        
        for (int i = 0; i < array.length; i++) 
        {
            array[i] = result[i];
        }
        
      //System.arraycopy(result, 0, array, 0, array.length);
    }
}

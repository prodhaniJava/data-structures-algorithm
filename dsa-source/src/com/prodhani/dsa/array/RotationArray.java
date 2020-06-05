package com.prodhani.dsa.array;

import com.prodhani.util.AlgoUtil;

import java.util.Arrays;
// Java program to rotate an array by d elements
public class RotationArray {

    public static void main(String[] args) {
       int by =4;
        rotatateByTempArrayStore(by);
        rotatateByOne(by);
        rotatateByJugglingAlgo(by);
        rotatateReversalAlgo(by);
    }


    private static void rotatateByTempArrayStore(int by){
        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("***********************************************");
        System.out.println("given array : "+ Arrays.toString(intArray));

        int[] tempArray = Arrays.copyOfRange(intArray, 0,by );
        int index = 0;
        for(;index<intArray.length-by ;index++){
            intArray[index] = intArray[index+by];
        }
        for(int temp=0;temp<tempArray.length ;index++,temp++){
            intArray[index] = tempArray[temp];
        }
        System.out.println("required array by rotatateByTempArrayStore: "+Arrays.toString(intArray));
        System.out.println("Time complexity : O(n )");
        System.out.println("Auxiliary Space : O(d)");
        System.out.println("***********************************************");
    }

    /**
     * rotate  one by one with left rotation
     *
     * @param by
     */
    private static void rotatateByOne(int by){

        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("***********************************************");
        System.out.println("given array : "+ Arrays.toString(intArray));
        int size = intArray.length;
        int i, temp;
        for(int index=0;index<by ;index++){

            temp = intArray[0];
            for (i = 0; i < size - 1; i++){
                intArray[i] = intArray[i + 1];
            }
            intArray[i] = temp;
        }
        System.out.println("required array rotatateByOne : "+Arrays.toString(intArray));
        System.out.println("Time complexity : O(n * d)");
        System.out.println("Auxiliary Space : O(1)");
        System.out.println("***********************************************");
    }


    private static void rotatateByJugglingAlgo(int by){
        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("***********************************************");
        System.out.println("given array : "+ Arrays.toString(intArray));

        int gcd = AlgoUtil.getGCM(intArray.length,by);
        int i, j, k, temp;
        int size = intArray.length;
        for(int index = 0;index<gcd ;index++){
            temp = intArray[index];
            j=index;
            while(true){
                k = j+by;
                if (k >= size)
                    k = k - size;
                if (k == index)
                    break;
                intArray[j] = intArray[k];
                j = k;
                System.out.println(Arrays.toString(intArray)+" :"+j);
            }
            intArray[j] = temp;

            System.out.println(" index "+index+Arrays.toString(intArray));

        }

        System.out.println("required array by rotatateByGCM: "+Arrays.toString(intArray));
        System.out.println("Time complexity : O(n )");
        System.out.println("Auxiliary Space : O(1)");
        System.out.println("***********************************************");
    }

    private static void rotatateReversalAlgo(int by){

        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("***********************************************");
        System.out.println("given array : "+ Arrays.toString(intArray));
        AlgoUtil.rvereseArray(intArray,0,by-1);
        System.out.println("First reserval : "+Arrays.toString(intArray));
        AlgoUtil.rvereseArray(intArray,by,intArray.length-1);
        System.out.println("second reserval : "+Arrays.toString(intArray));
        AlgoUtil.rvereseArray(intArray,0,intArray.length-1);
        System.out.println("required array rotatateReversalAlgo : "+Arrays.toString(intArray));
        System.out.println("Time complexity : O(n )");
        System.out.println("Auxiliary Space : ");
        System.out.println("***********************************************");
    }



}


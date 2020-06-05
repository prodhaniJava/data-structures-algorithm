package com.prodhani.sort;

import com.prodhani.util.AlgoUtil;

public class InsertionSort {

	public static void main(String[] args) {
		Integer[] intArray = {10,20,90,5,50,40,100,70};
		insertionSort(intArray);
		Integer[] intArray1 = {10,20,90,30,50,40,100,70};
		insertionSort(intArray1);
		
		Integer[] sortedArray = {10,20,30,40,50,70,90,100};
		insertionSort(sortedArray);
	}
	
	public static void insertionSort(Integer[] intArray){
		
		 for(int i=1;i<intArray.length;i++){
			    int j = i-1;
			    int x = intArray[i];
			    while(j>-1 && intArray[j]>x){
			    	intArray[j+1] = intArray[j];
			    	j--;
			    }
			    intArray[j+1] =x;
			  
		 }
		 AlgoUtil.traverseArray(intArray);
	}
	
 
}

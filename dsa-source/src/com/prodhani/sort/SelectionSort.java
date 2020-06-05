package com.prodhani.sort;

import com.prodhani.util.AlgoUtil;

public class SelectionSort {
	
	public static void main(String[] args) {
		Integer[] intArray = {10,20,90,5,50,40,100,70};
		selectionSort(intArray);
		Integer[] intArray1 = {10,20,90,30,50,40,100,70};
		selectionSort(intArray1);
		
		Integer[] sortedArray = {10,20,30,40,50,70,90,100};
		selectionSort(sortedArray);
	}
	
	public static void selectionSort(Integer[] intArray){
		int i,j,k;
		 for(i=0;i<intArray.length;i++){
			    for(j=k=i;j<intArray.length;j++){
			    	if(intArray[k]>intArray[j]){
			    		k = j;
			    	}
			    }
			    if(i!=k){
			    	int temp = intArray[k];
			    	intArray[k] = intArray[i];
			    	intArray[i] = temp;
			    }
		 }
		 AlgoUtil.traverseArray(intArray);
	}
 
}

package com.prodhani.sort;

import com.prodhani.util.AlgoUtil;

public class BubbleSort {

	public static void main(String[] args) {
		Integer[] intArray = {10,20,90,30,50,40,100,70};
		bubleSort(intArray);
		Integer[] intArray1 = {10,20,90,30,50,40,100,70};
		adaptiveBubleSort(intArray1);
		
		Integer[] sortedArray = {10,20,30,40,50,70,90,100};
		adaptiveBubleSort(sortedArray);
		
	}
	
	
	public static void bubleSort(Integer[] intArray){
		 for(int i=0;i<intArray.length-1;i++){
			  for(int j=0;j<intArray.length-1-i;j++){
				  if(intArray[j]>intArray[j+1]){
					  int temp = intArray[j+1];
					  intArray[j+1] = intArray[j];
					  intArray[j] = temp;
				  }
			  }
			  
		 }
		 AlgoUtil.traverseArray(intArray);
	}
	
   /**
    * if already pass it shud understand just a single sort. shud not proceed further.
    * @param intArray
    */
	public static void adaptiveBubleSort(Integer[] intArray){
		 for(int i=0;i<intArray.length-1;i++){
			 boolean  isAdaptive = true;
			 System.out.print("Pass : "+(i+1) +" Comp : ");
			  int k = 0;
			  for(int j=0;j<intArray.length-1-i;j++){
				  if(intArray[j]>intArray[j+1]){
					  int temp = intArray[j+1];
					  intArray[j+1] = intArray[j];
					  intArray[j] = temp;
					  isAdaptive = false;
					  System.out.print((++k)+" ");
				  }
			  }
			  System.out.println();
			  if(isAdaptive){
				  break;
			  }
		   }
		 AlgoUtil.traverseArray(intArray);
	}
}

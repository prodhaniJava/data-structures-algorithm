package com.prodhani.sort;

import com.prodhani.util.AlgoUtil;

public class QuickSort {

  public static void main(String[] args) {
		Integer[] intArray = {10,20,30,40,50,200,60,70,80,90,100}; // 10,20,1,40,50,2,60,70,80,90,100
		quickSortByStartPivot(intArray, 0, intArray.length-1);
		//quickSortByEndPivot(intArray, 0, intArray.length-1);
		//quickSortbyMidPivot(intArray, 0, intArray.length-1);
		AlgoUtil.traverseArray(intArray);
  }	
  static void	quickSortbyMidPivot(Integer[] arrayInt ,int low,int high){
	  
	  if(low<high){
		  int partionPostion = getpartionPostionForMidPivot(arrayInt,low,high);
		  quickSortbyMidPivot(arrayInt, low, partionPostion);
		  quickSortbyMidPivot(arrayInt, partionPostion+1, high);
	  }
  }
  
  static int getpartionPostionForMidPivot(Integer[] arrayInt,int low,int high){
	  int mid = (low+high)/2;
	  int pivot = arrayInt[mid];
	  int i=low;
	  int j=high;
	  for(;i<j;){
		  if(arrayInt[i]<=pivot){
			  i++;
		  }
		  if(arrayInt[j]>pivot){
			  j--;
		  }
		  if(arrayInt[j]<pivot && pivot<arrayInt[i] && i<j){
			  int temp = arrayInt[i];
			  arrayInt[i] = arrayInt[j];
			  arrayInt[j] = temp;
			  i++;
			  j--;
		  }
	  }
	  int temp = arrayInt[j];
	  arrayInt[j] = pivot;
	  arrayInt[mid] = temp;
	  return j;
  }
 static void	quickSortByEndPivot(Integer[] arrayInt ,int low,int high){
	  
	  if(low<high){
		  int partionPostion = getpartionPostionPivotingEnd(arrayInt,low,high);
		  quickSortByEndPivot(arrayInt, low, partionPostion-1);
		  quickSortByEndPivot(arrayInt, partionPostion+1, high);
	  }
  }
  static int getpartionPostionPivotingEnd(Integer[] arrayInt,int low,int high){
	  int pivot = arrayInt[high];
	  int i = low-1;
	  for(int j=low;j<high;j++){
		  if(arrayInt[j]<pivot){
			  i++;
			  int temp = arrayInt[i];
			  arrayInt[i] = arrayInt[j];
			  arrayInt[j] = temp;
			  
		  }
	  }
      int temp = arrayInt[i+1]; 
      arrayInt[i+1] = arrayInt[high]; 
      arrayInt[high] = temp; 
      System.out.println(" pivot "+pivot);
      AlgoUtil.traverseArray(arrayInt);
      return i+1; 
  }
  
static void	quickSortByStartPivot(Integer[] arrayInt ,int low,int high){
	  
	  if(low<high){
		  int partionPostion = getpartionPostionPivotingStart(arrayInt,low,high);
		  quickSortByStartPivot(arrayInt, low, partionPostion-1);
		  quickSortByStartPivot(arrayInt, partionPostion+1, high);
	  }
  }
  static int getpartionPostionPivotingStart(Integer[] arrayInt,int low,int high){ // 10,20,90,2,50,40,5,70     10,2,5,20,50,40,90,70
	  int pivot = arrayInt[low];
	  int i = low;
	  for(int j=low;j<high;j++){
		  if(arrayInt[j]<pivot){
			  i++;
			  int temp = arrayInt[i];
			  arrayInt[i] = arrayInt[j];
			  arrayInt[j] = temp;
			  
		  }
	  }
      int temp = arrayInt[i]; 
      arrayInt[i] = arrayInt[low]; 
      arrayInt[low] = temp; 
      System.out.println(" pivot "+pivot);
      AlgoUtil.traverseArray(arrayInt);
      return i; 
  }
  

  
  
}

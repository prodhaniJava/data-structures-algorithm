package com.prodhani.dsa.math;

public class PermutationCombination {

	static char[] charArray = "ABC".toCharArray();
	static int[] index = {0,0,0};
	static char[] resul = new char[charArray.length];
	public static void main(String[] args) {
		perm1(charArray, 0);
		System.out.println("****************************");
		perm2(charArray, 0,2);
	}
	//method 1
	static void  perm1(char[] charArray,int k){
		if(charArray.length==k){
			System.out.println(resul);
		}else{
			for(int i=0;i<charArray.length;i++){
				if(index[i]==0){
					resul[k]=charArray[i];
					index[i]=1;
					perm1(charArray, k+1);
					index[i]=0;
				}
			}
		}
	}
	
	// method2
	static void  perm2(char[] charArray,int l,int h){
		if(l==h){
			System.out.println(charArray);
		}else{
			for(int i=l;i<=h;i++){
				swap(charArray, l, i);
				perm2(charArray, l+1, h);
				swap(charArray, l, i);
			}
		}
	}
	
	static void swap(char[] charArray,int l,int i){
		char temp = charArray[l];
		charArray[l] = charArray[i];
		charArray[i] = temp;
	}
	
}

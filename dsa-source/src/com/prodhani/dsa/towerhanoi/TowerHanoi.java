package com.prodhani.dsa.towerhanoi;

public class TowerHanoi {

	public static void main(String[] args) {
		towerHanoi(4, "A", "B", "C");
	}
	
	static void towerHanoi(int noPlate,String source,String auxiury,String target){
		
		if(noPlate>0){
			int towerPlate = noPlate-1;
			towerHanoi(towerPlate, source, target,auxiury );
//			if(towerPlate>0)
			System.out.println(noPlate+"-"+source +"-"+target);
			towerHanoi(towerPlate, auxiury, source,target );
		}
		
	}
}

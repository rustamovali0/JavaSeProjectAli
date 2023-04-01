package ders9.homework.izah;

import java.util.Arrays;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		int original[] = {10,7,8,4,7,3,8,7,1,4};
		int[] m1 = new int [original.length];
		int[] m2 = new int [original.length];
		Arrays.sort(original);
		int element =original[0];
		for (int i = 1; i < original.length; i++) {
			element=original[i];
			int findedIndex=findNumberInArray(original, element,i+i);
			if(findedIndex==-1) {
				
			}else {
				
			}
			
			
		}
		

	}

	static int findNumberInArray(int[] array,int number,int fromIndex) {
	
		int result=-1;
		for(int i=fromIndex;i<array.length;i++) {
			if(array[i]==number) {
				result=i;
				break;
			}
		}
		
		
		
		return 0;
	}
	
}

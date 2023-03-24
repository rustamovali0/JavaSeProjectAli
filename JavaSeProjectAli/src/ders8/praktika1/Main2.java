package ders8.praktika1;

public class Main2 {
public static void main(String[] args) {
	
	int[] massiv = {6,3,5,1,0,11,9,8};
	//cem
	int cem=0;
	for(int i:massiv) {
		cem+=i;
	}
	//System.out.println(cem);
	//System.out.println(cem/massiv.length);
	for(int i:massiv) {
		boolean result = sadedirmi(i);
		if(result) {
			System.out.println(i);
		}
	}
	}
 static boolean sadedirmi(int eded) {
	 boolean sadedir=true;
	 for (int i = 2; i <= eded-1; i++) {
		 if(eded%i==0) {
			 sadedir=false;
			 break;
		 }
	}
	 return sadedir;
 }}

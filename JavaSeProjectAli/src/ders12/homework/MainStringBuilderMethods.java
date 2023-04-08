package ders12.homework;

public class MainStringBuilderMethods {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		System.out.println("capasity : " + sb.capacity());
		System.out.println("isEmpty : " + sb.isEmpty());
		System.out.println("value : " + sb);
		//sb.append(false);
		sb.append("Developia");
		System.out.println("value : " + sb);
		System.out.println("capasity : " + sb.capacity());
		System.out.println("isEmpty : " + sb.isEmpty());
        char[] charArray= {'A','B','C','D','E'};
		sb.append(charArray, 2, 2);
		System.out.println("charAt ; "+sb.charAt(3));
		System.out.println("length ; "+sb.length());
		System.out.println("capacity ; "+sb.capacity());
		sb.delete(3, 5);
		System.out.println("delete ; "+sb);
        sb.insert(3, false);
		System.out.println("insert ; "+sb);
        sb.replace(3, 7, "Phyton");
		System.out.println("replace ; "+sb);
		sb.reverse();
		System.out.println("reverse ; "+sb);
		sb.setCharAt(2, 'A');
		System.out.println("setCharAt ; "+sb);
		sb.setLength(10);
		System.out.println("setLength ; "+sb);
        System.out.println("subSequence ; "+sb.subSequence(3, 6));		
		
		
		
		
		
		
		
		
		
		
	}

}

package org.lessons.java.ciclable;

public class Main {

	public static void main(String[] args) {
	
		int numList[] = {0,1,2,3,4,5,6,7,8,9};
		
		IntContainer numbers = new IntContainer(numList);
		
		
		for(int i = 0; i < numbers.getIntArray().length; i++) {
			
			
			System.out.println(numbers.getNextNumber());
			
			if(numbers.hasStillElements()) {
				
				System.out.println("L'array ha ancora elementi da restituire\n");
			}else {
				
				System.out.println("L'array non ha più elementi da restituire\n");
			}
			
		}
		
		
		
		//Create a new IntContainer object and populate it with the addElement method
		
		
		IntContainer numbers2 = new IntContainer();
		
		numbers2.addElement(37);
		numbers2.addElement(15);
		numbers2.addElement(18);
		
		
		System.out.println("SECONDA STAMPA\n");
		
		for(int i = 0; i < numbers2.getIntArray().length; i++) {
			
			
			System.out.println(numbers2.getNextNumber());
			
			if(numbers2.hasStillElements()) {
				
				System.out.println("L'array ha ancora elementi da restituire\n");
			}else {
				
				System.out.println("L'array non ha più elementi da restituire\n");
			}
			
		}

		
		

	}

}

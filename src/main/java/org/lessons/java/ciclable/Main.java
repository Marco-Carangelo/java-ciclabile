package org.lessons.java.ciclable;

public class Main {

	public static void main(String[] args) {
	
		int numList[] = {0,1,2,3,4,5,6,7,8,9};
		
		IntContainer numbers = new IntContainer(numList);
		
		
		for(int i = 0; i < numList.length; i++) {
			
			
			if(numbers.hasStillElements()) {
				
				System.out.println("L'array ha ancora elementi in coda");
			}else {
				
				System.out.println("L'array non ha più elementi in coda\nUlteriori elaborazioni faranno ripartire il ciclo dalla prima posizione");
			}
			
			System.out.println(numbers.getNextNumber());
			
		}

		
		

	}

}

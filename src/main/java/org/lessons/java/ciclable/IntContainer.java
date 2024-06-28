package org.lessons.java.ciclable;

public class IntContainer {
	
	//Class fields
	
	private int intArray[];
	private int index= 0;

	//Class Constructor
	
	public IntContainer(int[] intArray) {
		
		this.intArray = intArray;
		
	}
	
	//Getters and setters
	
	public int[] getIntArray() {
		return intArray;
	}

	public void setIntArray(int[] intArray) {
		this.intArray = intArray;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	//Class methods
	
	public int getNextNumber() {
		
		int number = this.intArray[getIndex()];
		
		if(index < this.intArray.length - 1) {
			
			setIndex(this.index + 1 );
			
		}else {
			
			setIndex(0);
		
		}
		
		return number;
	}
	
	
	public boolean hasStillElements() {
		
		boolean stillElements;
		
		if(index < this.intArray.length - 1) {
			
			stillElements = true;
			
		}else {
			
			stillElements = false;
			
		}
		
		return stillElements;
	}
	
	
	
	
	

}

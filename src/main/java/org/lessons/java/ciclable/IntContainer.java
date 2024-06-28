package org.lessons.java.ciclable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntContainer {
	
	//Class fields
	
	private int intArray[];
	private int index= 0;

	//Class Constructor
	
	public IntContainer(int[] intArray) {
		
		this.intArray = intArray;
		
	}
	
	public IntContainer() {
		
		this.intArray = new int[0];
		
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
	
	public void addElement(int newInt) {
		
		int newIntArray[] = new int[intArray.length + 1];
		
		for(int i = 0; i < intArray.length; i++) {
			
			newIntArray[i] = intArray[i];

		}
		
		newIntArray[newIntArray.length - 1] = newInt;
		
		intArray = newIntArray;
		
	}
	
	
	
	
	
	
	
	//Method created only to experiment with Java collection concepts
	
//	public void addElementLongWay(int newInt) {
//		
//		ArrayList<Integer> intList = new ArrayList<Integer>();
//		
//		for(int i = 0; i < intArray.length ; i++)
//		{
//			
//			intList.add(Integer.valueOf(intArray[i]));
//			
//		}
//		
//		intList.add(Integer.valueOf(newInt));
//		
//		int newList[] = new int[intList.size()];
//		
//		for(int i = 0; i < newList.length ; i++)
//		{
//			
//			newList[i] = intList.get(i);
//			
//		}
//		
//		intArray = newList;
//	
//		
//	}
	
	

}

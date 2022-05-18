package com.BridgeLabs.day14;

public class TestStack {
	public static void main(String[] args)
	{
		Stack Stack = new Stack();
		Stack.insert(56);
		Stack.insert(30);
		Stack.insert(70);
		
		Stack.display();
		Stack.peak();

		for (int i=0;i<4;i++){
			Stack.delete();	
		}
	}
}

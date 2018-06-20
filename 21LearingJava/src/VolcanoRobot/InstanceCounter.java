package VolcanoRobot;//pay attention to the package name that It shouldn't be a Upercase Character

import static java.lang.Math.*; //import the class in the package Math 

import java.sql.*;
import java.util.*;



public class InstanceCounter {
	private static int numInstance = 0;// class value
	
	protected static int getCount(){  //class method
		return numInstance;
	}
	
	private static void addInstance(){
		numInstance++;
	}
	
	InstanceCounter(){
		InstanceCounter.addInstance();
	}
	

	
	
	
	
	
	public static void main(String[] arguments){
		
		System.out.println("Staring with " + InstanceCounter.getCount()+" instance");
		
		for (int i = 0 ; i < 500; ++i){
			new InstanceCounter();
		}
		
		System.out.println("Created " + InstanceCounter.getCount() + " instance");
		
		System.out.println("PI: "+PI);
		System.out.println(" " + (PI *3));
		
		
		java.util.Date now= new java.util.Date();  //must tell which Method in the specific package name.
		
		System.out.println(now); //print the date now
	}
	

}

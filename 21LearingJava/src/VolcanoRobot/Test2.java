package VolcanoRobot;

import java.util.*;


public class Test2 extends TestFinalMethod { 
    
	public void f1(){     
	    System.out.println("Test1父类方法f1被覆盖!"); 
	} 
	public void f3(){
		System.out.println("test2 can override the father's Method");
	}
	

	
public static void main(String[] args) { 
    // TODO 自动生成方法存根 
	TestFinalMethod t1 = new TestFinalMethod();
	t1.f1();
	t1.f2();
	t1.f3();
	Test2 t2 = new Test2();
	t2.f1();
	t2.f2();
	t2.f3();
	
	// == and equal
	String s1 = new String("str");
	String s2 = new String("str");
	System.out.println("== compare:" + (s1 ==s2));
	System.out.println("equal compare:" + s1.equals(s2));
	
	String s3 = "str";
	String s4 = "str";  // auto inbox 
	System.out.println("== compare:" + (s3 ==s4));
	System.out.println("equal compare:" + s3.equals(s4));
	
	//vector 
	Vector v = new Vector(10);
	v.add("Jenny");
	v.add("Joe");
	v.add(0,"Pan");
	String st1 = (String)v.lastElement();
	boolean isThere = v.contains("web");
	int size = v.size();
	int cap = v.capacity();
	Iterator it = v.iterator();
	for (Iterator i = v.iterator() ; i.hasNext(); ){
		String name = (String) i.next();
		System.out.println("The element of " + i.hashCode() +" is " + name);
	}
	System.out.println("The last element is: " +st1);
	System.out.println("Is there cantaining the 'web' ? "+isThere);
	System.out.println("The capacity of the veector is :"+ cap);
	System.out.println("The size of the vector is :" +size);
	
	
	//stack
	Stack s = new Stack();
	s.push("One");
	s.push("two");
	s.push("three");
	
	String st2 = (String)s.pop();
	
	System.out.println("The element of the top pof of the stack is :" +(String)s.peek());
	
	int i = s.search("two");
	
	System.out.println(i); //return the distance to the top of the stack ,if don't exist,return -1
	//栈顶元素是two，返回1
	
	for (Iterator ie = s.iterator() ; ie.hasNext(); ){
		String name = (String) ie.next();
		System.out.println("The element of " + ie.hashCode() +" is " + name);
	}
	
	
	
	
} 
}

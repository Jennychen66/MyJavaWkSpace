package VolcanoRobot;

public class TestFinalMethod {

	
		public void f1() { 
		    System.out.println("f1"); 
		} 
		//无法被子类覆盖的方法 
		public final void f2() { 
		    System.out.println("f2"); 
		} 
		public void f3() { 
		    System.out.println("f3"); 
		} 
		private void f4() { 
		    System.out.println("f4"); 
		} 
		public static final int C = 80;
		public static final int D = 70;
		//final 
		//static 就是在整个类里面只有一个全局，没有this，
		//final 就是没有变化的，修饰方法不能被重写，修饰类不能被继承。


		
		
}

	


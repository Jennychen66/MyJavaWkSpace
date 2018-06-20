package VolcanoRobot;

public class city extends SuperTest {
	 String name ;
	 
	 String value(String name){
		 name ="Hefei";
		 System.out.println(name);
		 System.out.println(super.value("失败")); //super.value() 调用的是父类的value(),and return the name China  
		 return name;
	 }


public static void main(String[] args){
	city c= new city();
	System.out.println(c.value("失败"));//调用的是上面的子类的一个value()函数，return 的name 就是value中的name :Hefei
}


}

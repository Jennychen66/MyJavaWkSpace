package VolcanoRobot;

public class city extends SuperTest {
	 String name ;
	 
	 String value(String name){
		 name ="Hefei";
		 System.out.println(name);
		 System.out.println(super.value("ʧ��")); //super.value() ���õ��Ǹ����value(),and return the name China  
		 return name;
	 }


public static void main(String[] args){
	city c= new city();
	System.out.println(c.value("ʧ��"));//���õ�������������һ��value()������return ��name ����value�е�name :Hefei
}


}

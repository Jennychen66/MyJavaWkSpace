package VolcanoRobot;

import java.util.*;
public class ComicBooks {
	
	public ComicBooks(){ //方法后面加括号，是调用默认构造函数
		
	}
	
	public static void main(String[] arguments){
		//setup hashtable
		Hashtable quality = new Hashtable();
		float price1 = 3.00F;
		String status1 = "Mint";
		quality.put(status1, price1);
		float price2 = 2.00F;
		String status2 = "Near Mint";
		quality.put(status2, price2);
		float price3 = 1.50F;
		String status3 = "Very fine";
		quality.put(status3, price3);
		float price4 = 1.00F;
		String status4 = "Fine";
		quality.put(status4, price4);
		float price5 = 0.50F;
		String status5 = "Good";
		quality.put(status5, price5);
		float price6 = 0.25F;
		String status6 = "Poor";
		quality.put(status6, price6);
		
		//
		Comic[] comix = new Comic[3];
		
		comix[0]=new Comic("Amazing Spider-Man","1A","Very fine",9240.00F);
		comix[0].setPrice((Float)quality.get(comix[0].condition));
		
		comix[1] = new Comic("Incredible Hulk" , "181","Near Mint",1325.00F);
		comix[1].setPrice((Float)quality.get(comix[1].condition));
		
		comix[2] = new Comic("Cerebus" , "181","Good",45.00F);
		comix[2].setPrice((Float)quality.get(comix[2].condition));
		
		//
		for(int i=0; i< comix.length; i++){
			System.out.println( "title : " + comix[i].title );
			System.out.println( "issueNumber : " + comix[i].issueNumber );
			System.out.println( "condition : " + comix[i].condition );
			System.out.println( "basePrice : " + comix[i].basePrice );
			System.out.println( "price : $" + comix[i].price );
		}
		
		
	}
}
	class Comic{ //方法后面不加括号：调用默认构造函数或者默认复合构造函数
		String title;
		String issueNumber;
		String condition;
		float basePrice;
		float price;
		Comic(String intitle,String inissueNumber,String incondition,float inbasePrcie){
			title = intitle;
			issueNumber = inissueNumber;
			condition = incondition;
			basePrice = inbasePrcie;
			
		}
		
		void setPrice(float factor){
			price = factor * basePrice;
			
		}
		
		
		
	}



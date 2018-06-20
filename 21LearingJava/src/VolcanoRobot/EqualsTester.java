package VolcanoRobot;

public class EqualsTester {

	//@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1,str2;
		str1="Free the bound periodicals";
		str2=str1;
		
		System.out.println("String1:"+str1);
		System.out.println("String1:"+str2);
		System.out.println("Is same object?"+ (str1==str2)); //str1 str2指向的是同一个变量
		
		str2=new String(str1);
		
		System.out.println("String1:"+str1);
		System.out.println("String1:"+str2);
		System.out.println("Is same object?"+ (str1==str2)); //str1 str2指向的不是同一个变量
		System.out.println("Same value?" + str1.equals(str2));//str1 str2 值相同
		
		
		String [] players = new String[10];
		Integer[] series = new Integer[3];
		series[0] = new Integer(10);
		series[1] = new Integer(3);
		series[2] = new Integer(5);
		
		String[] titles = {"Mr.","Mrs.","Ms.","Miss","Dr."};
		int[] philadephia = new int[series.length];
		int[] total = new int [series.length];
		int average;
		
		philadephia[0]=250;
		philadephia[1]=290;
		philadephia[2]=380;
		
		total[0] = philadephia[0] + series[0];
		total[1] = philadephia[1] + series[1];
		total[2] = philadephia[2] + series[2];
		
		average =  (total[0] + total[1] + total[2])/3;
		
		
		System.out.format("%,d%n",total[0]);
		//switch practice
		Character grade = 'l';
		switch (grade){
		case 'A':
			System.out.println("Great job");
			break;
		case 'B':
			System.out.println("Good job");
			break;
		case 'C':
			System.out.println("Middle job");
			break;
		default:
			System.out.println("Bad job");
			break;
			
		}
		
		//break label
		
		key:
			for (int i=10;i>0;i--){
				for (int x=40;x<=50;x++){
					if(i * x++ > 400)
						break key;
					//using out label can break the circule to the outer loop
					//inner loop here
					
				}
				//outer loop here
				
			}
		
		System.out.println("break label practice");//break out 的话就直接跳到这层循环了
	
		
		int cc=Integer.parseInt("42");  // paraseInt():change the string "42" to  integer 
		
	} 
	
	
	
	


}

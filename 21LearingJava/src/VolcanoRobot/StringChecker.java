package VolcanoRobot;

public class StringChecker {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Nobody ever went broke by buying IBM";
		int account = 5005;
		double pi = Math.PI;
		System.out.println("The String is "+str);
		System.out.println("Length of String is "+str.length());
		System.out.println("The charactor of the String at position 5 is "
		+ str.charAt(5));
		System.out.println("The substring of String is "
		 +str.substring(26, 32));
		System.out.println("The index of the charactor 'v' in String is "
		 +str.indexOf('v'));
		System.out.println("The index of the begining of the "
		 +"substring \"IBM\":" +str.indexOf("IBM"));
		System.out.println("The string in uppercase:" + str.toUpperCase());
		
		System.out.println(account);
		System.out.format("Balance: $%,d\n",account); //%,d表示十进制数字
		
		System.out.format("%.11f%n",pi);

	}

}

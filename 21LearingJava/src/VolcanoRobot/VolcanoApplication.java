package VolcanoRobot;

public class VolcanoApplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VolcanoRobot dante = new VolcanoRobot();
		dante.status = "exploring";
		dante.speed = 2;
		dante.temperature = 510;
		dante.showAttributes();
		System.out.println("increase speed to 3");
		dante.speed = 3;
		dante.showAttributes();
		System.out.println("Changing the tempreture to 670");
		dante.showAttributes();
		System.out.println("Checking the tempreture");
		dante.checkTemperature();
		dante.showAttributes();
		
	
	}

}

package VolcanoRobot;

public class PrimeFinder implements Runnable {  //define a runnable jiekou ,implement needs to define the things myself.
	public long target;
	public long prime;
	public boolean finished = false;
	private Thread runner;
	
	PrimeFinder(long intarget){
		 target = intarget;
		 if (runner == null){
			 runner = new Thread(this);
			 runner.start();
		 }
		
	}
	
	public void run(){   //find the target's prime number
		long primeCount = 0;
		long candidate = 2;
		while(primeCount < target){
			if(isPrime(candidate)){
				primeCount++;
				prime = candidate;  //store the last prime number.
			}
			candidate++;
		}
		finished = true;
	}
	
	public Boolean isPrime(long checkNum){   //judge if this number is prime number
		double root = Math.sqrt(checkNum);
		for(int i=0;i<root;i++){
			if(checkNum % i == 0)
				return false;
		}
		return true;
	}

}

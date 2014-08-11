package com.edx.week5;

import java.util.Random;
import java.util.Scanner;

public class Rock {

	public static void main(String[] args) {
		
		String personPlay;
		String computerPlay="";
		int comptr;
		
		System.out.println("Enter Rock=R , Scissor=S, Paper=P");
		
		
		Scanner scan = new Scanner(System.in);
		personPlay=scan.next();
		personPlay =personPlay.toUpperCase();
		
		
		Random rndm= new Random();
		comptr=rndm.nextInt(3)+1;
		
		if(comptr==1)
			computerPlay="R";
		else if(comptr==2)
			computerPlay="P";
		else if(comptr==3)
			computerPlay="S";
		
		System.out.println("Person is playing :"+);
		
		if(personPlay.equals(computerPlay))
			System.out.println("Game is tie");
		else if(personPlay.equals("R"))
			if(computerPlay.equals("S"))
				System.out.println("You Win");
		else if(personPlay.equals("P"))
				if(computerPlay.equals("S"))
					System.out.println("Compter Win");
		else if(personPlay.equals("S"))
					if(computerPlay.equals("P"))
						System.out.println("You Win");
		else if(personPlay.equals("R"))
				if(computerPlay.equals("P"))
				System.out.println("Computer Win");
						
	}
}

// *******************************************************
// File Name: Task5_Election.java
// Author: Abigail Lueck
// Purpose:  Code to count votes in an election and 
// determine the winner overall, and of each area.
// *******************************************************
import java.util.Scanner;
public class Task5_Election {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Election Day Vote Counting Program");
		System.out.println();
		System.out.print("Are there any areas to process? (y/n)");
		char answer =  scan.next().charAt(0); 
		
		//Initializing data needed 
		int aVotes = 0, bVotes = 0;
		int areaA = 0, areaB = 0, ties = 0;
		
		if (answer == 'y')
		{
			while (answer == 'y') //Allows user to input multiple areas
			{
				System.out.println("Please enter the results from the next area");
				System.out.print("Votes for Mr. A: ");
				int mrA = scan.nextInt();
				aVotes = aVotes + mrA; //Counting votes from each area for A
				System.out.print("Votes for Mr. B: ");
				int mrB = scan.nextInt();
				bVotes = bVotes + mrB; //Counting votes from each area for B
				System.out.print("Are there any areas to process? ");
				answer =  scan.next().charAt(0); //Anything other than 'y' will go out of loop
				
				if(mrA > mrB)
					areaA++; //Adds a win to Mr A
				else if (mrA < mrB)
					areaB++; //Adds a win to Mr B
				else
					ties++; //If it is the same score 
				
			}
		}
		float totalVotes = aVotes + bVotes;
		float percentA = (aVotes / totalVotes) * 100;
		float percentB = (bVotes/ totalVotes) * 100;
		
		System.out.println();
		System.out.println("Mr. A's got " + aVotes + " votes or " + percentA + "%");
		System.out.println("Mr. B's got " + bVotes + " votes or " + percentB + "%");
		System.out.println("Mr. A won "+ areaA + " areas.");
		System.out.println("Mr. B won " + areaB + " areas.");
		System.out.println(ties + " areas were tied.");
		
		scan.close();	

	}

}

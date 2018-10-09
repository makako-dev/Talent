
import java.security.SecureRandom;
import java.util.ArrayList;

import java.util.Scanner;

public class AuditionTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		SecureRandom randomId = new SecureRandom();
		SecureRandom randomVolume = new SecureRandom();
		
		ArrayList<Performer> performers = new ArrayList<Performer>();
		ArrayList <Dancer> dancers = new ArrayList<Dancer>();
		ArrayList <Vocalist> vocalists = new ArrayList<Vocalist>();
		Audition audition =new Audition();
		
		System.out.println("Welcome to \"Who has Talent\"");
		System.out.println("The audition consists of 7 contestants; 4 performers, 2 dancers, and 1 vocalist.");
		System.out.println("");
		System.out.println("");
		
		
		//This adds 4 perfomers using a unique ID for each
		System.out.println("Adding Performers...");
		for (int i = 0; i < 4; i++) {
			int ranID = 1 + randomId.nextInt(1000);			
			performers.add(audition.addPerfomer(ranID));						
		}
		
		
		//This adds 2 dancers using a unique ID for each
		System.out.println("Adding Dancers...");
		for (int i = 0; i < 2; i++) {			
			System.out.println("Please provide the dancer's style of dance: "); //asks user to provide style of dance
			int ranID = 1 + randomId.nextInt(1000);
			String style = input.nextLine();					
			dancers.add(audition.addDancer(ranID,style));						
		}
		
		//This adds 2 dancers using a unique ID for each
		System.out.println("Adding Vocalist...");
		System.out.println("Is the vocalist performing at a volume? (y = yes/ n = no)"); //asks the user if vocalist will be performing at a given
		String answer = input.nextLine();                                                //volume Y/N
		
		
		//If no....
		if(answer.equalsIgnoreCase("n")) {
			int ranID = 1 + randomId.nextInt(1000);
			System.out.println("Please provide the vocalist's key:");//ask user to provide the vocalist's key
			String key = input.nextLine();
			vocalists.add(audition.addVocalist(ranID,key));
		}
		
		
		//if yes...
		if(answer.equalsIgnoreCase("y")) {
			int ranID = 1 + randomId.nextInt(1000);
			System.out.println("Please provide the vocalist's key:"); //ask user to provide the vocalist's key
			String key = input.nextLine();
			int ranVol = 1 + randomVolume.nextInt(10); //this generates random volume from 1 to 10
			vocalists.add(audition.addVocalist(ranID,key, ranVol));			
		}
		
		
		System.out.println(""); 
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		for (Performer performer : performers) { //Displays information for all perfomers
			performer.announce();			
		}
	
		for (Dancer dancer : dancers) { //Displays information for all dancers
			dancer.announce();
		}
		
		
		
		if(answer.equalsIgnoreCase("n")) { //Displays vocalist information (with Key only) if answer was "no"
			vocalists.get(0).announce();
		}
		
		if(answer.equalsIgnoreCase("y")) { //Displays vocalist information (with Key and Volume) if answer was "yes" 
			vocalists.get(0).announceWithKeyAndVolume();		
		}
		
		input.close();
						

	}
	
}

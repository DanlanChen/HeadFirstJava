package chapter5;
import java.util.Scanner;
class SimpleDotComTestDrive {
	public static void main(String[] args){
		int numOfGuess = 0;
		int startOfLocation = (int)( Math.random()*5);
		int[] locations = new int[3];
		int i =0;
		while( i < locations.length){
			locations[i] = startOfLocation;
			startOfLocation += 1;
			i += 1;
		}
		SimpleDotCom dot =  new SimpleDotCom();
		GameHelper helper = new GameHelper();
		//int[] locations = {2,3,4};
		dot.setLocationCells(locations);
		
		//String userGuess = "2";
		String userGuess;
		String result = "miss";
		//Scanner keyboard;
		boolean isalive = true;
		
		while(isalive == true){
			//keyboard = new Scanner(System.in);
			//System.out.println("Enter an interger");
			//userGuess = keyboard.nextLine();
			userGuess = helper.getUserInput("Please enter an integer:");
			result = dot.checkYourself(userGuess);
			numOfGuess++;
			if(dot.numOfHits == locations.length){
				isalive = false;
				System.out.println("you took " + numOfGuess +" "+"guesses");

			}
		}
		
		
	}

}

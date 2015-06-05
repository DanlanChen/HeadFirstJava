package chapter5;

class SimpleDotCom {
	int numOfHits = 0;
	int[] locationCells;
	
	int getNumOfHits(){
		return numOfHits;
	}
	
	int[] getLocationCells(){
		return locationCells;
	}
	void setLocationCells(int[] locations){
		locationCells = locations;
	}
	public String checkYourself(String stringGuess){
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		
		for(int cell: locationCells){
			if(guess == cell){
				result = "hit";
				numOfHits++;
				break;
			}
		}
		
		if(numOfHits == locationCells.length){
			result = "Kills";
		}
		System.out.println(result);
		return result;
	}

}

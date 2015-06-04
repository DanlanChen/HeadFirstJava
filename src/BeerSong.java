
public class BeerSong {
	public static void main(String[] args){
		int beerNum = 99;
		String word = "bottles";
		
		
		/*
		while (beernum > 1){
			System.out.println(beernum + " " + word + " "+"of beer on the wall, " + beernum + " " + word + " " +"of beer.");
			beernum = beernum - 1;
			if(beernum  == 1){
				word ="bottle";
			}
		    System.out.println("Take one down and pass it around, " + beernum  + " " + word + " " +"of beer on the wall");
		}
		if (beernum == 1){
			word = "bottle";
			System.out.println(beernum + " " + word + " "+"of beer on the wall, " + beernum + " " + word + " " +"of beer.");
		    System.out.println("Take one down and pass it around, " + "no more bottles of beer on the wall ");
		    beernum = beernum-1;

		}
		if(beernum == 0){
			System.out.println("No more bottles of beer on the wall, no more bottles of beer. ");
			System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
		}
		*/
		
		
		while( beerNum > 0){
			
			if (beerNum == 1){
				word = "bottle";
			}
			
			System.out.println(beerNum + " " + word + " of beer on the wall " ) ;
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down. " ) ;
			System.out .println( "Pass it around. ") ;
			beerNum = beerNum - 1;
			
			if (beerNum > 0) {
					System.out .println(beerNum + " " + word + " of beer on che wall " ) ;
			}
			else {
					System.out.println("No more bottles of beer on the wall ") ;
			} // end else
		}// end while loop
	}
}

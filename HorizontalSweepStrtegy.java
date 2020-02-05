/*
 Class Name: Horizontal Sweep Strategy
 Interface: SearchShips
 Purpose: This class implements the Horizontal Strategy which means it implements the linear search for finding the submarine and the 
 		  carriers and prints the number of cells searched for finding out the total submarines and carriers.
 */

public class HorizontalSweepStrtegy implements SearchShips{
	
	/*
	 function name: findships
	 arguments: game[][]
	 purpose: It is a functions which overrides the function of the Interface search ships.
	 */
	public void findShips(int game[][]) {
		int counter =0; // total number of cells searched
		int count = 0;
		String carr=""; // concatinating the carrier strings.
		String sub = ""; // concatinating the submarines strings.
		//System.out.println("Horizontal is implemented"+ game);
		for(int i=0 ; i<25; i++) {
			for(int j =0; j<25;j++) {
				if(game[i][j]==1) {
					//System.out.print(" Found Carrier at ("+i+","+j+") ");
					String a = "("+i+","+j+")";
					carr = carr.concat(a);
				}
				
				else if(game[i][j]==2) {
					//System.out.print(" Found submarine at ("+i+","+j+") ");
					String b = "("+i+","+j+")";
					sub = sub.concat(b);
					count++;
				}
				if(count==3) {
					break;
				}
				else {
				counter++;
				}
			}
			
		}
		System.out.println("Strategy: Horizontal Sweep");
		System.out.println("Number of cells searched: "+counter);
		System.out.print("Found Carrier at "+carr+";");
		System.out.println(" Found Sub at "+sub);
		
	}
	
}
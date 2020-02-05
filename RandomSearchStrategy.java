/*
 Class Name: Random Search Strategy
 Interface: SearchShips
 Purpose: This class RandomSearchStrategy implements the SearchShips interface and overrides the findships method. It implements the random 
  		  search strategy using the Random package in the Java.
 */


import java.util.Random;
public class RandomSearchStrategy implements SearchShips{
	public void findShips(int game[][]) {
		int count =0;
		int count1 = 0;
		int counter=0;
		String carr="";
		String sub = "";
		Random rand = new Random(); // object for Random Number Class.
		while(count!=5) {
			int a = rand.nextInt(25); // for generating numbers for searching.
			int b = rand.nextInt(25); // for generating numbers for searching.
			String c ="";
			if(game[a][b]==1) {
				c = "("+a+","+b+")";
				if(carr.contains(c)) {
				
			}
				else {
					carr = carr.concat(c);
					count++;
				}
			}
		
			counter++;
		}
		while(count1!=3) {
			int a = rand.nextInt(24);
			int b = rand.nextInt(24);
			String c ="";
			if(game[a][b]==2) {
				c = "("+a+","+b+")";
				if(sub.contains(c)) {
				
			}
				else {
					sub = sub.concat(c);
					count1++;
				}
			}
		
			counter++;
		}
		
		
		
		System.out.println();
		System.out.println("Strategy: Random Sweep");
		System.out.println("Number of cells searched: "+counter);
		System.out.print("Found Carrier at "+carr+";");
		System.out.println(" Found Sub at "+sub);
	}
	
}
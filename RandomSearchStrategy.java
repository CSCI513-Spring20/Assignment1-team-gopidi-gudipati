/*
 Class Name: Random Search Strategy
 Interface: SearchShips
 Purpose: This class implements the Random Search Strategy which means it randomly shuffles integers in an array and then loops in the array
 for finding the submarine and the  carriers and prints the number of cells where they were found and number of cells searched for finding out 
 the total submarines and carriers.
 */
import java.util.ArrayList;	//importing the arraylist package
import java.util.Collections;	//importing the collections package
public class RandomSearchStrategy implements SearchShips{
	public void findShips(int game[][]) {
		
		int count=0;	//initializing count for carrier
		int count1=0;	//initializing count for submarine
		int counter=0;	//initializing count to count cells
		String carr = "";	//initializing the string to store carrier values
		String sub ="";		//initializing the string to store submarine values
		ArrayList<Integer> list1 = new ArrayList<Integer>();	//initializing the list
		ArrayList<Integer> list2 = new ArrayList<Integer>();	//initializing the list
		for(int i=0;i<25;i++) {
			list1.add(new Integer(i));	//storing the values in the list
			list2.add(new Integer(i));	//storing the values in the list
		}
		Collections.shuffle(list1);	//Shuffling the list to create a list with random order numbers
		Collections.shuffle(list2);	
		
		for(int i=0;i<25;i++) {
			for(int j=0;j<25;j++) {	//loops to access the lists
				int a = list1.get(i);	//Assigning the numbers in the list 
				int b = list2.get(j);	//Assigning the numbers in the list
				if(game[a][b]==1 && count!=5) {		//if the positions assigned have the carrier and count is not equal to 5
					String c ="";	
					c = "("+a+","+b+")";	//Storing the positions in the string
					if(carr.contains(c)) {	//if the carrier string contains positions do nothing  
					
				}
					else {
						carr = carr.concat(c);	//if the carrier does not contain the positions concatenate it  
						count++;	//increase the count of carrier
					}
					counter++;	//increasing the counter for the cells
				}
				if(game[a][b]==2 && count1 !=3) {	//if the positions assigned have the submarine and count is not equal to 3
					String d ="";
					d = "("+a+","+b+")";	//Storing the positions in the string
					if(sub.contains(d)) {	//if the submarine string contains positions do nothing
					
				}
					else {	
						sub = sub.concat(d);	//if the carrier does not contain the positions concatenate it
						count1++;	//increase the count of submarine
					}
					counter++;	//increasing the counter for the cells
				}
				if(count+count1==8) {	//checking if the sum is equal to 8 and then breaking the loop
					break;
				}
				else {
				counter++;	//if the sum is not equal to 8 then increasing the counter
				}
			}
		}
		System.out.println();
		System.out.println("Strategy: Random Sweep");
		System.out.println("Number of cells searched: "+counter);
		System.out.print("Found Carrier at "+carr+";");
		System.out.println(" Found Sub at "+sub);
	}
	
}

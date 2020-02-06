/*Class Name: StrategicSearch
 * Interface: SearchShips
 * Purpose: This class implements the Strategic search,  it randomly shuffles integers in an array and then loops in the array to find a position of 
 * submarine or the carrier and then checks the row or the column of the point found.
 */
import java.util.ArrayList;
import java.util.Collections;

public class StrategicSearch implements SearchShips{
	public void findShips(int game[][]) {
		
		int count=0;	//initializing the count for carrier
		int count1=0;	//initializing the count for submarine
		int counter=0;	//initializing the count for no of cells searched
		String carr = "";	//initializing the string for carrier
		String sub ="";		//initializing the string for submarine
		ArrayList<Integer> list1 = new ArrayList<Integer>();	//initializing the list
		ArrayList<Integer> list2 = new ArrayList<Integer>();	
		for(int i=0;i<25;i++) {
			list1.add(new Integer(i));
			list2.add(new Integer(i));
		}
		Collections.shuffle(list1);	//Shuffling the list to create a list with random order numbers
		Collections.shuffle(list2);
		for(int j=0;j<25;j++) {		//loops to access the lists
			for(int k=0;k<25;k++) {
				int a = list1.get(j);	//Assigning the numbers in the list
				int b = list2.get(k);	//Assigning the numbers in the list
				if(game[a][b]==1&&count!=1) {	//if the positions assigned have the position of the carrier
					for(int i=0;i<24;i++) {		//looping to see the positions 
						if(game[a][i]==1&&game[a][i+4]==1) {	//Incrementing through the row to find the positions
							int g = i+4;
							carr = "("+a+","+i+") to ("+a+","+g+")";	
							count++;
							
						}
						else if(game[i][b]==1&&game[i+4][b]==1) {	//Incrementing through the column to find the positions
							int g = i+4;
							carr = "("+i+","+b+") to ("+g+","+b+")";
							count++;
						}
					}
				}
				else if(game[a][b]==2&&count1!=1) {	//if the positions assigned have the position of the carrier
					for(int i=0;i<24;i++) {	//looping to see the positions
						if(game[a][i]==2&&game[a][i+2]==2) {	//incrementing through row to find the positions of the sub
							int g = i+2;
							sub ="("+a+","+i+") to ("+a+","+g+")";	
							count1++;
							
						}
						else if(game[i][b]==2&&game[i+2][b]==2) {	//incrementing through column to find the positions
							int g = i+2;
							sub = "("+a+","+i+"to"+g+","+b+")";
							count1++;
						}
					}
				}
				if(count+count1==2) {	//Break the loop if the sum is 2
					break;
				}
				else {
					counter++;	//incrementing the count of cells searched
				}
			}
		}
		
		
		System.out.println();
		System.out.println("Strategy: Strategic Sweep");
		System.out.println("Number of cells searched: "+counter);
		System.out.print("Found Carrier at "+carr+";");
		System.out.println(" Found Sub at "+sub);
		
	}
	
}
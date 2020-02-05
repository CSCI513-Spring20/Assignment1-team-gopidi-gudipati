import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class StrategicSearch implements SearchShips{
	public void findShips(int game[][]) {
		Random rand = new Random();
		int count=0;
		int counter=0;
		String carr = "";
		String sub ="";
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for(int i=0;i<25;i++) {
			list1.add(new Integer(i));
			list2.add(new Integer(i));
		}
		Collections.shuffle(list1);
		Collections.shuffle(list2);
		
		for(int i=0;i<25;i++) {
			for(int j=0;j<25;j++) {
				int a = list1.get(i);
				int b = list2.get(j);
				if(game[a][b]==1) {
					String c = "("+a+","+b+")";
					carr = carr.concat(c);
					count++;
				}
				else if (game[a][b]==2) {
					String d = "("+a+","+b+")";
					sub = sub.concat(d);
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
		/*while(count!=5) {
			int a = rand.nextInt(25);
			int b = rand.nextInt(25);
			if(game[a][b]==1) {
				if(game[a][b+4]==1||game[a+4][b]==1) {
					int k = b+4;
					System.out.println("Founhd at"+a+","+b+" to "+a+","+k);
					count = 5;
				}
				else if(game[a][b+3]==1||game[a+3][b]==1) {
					int k = b-1;
					int l = b+3;
					System.out.println("Founhd at"+a+","+k+" to "+a+","+l);
					count =5;
				}
				else if(game[a][b+2]==1) {
					int k = b-2;
					int l = b+2;
					System.out.println("Founhd at"+a+","+k+" to "+a+","+l);
					count =5;
				}
				else if(game[a][b+1]==1) {
					int k = b-3;
					int l = b+1;
					System.out.println("Founhd at"+a+","+k+" to "+a+","+l);
					count =5;
				}
				else if(game[a][b]==1){
					int k = b-4;
					System.out.println("Founhd at"+a+","+k+" to "+a+","+b);
					count = 5;
					
				}
				
			}
		}*/
		System.out.println("Strategy: Horizontal Sweep");
		System.out.println("Number of cells searched: "+counter);
		System.out.print("Found Carrier at "+carr+";");
		System.out.println(" Found Sub at "+sub);
		
	}
	
}
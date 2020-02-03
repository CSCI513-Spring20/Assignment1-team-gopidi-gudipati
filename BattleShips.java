import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class BattleShips{
	static int [][]game1 = new int[25][25];
	static int [][]game2 = new int[25][25];
	static int [][]game3 = new int[25][25];
	int carrier =1;
	int submarine =2;
	public void startgame(){
	try {
		FileReader inputFile = new FileReader("src//input.txt");
		BufferedReader reader = new BufferedReader(inputFile);
			
			for(int i=0;i<=2;i++) {
				String line = reader.readLine();
			StringTokenizer tok = new StringTokenizer(line,"()");
			//System.out.println(line);
			for(int j=0;j<8;j++) {
				
				String ele1 = tok.nextToken();
				//System.out.println("Ele1 is"+ele1);
				StringTokenizer tok1 = new StringTokenizer(ele1,",");
				int ele11 = Integer.parseInt(tok1.nextToken());
				int ele12 = Integer.parseInt(tok1.nextToken());
				//System.out.println("Ele11 is "+ele11+" ele12 is "+ele12);
				if(i==0) {
					 if(j<5) {
						 game1[ele11][ele12] = carrier; 
					 }
					 else {
						 game1[ele11][ele12] = submarine ;
					 }
				}
				
				if(i==1) {
					 if(j<5) {
						 game2[ele11][ele12] = carrier; 
					 }
					 else {
						 game2[ele11][ele12] = submarine ;
					 }
				}
				if(i==2) {
					 if(j<5) {
						 game3[ele11][ele12] = carrier; 
					 }
					 else {
						 game3[ele11][ele12] = submarine ;
					 }
				}
			}
			
	}
		reader.close();
	}
		catch(Exception e) {
			  System.out.println("Exception occured "+e);
		  }
	
	}
	public void showgame(int[][] game, String name) {
		System.out.println("This is "+name);
		for(int i=0;i<25;i++) {
			System.out.print("-----");
		}
		System.out.println();
		for (int x=0;x<25;x++) {
			for(int y=0; y<25; y++) {
				System.out.print("|_"+game[x][y]+"_|");
			}
			System.out.println("");

		}
		System.out.println();
	}
	public static void main(String args[]) {
		BattleShips bash = new BattleShips();
		bash.startgame();
		bash.showgame(game1,"Game 1");
		bash.showgame(game2,"Game 2");
		bash.showgame(game3,"Game 3");
		
	}
}
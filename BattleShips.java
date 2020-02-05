import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class BattleShips{
	static int [][]game1 = new int[25][25];
	static int [][]game2 = new int[25][25];
	static int [][]game3 = new int[25][25];
	int carrier =1;
	int submarine =2;
	static SearchShips searchships;
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
	public void setStrategy(SearchShips strategy){
		searchships = strategy;
	}
	
	public void fndShips(SearchShips strategy,int [][]game){	
		strategy.findShips(game);
		
	}
	public static void main(String args[]) {
		BattleShips bash = new BattleShips();
		bash.startgame(); // Starting the game
		
		bash.showgame(game1,"Game 1"); // This is game 1
		HorizontalSweepStrtegy hss = new HorizontalSweepStrtegy();
		bash.setStrategy(hss);
		bash.fndShips(hss, game1);
		RandomSearchStrategy rss = new RandomSearchStrategy();
		bash.setStrategy(rss);
		bash.fndShips(rss, game1);
		StrategicSearch ss = new StrategicSearch();
		bash.setStrategy(ss);
		bash.fndShips(ss, game1);
		System.out.println("________________________________________________________________________________");
		System.out.println();
		
		bash.showgame(game2,"Game 2");
		HorizontalSweepStrtegy hss1 = new HorizontalSweepStrtegy();
		bash.setStrategy(hss1);
		bash.fndShips(hss1, game2);
		RandomSearchStrategy rss1 = new RandomSearchStrategy();
		bash.setStrategy(rss1);
		bash.fndShips(rss1, game2);
		StrategicSearch ss1 = new StrategicSearch();
		bash.setStrategy(ss1);
		bash.fndShips(ss1, game2);
		System.out.println("________________________________________________________________________________");
		System.out.println();
	
		bash.showgame(game3,"Game 3");
		HorizontalSweepStrtegy hss2 = new HorizontalSweepStrtegy();
		bash.setStrategy(hss2);
		bash.fndShips(hss2, game3);
		RandomSearchStrategy rss2 = new RandomSearchStrategy();
		bash.setStrategy(rss2);
		bash.fndShips(rss2, game3);
		StrategicSearch ss2 = new StrategicSearch();
		bash.setStrategy(ss2);
		bash.fndShips(ss2, game3);
			
	}
}
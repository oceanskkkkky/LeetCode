import java.util.Scanner;


public class ScannerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		int[][] test=new int[2][3];
		int i=0;  
		while(!scanner.nextLine().equals("")){
			   for(int j=0;j<3;j++)
				   test[i][j]=scanner.nextInt();
			   i++;
		   }
		
		for(int t=0;t<2;t++)
		{ 
			for(int j=0;j<3;j++)
				System.out.print(test[t][j]+"   ");
			System.out.println();
		}
		scanner.close();
	}

}

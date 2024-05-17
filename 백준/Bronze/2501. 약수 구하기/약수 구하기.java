import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		
		ArrayList<Integer> intlist = new ArrayList<>(); 
		for(int i = 1; i <= N; i++) {
			if(N % i == 0)
				intlist.add(i);
		}
		
		if(K <= intlist.size())
		{
			System.out.print(intlist.get(K-1));
		}
		else
			System.out.print(0);
		scanner.close();
	}
}
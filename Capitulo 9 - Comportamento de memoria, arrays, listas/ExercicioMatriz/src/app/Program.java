package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] matriz = new int[m][n];
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}	
		
		int x = sc.nextInt();
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j] == x) {
					System.out.printf("Position %d,%d:\n",i,j);
					if(j-1 >= 0) System.out.printf("Left: %d\n",matriz[i][j-1]);
					if(i-1 >= 0) System.out.printf("Top: %d\n",matriz[i-1][j]);
					if(j+1 < n) System.out.printf("Right: %d\n",matriz[i][j+1]);
					if(i+1 < m) System.out.printf("Down: %d\n",matriz[i+1][j]);
				}
			}
		}
		
		sc.close();
	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int i = 0, j =0;
		
		System.out.println("Entre com os numeros: ");
		i = sc.nextInt();
		j = sc.nextInt();
		
		int mat[][] = new int[i][j];
		
		for (int c = 0; c < mat.length; c++) {
			for (int l = 0; l < mat[c].length; l++) {
				mat[c][l] = sc.nextInt();
			}
		}
		
		int numberToFind = 0;
		
		System.out.println("Numero para ser selecionado: ");
		numberToFind = sc.nextInt();
		
		int count = 0;
		
		for (int c = 0; c < mat.length; c++) {
			for (int l = 0; l < mat[c].length; l++) {
				if (mat[c][l] == numberToFind) {
					count++;
					System.out.println("Position: " + c + ", " + l);
					
					if (l - 1 >= 0) {
						System.out.println("Left: " + mat[c][l - 1]);
					} else {
						System.out.println("Que ?");
					}
					
					if ( l + 1 < mat[c].length) {
						System.out.println("Right: " + mat[c][l + 1]);
					}
					
					if ( c - 1 >= 0 ) {
						System.out.println("Up: " + mat[c - 1][l]);
					}
					
					if ( c + 1 < mat.length) {
						System.out.println("down: " + mat[c + 1][l]);
					}		
				}
			}
		}
		
		System.out.println("Quantidade encontrada: " + count);
		
		sc.close();

	}

}

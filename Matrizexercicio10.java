import java.util.Scanner;
public class Matrizexercicio10 {
//feito
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int mat[][] = new int[3][3];
		int i, j;
		int resultado = 0;
		System.out.println("[+] Leitura e impress�o de uma matriz 3 x 3...");
		
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.println("[+] Digite a matriz: mat["+i+"]["+j+"]:");
				mat[i][j] = ent.nextInt();
			}
		}
		
		System.out.println("\n[+] Matriz de 3x3 na tela:\n");
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.printf("%4d", mat[i][j]);
			}
			System.out.printf("\n");
		}
		
		System.out.println("\n[+] Soma da diagonal:\n");
		for( i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				resultado = mat[0][0] + mat[1][1] + mat[2][2];
				
				
			}
		}
		System.out.printf("[+] A soma da diagonal �: %1d", resultado);
	}

}
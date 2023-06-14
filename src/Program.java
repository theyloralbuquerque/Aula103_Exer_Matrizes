import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de linhas da Matriz: ");
		int l = sc.nextInt();
		System.out.print("Digite a quantidade de colunas da Matriz: ");
		int c = sc.nextInt();
		
		int[][] mat = new int[l][c];  // instanciação da matriz
		
		for (int i=0; i<l; i++) {
			for (int j=0; j<c; j++) {
				System.out.printf("Digite o valor da posição %d.%d: ", i+1, j+1);
				mat[i][j] = sc.nextInt();  // matriz recebendo valores 
			}
		}
		
		System.out.print("Digite o valor que deseja saber os vizinhos: ");
		int v = sc.nextInt();
		
		for (int i=0; i<l; i++) {
			for (int j=0; j<c; j++) {
				if (v==mat[i][j]) {
					System.out.printf("POSITION %d, %d\n", i, j);
					if (j>0) { // se a coluna for maior que zero
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (j<mat[i].length-1) { // **Não entendi
						System.out.println("Right:  " + mat[i][j+1]);
					}
					if (i>0) { // se a linha for maior que zero.
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (i<mat.length-1) { // mat.length = número do comprimento de linhas da matriz(0, 1, 2 = 3)
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		sc.close();

	}

}

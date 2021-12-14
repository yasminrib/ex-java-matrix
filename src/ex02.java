import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] numeros = new int[10];
		int maior = 0, soma = 0, media = 0, ocorrencias = 0;

		for (int i = 0; i < 10; i++) {
			System.out.printf("%dº Lançamento: ", (i + 1));
		    numeros[i] = in.nextInt();

		    soma += numeros[i];

		    if (numeros[i] > maior) {
		        maior = numeros[i];
		    }
		}

		media = soma / 10;

		for (int i = 0; i < 10; i++){
		    if (numeros[i] == maior){
		        ocorrencias++;
		    }
		}

		System.out.printf("Média: %d", media);
		System.out.printf("\nNumero de ocorrências do maior valor: %d", ocorrencias);
		in.close();
	}

}

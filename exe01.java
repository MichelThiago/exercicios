package Sequencial;
 
import java.util.Scanner;

public class exe01 {
	public static void main(String[] args) {

  		int N1; 
  		int N2;
  		int soma;
  		int subtracao;
  		double divisao;
  		
  		Scanner teclado = new Scanner(System.in);
  		
  		System.out.println("Digite o numero 1:");
	  	N1 = teclado.nextInt();	  	
	  	
	  	System.out.println("Digite o numero 2:");	  	
	  	N2 = teclado.nextInt();
	  		
	  	soma = N1 + N2;
	  	subtracao = N1 - N2;
	  	divisao = (double) N1 / N2;
	  	
 		System.out.println("A soma ?:" + soma);
 		System.out.println("A subtracao ?:" + subtracao);
 		System.out.println("A multiplica??o ?:" + N1 * N2);
 		System.out.println("A divis?o ?:" + divisao);
 		
 		teclado.close();
	}
}
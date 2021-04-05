package Sequencial;
 
import java.util.Scanner;

public class exe04 {
	public static void main(String[] args) {

  		double valor; 
  		double valorNovo;
  		
  		Scanner teclado = new Scanner(System.in);
  		
  		System.out.println("Digite o valor:");
  		valor = teclado.nextDouble();
  		
  		valorNovo = (valor + (valor * (15.8/100)));
  		
 		System.out.println("Valor novo:" + valorNovo);
 		
 		teclado.close();
	}
}
package Sequencial;
 
import java.time.LocalDateTime;
import java.util.Scanner;

public class exe03 {
	public static void main(String[] args) {

  		int anoNascimento; 
  		int anoAtual;
  		
  		Scanner teclado = new Scanner(System.in);
  		
  		System.out.println("Digite o numero 1:");
  		anoNascimento = teclado.nextInt();
  		
  		LocalDateTime data1 = LocalDateTime.now();
  		anoAtual = data1.getYear();
  		
 		System.out.println("Idade:" + (anoAtual-anoNascimento));
 		
 		teclado.close();
	}	
}
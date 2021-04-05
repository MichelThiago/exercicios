package Sequencial;
 
import java.util.Scanner;

public class exe05 {
	public static void main(String[] args) {

  		int base; 
  		int altura;
  		int area;
  		
  		Scanner teclado = new Scanner(System.in);
  		
  		System.out.println("Base:");
  		base = teclado.nextInt();

  		System.out.println("Altura:");
  		altura = teclado.nextInt();

  		area = base * altura / 2;
  		
 		System.out.println("Area:" + area);
 		
 		teclado.close();
	}
}
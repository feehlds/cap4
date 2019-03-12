package br.edu.ifsp.spo.lp1a3.sp3013219.cap4.app;
import java.util.Scanner;
import br.edu.ifsp.spo.lp1a3.sp3013219.cap4.cripto.*;

public class App {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		Cripto crip = new Cripto();
		
		System.out.println("Digite 4 digitos sem espaço: ");
		num = ler.nextInt();
		
		System.out.println("CRIPTO: " + crip.criptografar(num));
		}
	
}

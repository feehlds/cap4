package br.edu.ifsp.spo.lp1a3.sp3013219.cap4.app;
import java.util.Scanner;
import br.edu.ifsp.spo.lp1a3.sp3013219.cap4.cripto.*;
import br.edu.ifsp.spo.lp1a3.sp3013219.cap4.descripto.Decrypt;

public class App {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		
		Cripto crip = new Cripto();
		Decrypt decrip  = new Decrypt();	
		
		
		System.out.println("Digite 1 Para Criptografar um número.");
		System.out.println("Digite 2 Para Descriptografar um número.");
		int op = ler.nextInt();
		
		switch(op) {
			case 1 :
				System.out.println("Digite 4 digitos sem espaços: ");
				num = ler.nextInt();
				System.out.println("Número criptografado: " + crip.criptografar(num));
			break;
			case 2 :
				System.out.println("Digite 4 digitos sem espaços: ");
				num = ler.nextInt();
				System.out.println("Número descriptografado: " + decrip.decrypt(num));
			break;
		}			
	}
}

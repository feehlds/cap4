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
		
		
		System.out.println("Digite 1 Para Criptografar um n�mero.");
		System.out.println("Digite 2 Para Descriptografar um n�mero.");
		int op = ler.nextInt();
		
		switch(op) {
			case 1 :
				System.out.println("Digite 4 digitos sem espa�os: ");
				num = ler.nextInt();
				System.out.println("N�mero criptografado: " + crip.criptografar(num));
			break;
			case 2 :
				System.out.println("Digite 4 digitos sem espa�os: ");
				num = ler.nextInt();
				System.out.println("N�mero descriptografado: " + decrip.decrypt(num));
			break;
		}			
	}
}

package br.edu.ifsp.spo.lp1a3.sp3013219.cap4.app;
import br.edu.ifsp.spo.lp1a3.sp3013219.cap4.descripto.*;
import java.util.Scanner;

public class AppDescriptografar {
	public static void main() {
		Scanner ler = new Scanner(System.in);
		int num;
		Decrypt decrip = new Decrypt();
		System.out.println("Digite 4 digitos sem espa�o: ");
		num = ler.nextInt();
		System.out.println("N�mero descriptografado: " + decrip.decrypt(num));
		}		
}


package br.edu.ifsp.spo.lp1a3.sp3013219.cap4.cripto;

public class Cripto {
	
	int criptoNum = 0;
	int i;
	int x;
	int y = 1000;
	
	public int criptografar(int num) {
		for(i = 0; i<4; i++) {
			if(i == 0  || i == 2) {
				x = (int) (10 * Math.pow(10, i));
				criptoNum = criptoNum + ((num / y + 7) % 10) * x;
				num = (int) num % y;
				y = (int) y / 10;
			}
			else{
				x = (int) (1 * Math.pow(10, i - 1));;
				criptoNum = criptoNum + ((num / y + 7) % 10) * x;
				num = (int) num % y;
				y = (int) y / 10;
				}		
		}
		return criptoNum;
	}
}

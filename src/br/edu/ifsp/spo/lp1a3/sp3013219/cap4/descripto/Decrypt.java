package br.edu.ifsp.spo.lp1a3.sp3013219.cap4.descripto;

public class Decrypt {
	int drcryptNum = 0;
	int i;
	int x;
	int y = 1000;
	
	public int decrypt(int num) {
		for(i = 0; i<4; i++) {
			if(i == 0  || i == 2) {
				x = (int) (10 * Math.pow(10, i));
				if((num / y + 10) < 11) {
					drcryptNum = drcryptNum + ((num / y + 10) - 7) * x;
					} else {
						drcryptNum = drcryptNum + ((num / y + 10) - 7 - 10) * x;
					}
				num = (int) num % y;
				y = (int) y / 10;
			}
			else{
				x = (int) (1 * Math.pow(10, i - 1));
				if((num / y + 10) < 11) {
				drcryptNum = drcryptNum + ((num / y + 10) - 7) * x;
				} else {
					drcryptNum = drcryptNum + ((num / y + 10) - 7 - 10) * x;
				}
				num = (int) num % y;
				y = (int) y / 10;
				}		
		}
		return drcryptNum;
	}
}

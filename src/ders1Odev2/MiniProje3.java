package ders1Odev2;

public class MiniProje3 {

	public static void main(String[] args) {
		int number = 8;
		int total = 0;
	
		
		for(int i=1;i<number;i++) {
			
			int remainder = number % i;
			if(remainder == 0) {
				total += i;
			}
		}
		
		if(total == number) {
			System.out.println("Bu sayi Mükemmel sayidir");
		}else {
			System.out.println("Bu sayi Mükemmel sayi degildir");

		}

	}

}

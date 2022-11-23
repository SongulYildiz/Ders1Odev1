package ders1Odev2;

public class MiniProje4 {

	public static void main(String[] args) {
		// arkadaş sayıları bulma 220-284 gibi
		int number1 = 220;
		int number2 = 274;
		int total1 = 0;
		int total2 = 0;
		
		for(int i=1; i<number1;i++) {
			if(number1 % i == 0) {
				total1 += i;
			}
		}
		
		for(int i=1; i<number2;i++) {
			if(number2 % i == 0) {
				total2 += i;
			}
		}
		
		if(total1 == number2 && total2 == number1) {
			System.out.println("Bu sayilar arkadas sayilardir.");
		}else {
			System.out.println("Bu sayilar arkadas sayilar degildir.");

		}

	}

}

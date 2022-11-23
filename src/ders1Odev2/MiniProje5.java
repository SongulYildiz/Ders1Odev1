package ders1Odev2;

public class MiniProje5 {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,5,6,4,8,9,0};
		int aranan = 9;
	    boolean arama = false;
		for(int number : numbers) {
			
			if(aranan == number) {
				arama = true;
				break;
			}
			
			
		}
		if(arama) {
			System.out.println(aranan +" sayisi numbers dizisinde bulunuyor.");
		}else {
			System.out.println(aranan +" sayisi numbers dizisinde bulunmuyor.");

		}
	}

}

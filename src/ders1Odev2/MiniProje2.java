package ders1Odev2;

public class MiniProje2 {

	public static void main(String[] args) {
		char[] kalinSesli = {'a','ı','o','u'};
		char harf = 'ü';
		boolean kalinharf = false;
		
		for(char kalinses : kalinSesli)
		{
			if(harf == kalinses) {
				kalinharf = true;
			}	
		}
		if(kalinharf) {
			System.out.println("Bu harf kalin sesli bir harftir");
		}else {
			System.out.println("Bu harf ince Sesli bir harftir");
		}
	}
}

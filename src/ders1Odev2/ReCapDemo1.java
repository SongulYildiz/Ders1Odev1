package ders1Odev2;

public class ReCapDemo1 {

	public static void main(String[] args) {

		int s1 = 40, s2 = 53, s3 = 25;
		int max = s1;

		if (max < s2) {
			max = s2;
		}
		if (max < s3) {
			max = s3;
		}

		System.out.println("en buyuk sayi : " + max);

	}

}

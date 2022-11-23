package ders1Odev2;

public class MultiDimensionalArrayDemo {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "Istanbul";
		sehirler[0][1] = "Tekirdag";
		sehirler[0][2] = "Kirklareli";
	
		sehirler[1][0] = "Gaziantep";
		sehirler[1][1] = "Sanliurfa";
		sehirler[1][2] = "Kahramanmaras";
		
		sehirler[2][0] = "Ankara";
		sehirler[2][1] = "Konya";
		sehirler[2][2] = "Nevsehir";
		
		for(int i=0;i<3;i++) {
			System.out.println("----------------------");
			for(int j=0;j<3;j++) {
				System.out.println(sehirler[i][j]);
			}
		}

	}

}

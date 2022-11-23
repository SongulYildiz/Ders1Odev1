package ders1Odev2;

public class ReCapDemo2 {

	public static void main(String[] args) {
		// dizimizi oluşturalım
		
		double[] mylist = new double[6];
		mylist[0] = 1.4;
		mylist[1] = 0.5;
		mylist[2] = 6.8;
		mylist[3] = 4.2;
		mylist[4] = 3.5;
		mylist[5] = 2.6;
		
		// tüm elemanlarımızı ekrana yazdıralım
		for(double list: mylist) {
			System.out.println(list);
		}
		
		//şimdi dizimizde bulunan tüm elemanların toplamını alalım
		
		double total = 0;
		for(double list: mylist) {
			
			total += list;
		}
		System.out.println("toplam = " + total);
		
		//şimdi en büyük sayımızı bastıralım
		double max = 0;
		
		for(double list : mylist) {
			if(max<list) {
				max = list;
			}
		}
		System.out.println("en buyuk sayi = " + max);
		
		// en küçük sayıyı bulmak istersek
		double min = mylist[0];
		
		for(double list : mylist) {
			if(min>list) {
				min = list;
			}
		}
		System.out.println("En Kucuk Sayi : " + min);

	}

}

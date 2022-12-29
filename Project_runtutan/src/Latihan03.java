import java.util.Scanner;

public class Latihan03 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			double phi=3.14;

			
			System.out.println("Pilih bangunan yang akan anda hitung");
			System.out.println("1.Segitiga Kerucut");
			System.out.println("2.Tabung");
			System.out.print("Pilihan anda : ");
			
			int pilihan = input.nextInt();
			
			if(pilihan == 1) {
				System.out.print("Masukan tinggi segitiga kerucut : ");
				int t = input.nextInt();
				System.out.print("Masukan jari - jari segitiga kerucut : ");
				int r = input.nextInt();
				
				double luasSegitiga = (phi * r*r * t)/3;
				System.out.print("Luas segitiga kerucut ialah : " + luasSegitiga);
				System.out.println("  ");
				
				double kelSegitiga = 2 * phi * r;
				System.out.print("Keliling segitiga kerucut ialah : " + kelSegitiga );
				
			} else if (pilihan == 2) {
				System.out.print("Masukan tinggi tabung : ");
				System.out.print("Masukan jari jari tabung : ");
				int r = input.nextInt();
				
				double luasTabung = 2 * phi * r * r;
				System.out.print("Luas Tabung ialah : " + luasTabung);
				System.out.println("  ");
				
				double kelTabung = 2 * phi * r;
				System.out.print("Keliling Tabung ialah : " + kelTabung);
				
				input.nextInt();
				
			} else {
				System.out.println("Pilihan yang anda masukan salah ");
			}
		}
		

	}

}
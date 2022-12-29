
import java.util.Scanner;

public class Latihan06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan usia anda : ");
		String usia = input.nextLine();
		
		System.out.print("Masukkan nama depan anda : ");
		String namaDepan = input.nextLine();
		
		System.out.print("Masukkan nama belakang anda : ");
		String namaBelakang = input.nextLine();
		
		System.out.print("Masukkan NPM anda : ");
		String npm = input.nextLine();
		
		String str = usia.concat(namaDepan).concat(namaBelakang).concat(npm);
		System.out.println(str);
		input.close();
	}
}
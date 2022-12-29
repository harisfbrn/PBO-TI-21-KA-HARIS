import java.util.Scanner;

public class Latihan08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int npm, sm;
		String namLeng, namKel;
		double ipk;
		
		System.out.print("Masukkan Npm Anda : ");
		npm = input.nextInt();
		System.out.print("Masukkan Nama Lengkap Anda : ");
		namLeng = input.next();
		System.out.print("Masukkan Nama Kelas Anda : ");
		namKel = input.next();
		System.out.print("Semester - ");
		sm = input.nextInt();
		System.out.print("Masukkan IPK Anda : ");
		ipk = input.nextDouble();
		
		System.out.println("  ");
		System.out.println("- " + npm);
		System.out.println("- " + namLeng);
		System.out.println("- " + namKel);
		System.out.println("- " + sm);
		System.out.println("- " + ipk);
		
		input.close();
	}
}
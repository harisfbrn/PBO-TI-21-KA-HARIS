import java.util.Scanner;

public class latihan05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukkan (kata / kalimat) yang akan di UPPERCASE : ");
		String kata = input.nextLine();
		
		System.out.println("Perubahan oleh sistem menjadi :");
		System.out.println(kata.toUpperCase());
		
		
		input.close();
	}
}
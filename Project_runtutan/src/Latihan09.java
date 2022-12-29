import java.util.Scanner;

public class Latihan09 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Students Biodata = new Students();
		
		System.out.println("Selamat datang di pemrograman java");
		
		System.out.print("Masukkan NPM : ");
		Biodata.getNpm(input.nextInt());
		
		System.out.print("Masukkan Nama : ");
		Biodata.getFullname(input.next());
		
		System.out.print("Masukkan Kelas : ");
		Biodata.getClassname(input.next());
		
		System.out.print("Semester ke : ");
		Biodata.getSm(input.nextInt());
		
		System.out.print("Masukkan nilai akhir : ");
		Biodata.getGpa(input.nextFloat());
				
		input.close();
		
	}
}

class Students {
	Scanner input = new Scanner(System.in);

	int getNpm(int npm) {
//		System.out.println(npm);
		return npm;
	}
	
	int getSm(int sm) {
		return sm;
	}
	
	String getFullname(String Fullname) {
		return Fullname;
	}
	
	String getClassname(String Classname) {
		return Classname;
	}
	
	float getGpa(float gpa) {
		return gpa;
	}
	
	
}
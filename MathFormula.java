import java.util.Scanner;

public class MathFormula extends Formula{

	Scanner sc;
	int choice,luas;
	String exit = "0";

	public static void main(String[] args) {
		MathFormula mf = new MathFormula();
		mf.menu();
		mf.runChoice();
	}

	public void menu() {
		sc = new Scanner(System.in);
		System.out.println("====Menghitung Luas Bangun Datar====");
		System.out.println("1. Persegi");
		System.out.println("2. Persegi Panjang");
		System.out.println("3. Segitiga Siku - Siku");
		System.out.println("4. Layang - Layang");
		System.out.println("5. Jajar Genjang");
		System.out.print("Pilihan Bangun Datar : ");
	}

	public void runChoice() {
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("===Persegi===");
			System.out.print("Masukan sisi : ");
			int sisi = sc.nextInt();
			luas = super.Persegi(sisi);
			System.out.println("Luas Persegi adalah " + luas);
			exit();
			break;
		case 2:
			System.out.println("===Persegi Panjang===");
			System.out.print("Masukan panjang : ");
			int panjang = sc.nextInt();
			System.out.print("Masukan lebar : ");
			int lebar = sc.nextInt();
			luas = super.PersegiPanjang(panjang,lebar);
			System.out.println("Luas Persegi Panjang adalah " + luas);
			exit();
			break;
		case 3:
			System.out.println("===Segitiga Siku-Siku===");
			System.out.print("Masukan alas : ");
			int alas = sc.nextInt();
			System.out.print("Masukan tinggi : ");
			int tinggi = sc.nextInt();
			luas = super.SegitigaSikuSiku(alas, tinggi);
			System.out.println("Luas Segitiga Siku - Siku adalah " + luas);
			exit();
			break;
		case 4:
			System.out.println("===Layang - Layang===");
			System.out.print("Masukan diagonal 1 : ");
			int d1 = sc.nextInt();
			System.out.print("Masukan diagonal 2 : ");
			int d2 = sc.nextInt();
			luas = super.LayangLayang(d1, d2);
			System.out.println("Luas Layang - Layang adalah " + luas);
			exit();
			break;
		case 5:
			System.out.println("===Jajar Genjang===");
			System.out.print("Masukan alas : ");
			int alas2 = sc.nextInt();
			System.out.print("Masukan tinggi : ");
			int tinggi2 = sc.nextInt();
			luas = super.JajarGenjang(alas2, tinggi2);
			System.out.println("Luas Jajar Genjang adalah " + luas);
			exit();
			break;
		}
	}

	public void exit() {
			System.out.println("================");
			System.out.println("Ketik \"Selesai\" untuk mengakhiri program!");
			System.out.print("Ketik : ");
			exit = sc.next();
			if (exit.equalsIgnoreCase("selesai")) {
				System.out.println("================");
				System.out.println("Program Berakhir");
				System.out.println("================");
				System.exit(0);
			} else {
				System.out.println("\n");
				menu();
				runChoice();
			}
	}

	public void testProgram() {
		menu();
		System.out.println("1");
		System.out.println("===Persegi===");
		System.out.println("Masukan sisi : 5");
		luas = super.Persegi(5);
		System.out.println("Luas Persegi adalah " + luas);
		System.out.println("================");
		System.out.println("Ketik \"Selesai\" untuk mengakhiri program!");
		System.out.println("Ketik : selesai");
		System.out.println("================");
		System.out.println("Program Berakhir");
		System.out.println("================");
		System.exit(0);
	}
}

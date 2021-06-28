package latihan;
import java.util.*;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int angka1,angka2,hasil,pilihanMenu;
		
		Scanner input = new Scanner(System.in);
		
		Menu2 menu= new Menu2();
		
		System.out.print("masukkan nilai pertama : ");
		angka1 = input.nextInt();
		System.out.print("masukkan nilai kedua : ");
		angka2 = input.nextInt();
		menu.menu();
		System.out.print("masukkan pilihan menu : ");
		pilihanMenu= input.nextInt();
		
		if (pilihanMenu==1) {
			Tambah tambah = new Tambah();
			System.out.print(" hasil tambah : "+tambah.hitung(angka1, angka2));
			
		}else if(pilihanMenu==2) {
			Kurang kurang = new Kurang();
			System.out.print(" hasil kurang : "+kurang.hitung(angka1, angka2));
		}else if(pilihanMenu==3) {
			Kali kali = new Kali();
			System.out.print(" hasil kurang : "+kali.hitung(angka1, angka2));
		}else if(pilihanMenu==4) {
			Bagi bagi = new Bagi();
			System.out.print(" hasil kurang : "+bagi.hitung(angka1, angka2));
		}
	}
	
}

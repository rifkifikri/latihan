package latihan;

public class Tambah implements Hitungan{
	 int hasil;
	//override
	public int hitung(int x, int y) {
		hasil = x+y;
		return hasil;
	}
}

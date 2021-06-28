package latihan;

public class Kali implements Hitungan{
	private int hasil;
	//override
	public int hitung(int x, int y) {
		hasil = x*y;
		return hasil;
	}
}

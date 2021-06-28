package latihan;

public class Bagi implements Hitungan{
	private int hasil;
	//override
	public int hitung(int x, int y) {
		hasil = x/y;
		return hasil;
	}
}

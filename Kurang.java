package latihan;

public class Kurang implements Hitungan{
	private int hasil;
	//override
	public int hitung(int x, int y) {
		hasil = x-y;
		return hasil;
	}
}

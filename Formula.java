public class Formula {
	public int Persegi(int sisi) {
		int luas = sisi*sisi;
		return luas;
	}
	public int PersegiPanjang(int panjang, int lebar) {
		int luas = panjang*lebar;
		return luas;
	}
	public int SegitigaSikuSiku(int alas, int tinggi) {
		int luas = alas*tinggi/2;
		return luas;
	}
	public int LayangLayang(int d1, int d2) {
		int luas = d1*d2/2;
		return luas;
	}
	public int JajarGenjang(int alas, int tinggi) {
		int luas = alas*tinggi;
		return luas;
	}
}

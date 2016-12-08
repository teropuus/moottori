package fi.puustinen.carproject.domain;

public class Moottori {
	 int teho;
	 int sylinterienMaara;
	 int sylintereitaRikki;

	public int getTeho() {
		return teho;
	}

	public void setTeho(int teho) {
		this.teho = teho;
	}

	public double getSylinterienMaara() {
		return sylinterienMaara;
	}

	public void setSylinterienMaara(int sylinterienMaara) {
		this.sylinterienMaara = sylinterienMaara;
	}

	public double getSylintereitaRikki() {
		return sylintereitaRikki;
	}

	public void setSylintereitaRikki(int sylintereitaRikki) {
		this.sylintereitaRikki = sylintereitaRikki;
	}
	public Moottori(int teho, int sylinterienMaara, int sylintereitaRikki) {
		super();
		this.teho = teho;
		this.sylinterienMaara = sylinterienMaara;
		this.sylintereitaRikki = sylintereitaRikki;
	}

}

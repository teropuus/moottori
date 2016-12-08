package fi.puustinen.carproject.domain;

public class Auto {
	 String merkki;
	 String malli;
	 int huippunopeus;
	 Moottori moottori; 
	 Ajaja ajaja;

	public Auto(String merkki, String malli, int huippunopeus,
			Moottori moottori, Ajaja ajaja) {
		super();
		this.merkki = merkki;
		this.malli = malli;
		this.huippunopeus = huippunopeus;
		this.moottori = moottori;
		this.ajaja = ajaja;
	}

	public String getMerkki() {
		return merkki;
	}

	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}

	public String getMalli() {
		return malli;
	}

	public void setMalli(String malli) {
		this.malli = malli;
	}

	public int getHuippunopeus() {
		return huippunopeus;
	}

	public void setHuippunopeus(int huippunopeus) {
		this.huippunopeus = huippunopeus;
	}


	public Moottori getMoottori() {
		return moottori;
	}

	public void setMoottori(Moottori moottori) {
		this.moottori = moottori;
	}

	public Ajaja getAjaja() {
		return ajaja;
	}

	public void setAjaja(Ajaja ajaja) {
		this.ajaja = ajaja;
	}

	public double laskeNopeus() {
		double paluuArvo;
		paluuArvo = (moottori.getSylinterienMaara() - moottori.getSylintereitaRikki()
				* huippunopeus / moottori.getSylinterienMaara());
		return paluuArvo;
	}
	
}

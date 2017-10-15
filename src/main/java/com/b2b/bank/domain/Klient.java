package com.b2b.bank.domain;

public class Klient {
	private String imie;
	private String nazwisko;
	private int rokUrodzenia;
	private double stanKonta;
	public double getStanKonta() {
		return stanKonta;
	}
	public void setStanKonta(double stanKonta) {
		this.stanKonta = stanKonta;
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public int getRokUrodzenia() {
		return rokUrodzenia;
	}
	public void setRokUrodzenia(int rokUrodzenia) {
		this.rokUrodzenia = rokUrodzenia;
	}

}

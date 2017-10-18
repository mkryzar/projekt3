package com.b2b.bank.domain;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Klient> klienci = new ArrayList<Klient>();
	private String nazwaBanku;
	public List<Klient> getKlienci() {
		return klienci;
	}
	public void setKlienci(List<Klient> klienci) {
		this.klienci = klienci;
	}
	public Bank(List<Klient> klienci, String nazwaBanku) {
		super();
		this.klienci = klienci;
		this.nazwaBanku = nazwaBanku;
	}
	public String getNazwaBanku() {
		return nazwaBanku;
	}
	public void setNazwaBanku(String nazwaBanku) {
		this.nazwaBanku = nazwaBanku;
	}

}

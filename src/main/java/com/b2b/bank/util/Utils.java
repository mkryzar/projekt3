package com.b2b.bank.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.b2b.bank.domain.Bank;
import com.b2b.bank.domain.Klient;

public class Utils {
	private Scanner scanner;

	public Utils() {
		scanner = new Scanner(System.in);
	}

	public String nazwiskoKlienta() {
		return "nazwisko";
	}

	// public List<Bank> stworzListeBankow() {
	// List<Bank> banki = new ArrayList<Bank>(); //inicjalizacja listy
	// boolean czyTworzycBank = true;
	// do {
	// System.out.println("Czy stworzyć bank?");
	// czyTworzycBank = scanner.nextBoolean();
	// if (czyTworzycBank) {
	// Bank bank = new Bank();
	// System.out.println("Podaj nazwe banku");
	// String nazwaBanku = scanner.next();
	// bank.setNazwaBanku(nazwaBanku);
	// System.out.println("uzupełnij klientów bankow");
	// bank.setKlienci(stworzDomyslnaListeKlientow());
	// banki.add(bank);
	// }
	// } while (czyTworzycBank);
	//
	// return banki;
	// }

	public List<Bank> stworzDomyslnaListeBankow() {
		List<Bank> banki = new ArrayList<>();
		List<Klient> klienciMillenium = stworzDomyslnaListeKlientowMillenium();
		banki.add(new Bank(klienciMillenium, "Millenium"));
		List<Klient> klienciPkoBp = stworzDomyslnaListeKlientowPkoBp();
		banki.add(new Bank(klienciPkoBp, "PKO BP"));

		return banki;

	}

	/*
	 * public List<Klient> stworzListeKlientow() { List<Klient> klienci = new
	 * ArrayList<Klient>(); boolean czyTworzycKlienta = true;
	 * 
	 * do { System.out.println("Czy stworzyć klienta?"); czyTworzycKlienta =
	 * scanner.nextBoolean(); if (czyTworzycKlienta) { Klient klient = new Klient();
	 * System.out.println("Podaj imię klienta");// warunek imie nie // moze zaczynac
	 * sie // od cyfry; String imie = scanner.next();
	 * 
	 * klient.setImie(imie); System.out.println("Podaj nazwisko klienta"); String
	 * nazwisko = scanner.next(); klient.setNazwisko(nazwisko);
	 * System.out.println("Podaj rok urodzenia klienta"); int rokUrodzenia =
	 * scanner.nextInt();
	 * 
	 * klient.setRokUrodzenia(rokUrodzenia); System.out.println("Podaj stan konta");
	 * double stanKonta = scanner.nextDouble(); klient.setStanKonta(stanKonta);
	 * klienci.add(klient); } } while (czyTworzycKlienta);
	 * 
	 * return klienci; }
	 */

	public List<Klient> stworzDomyslnaListeKlientowMillenium() {
		List<Klient> klienci = new ArrayList<>();
		Klient janek = new Klient("Kowalski", 1213.20);
		janek.setRokUrodzenia(1983);
		janek.setImie("Jan");
		klienci.add(janek);
		Klient piotrus = new Klient("Małek", 123.20);
		piotrus.setRokUrodzenia(1989);
		piotrus.setImie("Piotr");
		klienci.add(piotrus);

		return klienci;
	}

	public List<Klient> stworzDomyslnaListeKlientowPkoBp() {
		List<Klient> klienci = new ArrayList<>();
		Klient anna = new Klient("Waza", 1213.20);
		anna.setRokUrodzenia(1987);
		anna.setImie("Anna");
		klienci.add(anna);
		Klient filip = new Klient("Kozak", 123.20);
		filip.setImie("Filip");
		filip.setRokUrodzenia(1978);
		klienci.add(filip);

		return klienci;
	}

}

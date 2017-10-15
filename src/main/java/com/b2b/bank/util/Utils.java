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

	public List<Bank> stworzListeBankow() {
		List<Bank> banki = new ArrayList<Bank>();
		boolean czyTworzycBank = true;
		do {
			System.out.println("Czy stworzyć bank?");
			czyTworzycBank = scanner.nextBoolean();
			if (czyTworzycBank) {
				Bank bank = new Bank();
				System.out.println("Podaj nazwe banku");
				String nazwaBanku = scanner.next();
				bank.setNazwaBanku(nazwaBanku);
				System.out.println("uzupełnij klientów bankow");
				bank.setKlienci(stworzListeKlientow());
				banki.add(bank);
			}
		} while (czyTworzycBank);

		return banki;
	}

	public List<Klient> stworzListeKlientow() {
		List<Klient> klienci = new ArrayList<Klient>();
		boolean czyTworzycKlienta = true;
		do {
			System.out.println("Czy stworzyć klienta?");
			czyTworzycKlienta = scanner.nextBoolean();
			if (czyTworzycKlienta) {
				Klient klient = new Klient();
				System.out.println("Podaj imię klienta");// warunek imie nie
															// moze zaczynac sie
															// od cyfry;
				String imie = scanner.next();
				klient.setImie(imie);
				System.out.println("Podaj nazwisko klienta");
				String nazwisko = scanner.next();
				klient.setNazwisko(nazwisko);
				System.out.println("Podaj rok urodzenia klienta");
				int rokUrodzenia = scanner.nextInt(); //warunek na rokUrodzenia
				klient.setRokUrodzenia(rokUrodzenia);
				System.out.println("Podaj stan konta");
				double stanKonta = scanner.nextDouble();
				klient.setStanKonta(stanKonta);
				klienci.add(klient);
			}
		} while (czyTworzycKlienta);

		return klienci;
	}

}

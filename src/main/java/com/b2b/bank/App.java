package com.b2b.bank;

import java.util.List;

import com.b2b.bank.domain.Bank;
import com.b2b.bank.domain.Klient;
import com.b2b.bank.util.Utils;

public class App {
	public static void main(String[] args) {
		//wyświetlić sume stanow kont w banku
		Utils utils = new Utils();
		List<Bank> banki = utils.stworzListeBankow();
		// TODO refactor
		System.out.println("Wyświetlenie danych klientów ");
		for (Bank b : banki) {
			System.out.println(b.getNazwaBanku());
			for (Klient k : b.getKlienci()) {
				System.out.println(
						k.getImie() + " " + k.getNazwisko() + " " + k.getRokUrodzenia() + " " + k.getStanKonta());
			}

			System.out.println("----------------------------");
		}
	}
}

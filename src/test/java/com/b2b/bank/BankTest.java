package com.b2b.bank;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.b2b.bank.domain.Bank;
import com.b2b.bank.domain.Klient;
import com.b2b.bank.util.Utils;

/**
 * Unit test for simple App.
 */
public class BankTest {

	@Test
	public void czyListaBankowNieJestPusta() {
		Utils utils = new Utils();
		List<Bank> banki = utils.stworzDomyslnaListeBankow();

		// assertEquals(false, bank.size()>0);
		assertEquals(false, banki.isEmpty());
	}

	@Test
	public void czyListaBankowZawieraBankMillenium() {
		Utils utils = new Utils();
		List<Bank> banki = utils.stworzDomyslnaListeBankow();
		boolean czyJestBankMillenium = true;
		for (Bank bank : banki) {

			if (bank.getNazwaBanku().equals("Millenium")) {
				czyJestBankMillenium = true;

			}
			assertEquals(true, czyJestBankMillenium);
		}
	}

	@Test
	public void czyBankMilleniumMaDwochKlientow() {
		Utils utils = new Utils();
		List<Bank> banki = utils.stworzDomyslnaListeBankow();
		boolean czyJestDwochKlientow = false;
		for (Bank bank : banki) {
			if (bank.getNazwaBanku().equals("Millenium")) {
				if (bank.getKlienci().size() == 2) {
					czyJestDwochKlientow = true;
				}
			}
		}
		assertEquals(true, czyJestDwochKlientow);

	}

	@Test
	public void czyStanKontaKlientowWeWszystkichBankachJestWiekszyOd1000() {
		Utils utils = new Utils();
		List<Bank> banki = utils.stworzDomyslnaListeBankow();
		boolean czySaldoWiekszeOd1000 = true;
		for (Bank bank : banki) {
			double sumaStanowKontKlientow = 0;
			for (Klient klient : bank.getKlienci()) {
				sumaStanowKontKlientow = sumaStanowKontKlientow + klient.getStanKonta();
			}
			// posiadamy sumestanow kont

			if (sumaStanowKontKlientow < 1000) {
				czySaldoWiekszeOd1000 = false;
			}
		}
		assertEquals(true, czySaldoWiekszeOd1000);

	}

	@Test
	public void czyStanKontaPoszczegolnychKlientowJestWiekszyOd100() {
		Utils utils = new Utils();
		List<Bank> banki = utils.stworzDomyslnaListeBankow();
		boolean czySaldoWiekszeOd100 = true;
		for (Bank bank : banki) {
			for (Klient klient : bank.getKlienci()) {
				if (klient.getStanKonta() < 100) {
					czySaldoWiekszeOd100 = false;

				}

			}
		}
		assertEquals(true, czySaldoWiekszeOd100);

	}

	
	@Test
	public void czyWszyscyKlienciBankoMajaPrawidloweImiona() {
		Utils utils = new Utils();
		List<Bank> banki = utils.stworzDomyslnaListeBankow();
		boolean czyPrawidloweImie = true;
		for (Bank bank : banki) {
			for (Klient klient : bank.getKlienci()) {
				if(klient.getImie().isEmpty()) {
					czyPrawidloweImie = false;
				}
			}
		} assertEquals(true, czyPrawidloweImie);
		
		
	}
	
	
	
}
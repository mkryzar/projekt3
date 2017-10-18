package com.b2b.bank;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.b2b.bank.domain.Klient;
import com.b2b.bank.util.Utils;

public class KlienciTest {

	@Test
	public void czyListaKlientowBankuNieJestPusta() {
		Utils utils = new Utils();
		List<Klient> klienci = utils.stworzDomyslnaListeKlientowMillenium();

		assertEquals(false, klienci.isEmpty());

	}

	@Test
	public void czyListaKlientowBankuZawieraMalka() {
		Utils utils = new Utils();
		List<Klient> klienci = utils.stworzDomyslnaListeKlientowMillenium();
		boolean czyJestMalek = false;
		for (Klient klient : klienci)
			if (klient.getNazwisko().equals("Malek")) {
				czyJestMalek = true;
			}
		assertEquals(false, czyJestMalek);

	}

	@Test
	public void czyListaKlientowBankuNieZawieraTomasz() {
		Utils utils = new Utils();
		List<Klient> klienci = utils.stworzDomyslnaListeKlientowMillenium();
		boolean czyJestTomasz = false;
		for (Klient klient : klienci)
			if (klient.getImie().equals("Tomasz")) {
				czyJestTomasz = true;
			}
		assertEquals(false, czyJestTomasz);

	}

	// public void czyListaLKlientowBankuZawieraAnna() {
	// Utils utils = new Utils();
	// List<Klient> klienci = utils.stworzDomyslnaListeKlientow();
	// boolean czyJestAnna = false;
	// for (Klient klient : klienci)
	// if(klient.getImie)
	//
	// }
	@Test
	public void czyWszyscyKlienciMajaPrawidlowyRokUrodzenia() {
		Utils utils = new Utils();
		List<Klient> klienci = utils.stworzDomyslnaListeKlientowMillenium();
		boolean czyNieprawidlowyRokUrodzenia = false;

		for (Klient klient : klienci) {
			if (klient.getRokUrodzenia() == 0) {
				czyNieprawidlowyRokUrodzenia = true;
			}
			
		}
		assertEquals(false, czyNieprawidlowyRokUrodzenia);
	}


	@Test
	public void czySaldoJestDodatnie() {
		Utils utils = new Utils();
		List<Klient> klienci = utils.stworzDomyslnaListeKlientowMillenium();
		boolean czyUjemneSaldo = false;
		
		for (Klient klient : klienci) {
			if(klient.getStanKonta() < 0) {
				czyUjemneSaldo = true;
			}
		}
		assertEquals(false, czyUjemneSaldo);
		
	}
}

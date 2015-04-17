package de.dhbw.ravensburg.dame.modell;

public class SpielfeldDaten {

	private int[][] feld;

	public static final int WEISS = 0;
	public static final int SCHWARZ = 1;
	public static final int LEER = 2;

	public SpielfeldDaten() {

		feld = new int[8][8];
		
		
		for (int y = 0; y < 8; y++) {
			for (int x = 0; x < 8; x++) {

				if (y == 0 || y == 1 || y == 2) {
					if ((x + y) % 2 == 1) {
						setCell(x, y, SCHWARZ);
					} else {
						setCell(x, y, LEER);
					}
				} else if (y == 6 || y == 7 || y == 5) {
					if ((x + y) % 2 == 0) {
						setCell(x, y, WEISS);
					} else {
						setCell(x, y, LEER);
					}
				} else {
					setCell(x, y, LEER);
				}
			}
		}
	}

	public int getCell(int x, int y) {
		if (x < 0 || x > 7 || y < 0 || y > 7) {
			throw new IllegalArgumentException(
					"Das Spielfeld ist nur 8x8 groß! X oder Y sind entweder kleiner 0 oder größer 7!");
		}
		return feld[y][x];
	}

	public void setCell(int x, int y, int neuerInhalt) {

		if (!(neuerInhalt == WEISS || neuerInhalt == SCHWARZ || neuerInhalt == LEER)) {
			throw new IllegalArgumentException(
					"Zellen können nur durch WEISS oder SCHWARZ besetzt oder LEER sein!");
		}

		if (x < 0 || x > 7 || y < 0 || y > 7) {
			throw new IllegalArgumentException(
					"Das Spielfeld ist nur 8x8 groß! X oder Y sind entweder kleiner 0 oder größer 7!");
		}

		feld[y][x] = neuerInhalt;

	}

}

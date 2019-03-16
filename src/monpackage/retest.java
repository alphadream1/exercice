package monpackage;

public class retest {

	public static void main(String[] args) {
		String maString = " Toto en vacance ";
		System.out.println(maString + ".");
		System.out.println("ma string sans 'e' : " + sansLesE(maString) + ".");
		System.out.println("dans ma string il y a " + compteurA(maString) + " fois la lettre a.");
		System.out.println("ma string a l'envers : " + inverse(maString) + ".");
		System.out.println("dans ma string il y a " + compteurMaj(maString) + " majuscule.");
		System.out.println("ma string sans voyelles : " + sansVoyelle(maString) + ".");
		System.out.println("ma string sans majuscule : " + sansMajuscule(maString) + ".");
		System.out.println("mpn caractère le plus grand dans ma string est : " + plusGrandChar(maString) + ".");
		System.out.println("ma string sans espace devant :" + sansEspaceDevant(maString) + ".");
		System.out.println("ma string sans espace au debut et a la fin :" + trim(maString) + ".");
		System.out.println("ma string est elle un palindrome : " + palindrome(maString) + ".");
		System.out.println("ma string est elle un palindrome : " + palindrome("kayak") + ".");
		System.out.println("le code moyen Ascii de ma string est : " + moyenneAscii(maString) + ".");
		System.out.print("les nombres multiple de 47 inferieur a 10000 sont : ");
		multiple47();
		System.out.println(
				"le plus petit nombre divisible par 11/7/5 et dont la somme avec son predecesseur divisé par 36 donne un reste de 1 est : "
						+ plusPetitNbre() + ".");

	}

	public static String sansLesE(String maString) {
		String stringSansE = "";
		for (int i = 0; i < maString.length(); i++) {
			char c = maString.charAt(i);
			if (c != 'e' && c != 'E') {
				stringSansE = stringSansE + c;
			}
		}

		return stringSansE;
	}

	public static int compteurA(String maString) {
		int compteur = 0;
		for (int i = 0; i < maString.length(); i++) {
			char c = maString.charAt(i);
			if (c == 'a' || c == 'A') {
				compteur++;
			}
		}
		return compteur;
	}

	public static String inverse(String maString) {
		String stringInverser = "";
		for (int i = maString.length() - 1; i >= 0; i--) {
			char c = maString.charAt(i);
			stringInverser += c;
		}
		return stringInverser;
	}

	public static int compteurMaj(String maString) {
		int compteur = 0;
		for (int i = 0; i < maString.length(); i++) {
			char maj = maString.charAt(i);
			if (maj >= 'A' && maj <= 'Z') {
				compteur++;
			}
		}
		return compteur;
	}

	public static String sansVoyelle(String maString) {
		String maStringSansVoyelle = "";
		for (int i = 0; i < maString.length(); i++) {
			char j = maString.charAt(i);
			if (j != 'a' && j != 'e' && j != 'i' && j != 'o' && j != 'u' && j != 'y') {
				maStringSansVoyelle += j;
			}
		}
		return maStringSansVoyelle;
	}

	public static String sansMajuscule(String maString) {
		String sansMajusculeString = "";
		for (int i = 0; i < maString.length(); i++) {
			char c = maString.charAt(i);
			if (c == 'A') {
				c = 'a';
			} else if (c == 'B') {
				c = 'b';
			} else if (c == 'C') {
				c = 'C';
			} else if (c == 'D') {
				c = 'd';
			} else if (c == 'E') {
				c = 'e';
			} else if (c == 'F') {
				c = 'f';
			} else if (c == 'G') {
				c = 'g';
			} else if (c == 'H') {
				c = 'h';
			} else if (c == 'I') {
				c = 'i';
			} else if (c == 'J') {
				c = 'j';
			} else if (c == 'K') {
				c = 'k';
			} else if (c == 'L') {
				c = 'l';
			} else if (c == 'M') {
				c = 'm';
			} else if (c == 'N') {
				c = 'n';
			} else if (c == 'O') {
				c = 'o';
			} else if (c == 'P') {
				c = 'p';
			} else if (c == 'Q') {
				c = 'q';
			} else if (c == 'R') {
				c = 'r';
			} else if (c == 'S') {
				c = 's';
			} else if (c == 'T') {
				c = 't';
			} else if (c == 'U') {
				c = 'u';
			} else if (c == 'V') {
				c = 'v';
			} else if (c == 'W') {
				c = 'w';
			} else if (c == 'X') {
				c = 'x';
			} else if (c == 'Y') {
				c = 'y';
			} else if (c == 'Z') {
				c = 'z';
			}
			sansMajusculeString += c;
		}
		return sansMajusculeString;
	}

	public static char plusGrandChar(String maString) {
		char plusGrand = 0;
		for (int i = 0; i < maString.length(); i++) {
			char c = maString.charAt(i);
			if (c > plusGrand) {
				plusGrand = c;
			}
		}
		return plusGrand;
	}

	public static String sansEspaceDevant(String maString) {
		String sansEspaceDevantString = "";
		for (int i = 0; i < maString.length(); i++) {
			char c = maString.charAt(i);
			if (c != ' ' || sansEspaceDevantString != "") {
				sansEspaceDevantString += c;
			}
		}
		return sansEspaceDevantString;
	}

	public static String trim(String maString) {
		String sansEspaceDebutFinString = sansEspaceDevant(maString);
		sansEspaceDebutFinString = inverse(sansEspaceDebutFinString);
		sansEspaceDebutFinString = sansEspaceDevant(sansEspaceDebutFinString);
		sansEspaceDebutFinString = inverse(sansEspaceDebutFinString);

		return sansEspaceDebutFinString;
	}

	public static boolean palindrome(String maString) {
		String stringDroite = "";
		String stringGauche = "";
		for (int i = 0; i < maString.length(); i++) {
			char c = maString.charAt(i);
			if (c != ' ') {
				stringDroite += c;
			}
		}
		for (int i = maString.length() - 1; i >= 0; i--) {
			char c = maString.charAt(i);
			if (c != ' ') {
				stringGauche += c;
			}
		}
		if (stringDroite.equals(stringGauche)) {
			return true;
		} else {
			return false;
		}
	}

	public static int moyenneAscii(String maString) {
		int moyenne = 0;
		int compteur = 0;
		for (int i = 0; i < maString.length(); i++) {
			moyenne += maString.charAt(i);
			compteur++;
		}
		return moyenne / compteur;
	}

	// a l'aide d'une boucle FOR afficher les nombres multiples de 47 entre 1 et
	// 10000 dans la console
	public static void multiple47() {
		for (int i = 47; i < 10000; i += 47) {
			System.out.print(i + " ");
		}
		System.out.println();// pour revenir a la ligne après les resultats
	}

	public static int plusPetitNbre() {
		int resultat = 0;
		while (true) {
			if (resultat % 7 == 0 && resultat % 11 == 0 && resultat % 5 == 0) {
				if ((resultat + (resultat - 1)) % 36 == 1) {
					return resultat;
				}
			}
			resultat++;
		}
	}

}

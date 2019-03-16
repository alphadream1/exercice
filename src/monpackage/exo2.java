package monpackage;

public class exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String monString = "  la mariee ira mal  ";
		System.out.println(monString);

		// sans les e
		String reString = sansLesE(monString);
		System.out.println("sans les e : " + reString);

		// compte le nombre a
		int nombreDeA = nbreA(monString);
		System.out.println("nombre de a : " + nombreDeA);

		// inverse la chaine de caractere
		String invers = inverser(monString);
		System.out.println("phrase a l'envers : " + invers);

		// nombre de majuscule
		int nombreDeMaj = nbreMaj(monString);
		System.out.println("nombre de majuscule : " + nombreDeMaj);

		// sans les voyelles (minuscule uniquement)
		String sansVoy = sansVoyelle(monString);
		System.out.println("sans les voyelles : " + sansVoy);

		// retourne la chaine sans majuscule
		String sansM = sansMaj(monString);
		System.out.println("sans les majuscules : " + sansM);

		// plus grand caractere de la chaine
		char plusG = plusGrand(monString);
		System.out.println("le plus grand caractere est : " + plusG);

		// retire les espaces au debut
		String sansLesEspaces = sansEspaceDebut(monString);
		System.out.println("sans les espaces au d�but:" + sansLesEspaces);

		// retire les espace au debut et a la fin(my)
		System.out.println("sans les espaces au debut et a la fin (by moi):" + debutFin(monString));

		// retire les espace au debut et a la fin(trim)
		System.out.println("sans les espace au debut et a la fin (method trim):" + monString.trim());

		// savoir si c'est un palindrome(peut etre lu dans les 2 sens)
		System.out.println("votre texte est il un palindrome? reponse : " + palindrome(monString));

		// moyenne ascii des caracteres
		System.out.println("la moyenne des caracteres ascii dans la string est: " + moyenne(monString));

		System.out.println("----------------------------");
		System.out.println("Multiple 47 :");
		multiple47();
		plusPetitNombre();

	}

	// sans les e
	public static String sansLesE(String monString) {
		String sansE = "";
		for (int i = 0; i < monString.length(); i++) {
			char c = monString.charAt(i);
			if (c != 'e' && c != 'E') {
				sansE = sansE + c;
			}
		}
		return sansE;
	}

	// nombre de a
	public static int nbreA(String monString) {
		int a = 0;
		for (int i = 0; i < monString.length(); i++) {
			char c = monString.charAt(i);
			if (c == 'a' || c == 'A') {
				a++;
			}
		}
		return a;
	}

	// inverser la phrase
	public static String inverser(String monString) {
		String aLEnver = "";
		for (int i = monString.length() - 1; i >= 0; i--) {
			char c = monString.charAt(i);
			aLEnver += c;
		}
		return aLEnver;
	}

	// nombre de majuscule
	public static int nbreMaj(String monString) {// a revoir pas bon!!!
		int M = 0;
		for (int i = 0; i < monString.length(); i++) {
			char maj = monString.charAt(i);
			if (maj >= 'A' && maj <= 'Z') {
				M++;
			}
		}
		return M;
	}

	// enlever les voyelles
	public static String sansVoyelle(String monString) {
		String sansV = "";
		for (int i = 0; i < monString.length(); i++) {
			char c = monString.charAt(i);
			if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'y') {
				sansV = sansV + c;
			}
		}
		return sansV;
	}

	// changer les majuscule en minuscule
	public static String sansMaj(String monString) {
		String sansMaj = "";
		for (int i = 0; i < monString.length(); i++) {
			char c = monString.charAt(i);
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
			sansMaj += c;
		}
		return sansMaj;
	}

	// caractere le plus grand
	public static char plusGrand(String monString) {
		char plusGr = 0;
		for (int i = 0; i < monString.length(); i++) {
			char a = monString.charAt(i);
			if (a > plusGr) {
				plusGr = a;
			}
		}
		return plusGr;
	}

	// enlever les espaces au debut
	public static String sansEspaceDebut(String monString) {
		String sansEspaceAuxDebut = "";
		for (int i = 0; i < monString.length(); i++) {
			char c = monString.charAt(i);
			if (c != ' ' || sansEspaceAuxDebut != "") {
				sansEspaceAuxDebut += c;
			}
		}
		return sansEspaceAuxDebut;
	}

	// enlever espace debut et fin
	public static String debutFin(String monString) {
		String endStart = "";
		String startEnd = "";
		for (int i = monString.length() - 1; i > 0; i--) {
			char c = monString.charAt(i);
			if (c != ' ' || endStart != "") {
				endStart += c;
			}
		}
		for (int i = endStart.length() - 1; i >= 0; i--) {
			char c = endStart.charAt(i);
			if (c != ' ' || startEnd != "") {
				startEnd += c;
			}
		}
		return startEnd;
	}

	// palindrome
	public static boolean palindrome(String monString) {
		String palin1 = "";
		String palin2 = "";
		for (int i = 0; i < monString.length(); i++) {
			char c = monString.charAt(i);
			if (c != ' ') {
				palin1 += c;
			}
		}
		for (int i = monString.length() - 1; i > 0; i--) {
			char c = monString.charAt(i);
			if (c != ' ') {
				palin2 += c;
			}
		}
		if (palin1.equals(palin2)) {
			return true;
		} else {
			return false;
		}
	}

	// a l'aide d'une boucle FOR afficher les nombres multiples de 47 entre 1 et
	// 10000 dans la console
	public static void multiple47() {
		for (int i = 47; i < 10000; i += 47) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// calcul moyenne des caractere en ascii
	public static int moyenne(String monString) {
		int somme = 0;
		int diviseur = 0;
		int res = 0;
		for (int i = 0; i < monString.length(); i++) {
			somme += monString.charAt(i);
			diviseur++;
		}
		res = somme / diviseur;
		return res;
	}

	// a l'aide d'une boucle while trouver le plus petit nombre respectant ces
	// conditions:
	// divisible par 7, par 11, par 5
	// et dont la somme avec son predecesseur diviser par 36 donne un reste de 1
	public static void plusPetitNombre() {
		int i = 1;
		while (true) {
			if (i % 7 == 0 && i % 11 == 0 && i % 5 == 0) {
				if ((i + (i - 1)) % 36 == 1) {
					System.out.println("Le bon chiffre est  : " + i);
					return;
				}
			}
			i++;
		}
	}
}

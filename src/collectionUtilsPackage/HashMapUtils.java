package collectionUtilsPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import packageObjet.EleveBean;

public class HashMapUtils {

	public static void main(String[] args) {

		HashMap<Integer, EleveBean> mesEleves;
		mesEleves = new HashMap<>();

		creationEleves(mesEleves);
		System.err.println(mesEleves.size());
		printHashMap(mesEleves);
		System.err.println(mesEleves.values());
	}

	public static void creationEleves(HashMap<Integer, EleveBean> mesEleves) {
		for (int i = 0; i < 50; i++) {
			EleveBean eleveBean = new EleveBean();
			eleveBean.setNom(getRandomName());
			mesEleves.put(i, eleveBean);
		}
	}

	public static void printHashMap(HashMap<Integer, EleveBean> mesEleves) {
		for (Map.Entry<Integer, EleveBean> unEleve : mesEleves.entrySet()) {

			System.out.println(unEleve);
		}
	}

	public static String getRandomName() {
		String[] name = new String[] { "0Eleve", "1Eleve", "2Eleve", "3Eleve", "4Eleve", "5Eleve", "6Eleve", "7Eleve",
				"8Eleve", "9Eleve" };
		return name[new Random().nextInt(name.length)];
	}

}

package monpackage;

public class megaTab {

	public static void main() {
		long debut = System.currentTimeMillis();
		int[] megaTab = new int[10000];

		for (int i = 0; i < 100; i++) {
			ArrayUtils.fillTab(megaTab);
			ArrayUtils.sortTab(megaTab);
		}
		long fin = System.currentTimeMillis();
		long time = fin - debut;
		System.out.println(time);
	}

}

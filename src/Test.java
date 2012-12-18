public class Test {

	public static void main(String[] args) {
		test1();

		System.out.println();
		System.out
				.println("+*~_+*~_+*~_+*~_+*~_+*~_+*~_+*~_+*~_+*~_+*~_+*~_*~_+*~_+*~_+*~_*~_+*~_+*~_+*~_+");
		System.out.println();

		test2();

		System.out.println();
		System.out
				.println("+*~_+*~_+*~_+*~_+*~_+*~_+*~_+*~_+*~_+*~_+*~_+*~_*~_+*~_+*~_+*~_*~_+*~_+*~_+*~_+");
		System.out.println();

		test3();
	}

	private static void test1() {
		Bestellung<Keks> bestellung = new Bestellung<Keks>();
		Dose<Keks> dose;

		bestellung.add(1, new Keks(new WeihMannForm(), new MuerbTeig()));
		bestellung.add(3, new Keks(new WeihMannForm(), new MuerbTeig()));
		bestellung.add(2, new Keks(new RundForm(), new SchokoladeTeig()));
		bestellung.add(3, new Keks(new RundForm(), new ZimtTeig()));
		bestellung.add(4, new Keks(new MondForm(), new SchokoladeTeig()));

		System.out.println("1.Bestellung:");
		bestellung.drucke();

		dose = bestellung.backe();

		System.out.println("\nInhalt:");
		dose.inhalt();
	}

	private static void test2() {
		Bestellung<Keks> bestellung = new Bestellung<Keks>();
		Dose<Keks> dose;

		bestellung.add(15, new Doppelkeks(new MondForm(), new SchokoladeTeig(),
				new MarmeladeFuellung()));
		bestellung.add(25, new Keks(new RundForm(), new ZimtTeig()));
		bestellung.add(2, new Doppelkeks(new MondForm(), new MuerbTeig(),
				new SchokoladeFuellung()));
		bestellung.add(9, new Keks(new WeihMannForm(), new SchokoladeTeig()));
		bestellung.add(13, new Doppelkeks(new WeihMannForm(),
				new SchokoladeTeig(), new SchokoladeFuellung()));
		bestellung.add(33, new Keks(new MondForm(), new ZimtTeig()));

		System.out.println("2.Bestellung:");
		bestellung.drucke();

		dose = bestellung.backe();

		System.out.println("\nInhalt:");
		dose.inhalt();
	}

	private static void test3() {
		Bestellung<Backware> bestellung = new Bestellung<Backware>();
		Dose<Backware> dose;

		bestellung.add(1, new Doppelkeks(new MondForm(), new SchokoladeTeig(),
				new MarmeladeFuellung()));
		bestellung.add(2, new Keks(new RundForm(), new ZimtTeig()));
		bestellung.add(5, new Keks(new WeihMannForm(), new SchokoladeTeig()));
		bestellung.add(8, new Doppelkeks(new WeihMannForm(),
				new SchokoladeTeig(), new SchokoladeFuellung()));
		bestellung.add(3, new Keks(new MondForm(), new ZimtTeig()));
		bestellung.add(5, new Keks(new WeihMannForm(), new MuerbTeig()));
		bestellung.add(3, new Keks(new WeihMannForm(), new MuerbTeig()));
		bestellung.add(2, new Keks(new RundForm(), new SchokoladeTeig()));
		bestellung.add(3, new Keks(new RundForm(), new ZimtTeig()));
		bestellung.add(4, new Keks(new MondForm(), new SchokoladeTeig()));
		bestellung.add(8, new Doppelkeks(new RundForm(), new SchokoladeTeig(),
				new SchokoladeFuellung()));
		bestellung.add(4, new Doppelkeks(new WeihMannForm(), new MuerbTeig(),
				new MarmeladeFuellung()));
		bestellung.add(10, new Doppelkeks(new MondForm(), new ZimtTeig(),
				new SchokoladeFuellung()));
		bestellung.add(2, new Doppelkeks(new MondForm(), new SchokoladeTeig(),
				new MarmeladeFuellung()));

		System.out.println("3.Bestellung:");
		bestellung.drucke();

		dose = bestellung.backe();

		System.out.println("\nInhalt:");
		dose.inhalt();
	}
}

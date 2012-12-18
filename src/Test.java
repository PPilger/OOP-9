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
		Bestellung bestellung = new Bestellung();
		Dose dose;

		bestellung.add(new KeksPosition(1, new WeihnachtsmannForm(),
				new MuerbTeig()));
		bestellung.add(new KeksPosition(3, new WeihnachtsmannForm(),
				new MuerbTeig()));
		bestellung
				.add(new KeksPosition(2, new RundeForm(), new SchokoladeTeig()));
		bestellung.add(new KeksPosition(3, new RundeForm(), new ZimtTeig()));
		bestellung
				.add(new KeksPosition(4, new MondForm(), new SchokoladeTeig()));

		System.out.println("1.Bestellung:");
		bestellung.drucke();

		dose = bestellung.backe();

		System.out.println("\nInhalt:");
		dose.inhalt();
	}

	private static void test2() {

		Bestellung bestellung = new Bestellung();
		Dose dose;

		bestellung.add(new DoppelkeksPosition(15, new MondForm(),
				new SchokoladeTeig(), new MarmeladeFuellung()));
		bestellung.add(new KeksPosition(25, new RundeForm(), new ZimtTeig()));
		bestellung.add(new DoppelkeksPosition(2, new MondForm(),
				new MuerbTeig(), new SchokoladeFuellung()));
		bestellung.add(new KeksPosition(9, new WeihnachtsmannForm(),
				new SchokoladeTeig()));
		bestellung.add(new DoppelkeksPosition(13, new WeihnachtsmannForm(),
				new SchokoladeTeig(), new SchokoladeFuellung()));
		bestellung.add(new KeksPosition(33, new MondForm(), new ZimtTeig()));

		System.out.println("2.Bestellung:");
		bestellung.drucke();

		dose = bestellung.backe();

		System.out.println("\nInhalt:");
		dose.inhalt();
	}

	private static void test3() {

		Bestellung bestellung = new Bestellung();
		Dose dose;

		bestellung.add(new DoppelkeksPosition(1, new MondForm(),
				new SchokoladeTeig(), new MarmeladeFuellung()));
		bestellung.add(new KeksPosition(2, new RundeForm(), new ZimtTeig()));
		bestellung.add(new KeksPosition(5, new WeihnachtsmannForm(),
				new SchokoladeTeig()));
		bestellung.add(new DoppelkeksPosition(8, new WeihnachtsmannForm(),
				new SchokoladeTeig(), new SchokoladeFuellung()));
		bestellung.add(new KeksPosition(3, new MondForm(), new ZimtTeig()));
		bestellung.add(new KeksPosition(5, new WeihnachtsmannForm(),
				new MuerbTeig()));
		bestellung.add(new KeksPosition(3, new WeihnachtsmannForm(),
				new MuerbTeig()));
		bestellung
				.add(new KeksPosition(2, new RundeForm(), new SchokoladeTeig()));
		bestellung.add(new KeksPosition(3, new RundeForm(), new ZimtTeig()));
		bestellung
				.add(new KeksPosition(4, new MondForm(), new SchokoladeTeig()));
		bestellung.add(new DoppelkeksPosition(8, new RundeForm(),
				new SchokoladeTeig(), new SchokoladeFuellung()));
		bestellung.add(new DoppelkeksPosition(4, new WeihnachtsmannForm(),
				new MuerbTeig(), new MarmeladeFuellung()));
		bestellung.add(new DoppelkeksPosition(10, new MondForm(),
				new ZimtTeig(), new SchokoladeFuellung()));
		bestellung.add(new DoppelkeksPosition(2, new MondForm(),
				new SchokoladeTeig(), new MarmeladeFuellung()));

		System.out.println("3.Bestellung:");
		bestellung.drucke();

		dose = bestellung.backe();

		System.out.println("\nInhalt:");
		dose.inhalt();
	}
}

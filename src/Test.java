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
				Teig.Muerbteig));
		bestellung.add(new KeksPosition(3, new WeihnachtsmannForm(),
				Teig.Muerbteig));
		bestellung
				.add(new KeksPosition(2, new RundeForm(), Teig.Schokoladeteig));
		bestellung.add(new KeksPosition(3, new RundeForm(), Teig.Zimtteig));
		bestellung
				.add(new KeksPosition(4, new MondForm(), Teig.Schokoladeteig));

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
				Teig.Schokoladeteig, Fuellung.Marmelade));
		bestellung.add(new KeksPosition(25, new RundeForm(), Teig.Zimtteig));
		bestellung.add(new DoppelkeksPosition(2, new MondForm(),
				Teig.Muerbteig, Fuellung.Schokolade));
		bestellung.add(new KeksPosition(9, new WeihnachtsmannForm(),
				Teig.Schokoladeteig));
		bestellung.add(new DoppelkeksPosition(13, new WeihnachtsmannForm(),
				Teig.Schokoladeteig, Fuellung.Schokolade));
		bestellung.add(new KeksPosition(33, new MondForm(), Teig.Zimtteig));

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
				Teig.Schokoladeteig, Fuellung.Marmelade));
		bestellung.add(new KeksPosition(2, new RundeForm(), Teig.Zimtteig));
		bestellung.add(new KeksPosition(5, new WeihnachtsmannForm(),
				Teig.Schokoladeteig));
		bestellung.add(new DoppelkeksPosition(8, new WeihnachtsmannForm(),
				Teig.Schokoladeteig, Fuellung.Schokolade));
		bestellung.add(new KeksPosition(3, new MondForm(), Teig.Zimtteig));
		bestellung.add(new KeksPosition(5, new WeihnachtsmannForm(),
				Teig.Muerbteig));
		bestellung.add(new KeksPosition(3, new WeihnachtsmannForm(),
				Teig.Muerbteig));
		bestellung
				.add(new KeksPosition(2, new RundeForm(), Teig.Schokoladeteig));
		bestellung.add(new KeksPosition(3, new RundeForm(), Teig.Zimtteig));
		bestellung
				.add(new KeksPosition(4, new MondForm(), Teig.Schokoladeteig));
		bestellung.add(new DoppelkeksPosition(8, new RundeForm(),
				Teig.Schokoladeteig, Fuellung.Schokolade));
		bestellung.add(new DoppelkeksPosition(4, new WeihnachtsmannForm(),
				Teig.Muerbteig, Fuellung.Marmelade));
		bestellung.add(new DoppelkeksPosition(10, new MondForm(),
				Teig.Zimtteig, Fuellung.Schokolade));
		bestellung.add(new DoppelkeksPosition(2, new MondForm(),
				Teig.Schokoladeteig, Fuellung.Marmelade));

		System.out.println("3.Bestellung:");
		bestellung.drucke();

		dose = bestellung.backe();

		System.out.println("\nInhalt:");
		dose.inhalt();
	}
}

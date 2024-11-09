import java.util.Scanner;

public class ManavKasaOdev {

	public static void main(String[] args) {
		
		int armut, elma, domates, muz, patlican;
		float tutar, karm = 2.14f,kelma = 3.67f,kdomates = 1.11f,kmuz = 0.95f,kpatlican = 5f;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Armut kaç kilo : ");
		armut = input.nextInt();
		
		System.out.print("Elma kaç kilo : ");
		elma = input.nextInt();
		
		System.out.print("Domates kaç kilo : ");
		domates = input.nextInt();
		
		System.out.print("Muz kaç kilo : ");
		muz = input.nextInt();
		
		System.out.print("Patlıcan kaç kilo : ");
		patlican = input.nextInt();
		
		tutar = armut*karm + elma*kelma + domates*kdomates + muz*kmuz + patlican*kpatlican;
		System.out.print("Toplam tutar : " + tutar);
	}

}

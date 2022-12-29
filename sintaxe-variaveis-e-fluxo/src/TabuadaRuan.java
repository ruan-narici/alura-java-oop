
public class TabuadaRuan {

	public static void main(String[] args) {
		for (int operando1 = 1; operando1 <= 10; operando1++) {
			System.out.println("Tabuada do número " + operando1);
			for (int operando2 = 0; operando2 <= 10; operando2++) {
				System.out.print(operando1 + "x" + operando2 + "=" + operando1 * operando2);
				System.out.print(" ");
			}
			System.out.println();
			System.out.println();
		}
	}
}

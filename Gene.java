public class Gene {
	Gene() {
	}

	public static boolean isValidDNA(String str) {
		if (str.matches("^[ACGT]+$") == true) {
			return true;
		} else {
			return false;
		}
	}

	public static String isPotentialGene(String str) {
		if (str.length() % 3 == 0 && str.matches("ATG.+$")
				&& (str.matches(".+[T][A][G]$") || str.matches(".+[T][A][A]$") || str.matches(".+[T][G][A]$"))
				&& !(str.matches(".+[T][A][G].+$") || str.matches(".+[T][A][A].+$") || str.matches(".+[T][G][A].+$"))) {
			return "Is potential gene";
		} else {
			return "Is NOT potential gene";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter DNA String: ");
		String s = StdIn.readLine();
		while (!Gene.isValidDNA(s)) {
			System.out.println("Not valid DNA ");
			System.out.println("Enter DNA String: ");
			s = StdIn.readLine();
		}

		System.out.println(s);

		System.out.println(Gene.isPotentialGene(s));
	}

}
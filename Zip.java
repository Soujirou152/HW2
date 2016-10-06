
public class Zip {
	private String zipCode;
	private boolean isPlus4;

	public String getZipCode() {
		return zipCode;
	}

	public String getZipPrefix() {
		if (isPlus4 == true) {
			String s = zipCode.substring(0, 5);
			return s;
		} else {
			return zipCode;
		}
	}

	public String toString() {
		return zipCode;
	}

	public boolean equals(Zip code) {
		String s = zipCode.substring(0, 5);
		if (s.equals(code.getZipPrefix()) == true) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isPlus4() {
		return isPlus4;
	}

	Zip(String s) {
		zipCode = s;
		if (zipCode.matches("^\\d{5}") == true) {
			isPlus4 = false;

		} else if (zipCode.matches("^\\d{5}-\\d{4}") == true) {
			isPlus4 = true;
		} else {
			zipCode = "00000";
			isPlus4 = false;
		}
	}

	public static void main(String[] args) {
		String s1 = "06006";
		String s2 = "06006-5743";
		String s3 = "11231321-111";

		Zip zip1 = new Zip(s1);
		Zip zip2 = new Zip(s2);
		Zip zip3 = new Zip(s3);

		System.out.println(zip1.getZipCode());
		System.out.println(zip2.getZipCode());
		System.out.println(zip3.getZipCode());

		System.out.println(zip1.getZipPrefix());
		System.out.println(zip2.getZipPrefix());
		System.out.println(zip3.getZipPrefix());

		System.out.println(zip1.isPlus4);
		System.out.println(zip2.isPlus4);
		System.out.println(zip3.isPlus4);

		System.out.println(zip1.toString());
		System.out.println(zip2.toString());
		System.out.println(zip3.toString());

		System.out.println(zip1.equals(zip2));
		System.out.println(zip2.equals(zip1));

		System.out.println(zip1.equals(zip3));
		System.out.println(zip2.equals(zip3));

		System.out.println(zip3.equals(zip1));
		System.out.println(zip3.equals(zip2));

	}

}

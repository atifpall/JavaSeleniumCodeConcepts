package javaConcepts;

public class ReverseString {

	public static void main(String[] args) {

//		String output = ReverseString.reverseString(null);
//		System.out.println(output);

		String str = "AtifAyra";
		StringBuffer sb = new StringBuffer(str);
		StringBuffer value = sb.reverse();
		System.out.println(value);
		// System.out.println(sb.reverse());

	}

	public static String reverseString(String name) {

		if (name == null) {
			System.out.println("you are passing a null value...");
			return null;
		}

		int len = name.length();

		if (len == 1) {

			return name;
		}

		String rev = "";

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);

		}

		return rev;

	}

}

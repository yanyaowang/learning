
public class test1 {

	public static void main(String[] args) {
		String a = "  +b12102370352";
		String p = "[+|-]*\\d+";
		String p_1 = "[\\D]+";
//		String p = "[+|-]+\\d+";
		String w = "\\s+";
		int result = 0;
		System.out.println(a.matches(p_1));

	}

}

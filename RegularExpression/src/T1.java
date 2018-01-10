import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import java.lang.Math;

public class T1 {


	public static void main(String[] args) {
//		String a = "   - 321";
		String a = "  +b121-02370352";
		
//		int r = atoi(a);
		System.out.println(atoi(a));
//		System.out.println(Integer.parseInt("11111111111"));
	}

	public static String atoi(String str){
		int result = 0;
		boolean check = true;
		String temp = "";
		
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == ' '){
			}
			else{
				if(str.substring(i, i+1).matches("\\d")){
					temp += str.charAt(i);
				}
				else{
					if(str.substring(i, i+1).matches("[+-]")){
						if(check){
							temp += str.charAt(i);
							check = false;
						}
						else
							break;
					}
					else
						break;
				}
			}		
		}
		
		
		return temp;
	}

}

/**
	public static int atoi(String str){
		String p = "[+|-]*\\d+";
		String p_1 = "[\\D&&^[+|-]]+";
//		String p = "[+|-]+\\d+";
		String w = "\\s+";
		int result = 0;
		
		str = str.trim();
		Pattern pa = Pattern.compile(p);
		Matcher ma = pa.matcher(str);
		
		if(ma.find()){
			String number = ma.group(0);
			
			System.out.println(number);
			Pattern white = Pattern.compile(w);
			Matcher m = white.matcher(number);

			if(m.find()){
				return 0;
			}
//			System.out.println(number);
			
			if((number.charAt(0) == '+' || number.charAt(0) == '-')
				&& (number.charAt(1) == '+' || number.charAt(1) == '-')){
				return 0;
			}
			try{
				result = Integer.parseInt(number);
			}catch(NumberFormatException nfe){
				if(number.charAt(0) == '-'){
					return Integer.MIN_VALUE;
				}
				else{
					return Integer.MAX_VALUE;
				}
			}
		}
		else
			return 0;
		
		
		return result;
	}

}

*/

//if(number.charAt(0) == '-'){
//sign = -1;
//number = number.substring(1, number.length());
//}
//else{
//if(number.charAt(0) == '+'){
//	number = number.substring(1, number.length());
//}
//}

//for(int i = 0; i < number.length(); i++){
////result = number;
//}

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Formater {
	public static void main(String[] args){
		formatNumber("");
		formatNumber(" ");
		formatNumber("	");
		formatNumber("5551234");
		formatNumber("2505551234");
		formatNumber("250-555-1234");
		formatNumber("250 555 1234");
		formatNumber("   250    555    1234    ");
		formatNumber("(250)5551234");
		formatNumber("250.555.1234");
		formatNumber("(250).555.1234");
		formatNumber("2505551234");
		formatNumber("12505551234");
		formatNumber("+12505551234");
		formatNumber("1 250 555 1234");
		formatNumber("+1 250 555 1234");
		formatNumber("12345678");
		formatNumber("12-12-111");
		formatNumber("2505551234 ext5");
	}

	public static void formatNumber(String phoneNum) {
		phoneNum = phoneNum.trim();
		String regex = "^\\(?(\\+*1)?[-.\\s*]?([0-9]{3})\\)?[-.\\s*]?([0-9]{3})[-.\\s*]?([0-9]{4})$";
		Matcher matcher = Pattern.compile(regex).matcher(phoneNum);

		System.out.println(phoneNum);

		if(matcher.matches()) {
			System.out.println("NORTH AMERICA MATCHED! Formatted: " + matcher.replaceFirst("($2) $3-$4") + "\r\n");
			return;
		} 

		System.out.println("Indeterminate: " + phoneNum + "\r\n");	
	}
}

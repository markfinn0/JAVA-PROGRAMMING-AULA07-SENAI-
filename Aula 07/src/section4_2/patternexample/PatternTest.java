package section4_2.patternexample;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {

	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		Pattern cpf=Pattern.compile("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");
		
		System.out.println("Digite seu CPF: ");
		String CPF = input.next();
		
		System.out.println(isMatch(CPF,cpf));
	}
	
	public static boolean isMatch(String CPF, Pattern cpf) {
		Matcher matcher=cpf.matcher(CPF);
		return matcher.matches();
		
		
	}
	
}

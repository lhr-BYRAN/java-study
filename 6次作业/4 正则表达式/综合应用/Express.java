package week11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Express {
	public static void main(String[] args) {
		String express = "add(2,max(1,add(1,3)))";
		String regex = "((add)|(sub)|(max)|(min)|(doubleMe))\\(\\d{1,}(,\\d{1,})?\\)";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(express);	
		String s = express;
			
		while (m.find()) {
			String basicExpress = m.group();
			String result = cal(basicExpress);
			System.out.println("ȡ���ı��ʽΪ" + basicExpress + "=" + result);
			basicExpress = basicExpress.replaceAll("\\(", "\\\\(");
			basicExpress = basicExpress.replaceAll("\\)", "\\\\)");
			System.out.println("ԭ���ʽΪ:" + s);
			s = s.replaceAll(basicExpress, result);
			System.out.println("�任��:" + s);
			m = p.matcher(s);
		}	
		System.out.println("������:");
		System.out.println(express + "=" + s);			
		
	}


	public static String cal(String express) {
		String result = "";
		int pos1 = express.indexOf("(");

		String operateCode = express.substring(0, pos1);

		int pos2, pos3;
		int number = 0, number1 = 0, number2 = 0;
		if (operateCode.equals("doubleMe")) {
			pos3 = express.indexOf(")");
			String operateNumber = express.substring(pos1 + 1, pos3);
			number = Integer.parseInt(operateNumber);
		}

		else {
			pos2 = express.indexOf(",");
			pos3 = express.indexOf(")");
			String operateNumber1 = express.substring(pos1 + 1, pos2);
			String operateNumber2 = express.substring(pos2 + 1, pos3);

			number1 = Integer.parseInt(operateNumber1);
			number2 = Integer.parseInt(operateNumber2);
		}

		int result1 = 0;
		switch (operateCode) {
		case "add":
			result1 = number1 + number2;
			break;
		case "sub":
			result1 = number1 - number2;
			break;
		case "max":
			result1 = number1 > number2 ? number1 : number2;
			break;
		case "min":
			result1 = number1 < number2 ? number1 : number2;
			break;
		case "doubleMe":
			result1 = number * 2;
			break;
		default:
			System.out.println("�ݲ�֧��");
		}

		result = String.valueOf(result1);

		return result;
	}
}

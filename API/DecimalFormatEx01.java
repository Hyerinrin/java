package API;

import java.text.DecimalFormat;

public class DecimalFormatEx01 {

	public static void main(String[] args) {
		int price = 2650000;
		System.out.println(price);
		DecimalFormat df;
		df = new DecimalFormat("#,###원");
		System.out.println(df.format(price));
		double num = 51246.36521;
		df = new DecimalFormat("#,###.00");
		System.out.println(df.format(num));

	}

}

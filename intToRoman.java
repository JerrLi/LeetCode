package Solution;

public class intToRoman {
	
    public static String intToRoman(int num) {
	        String roman[][] = { {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" },
			{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" },
			{"","C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" },
			{"", "M", "MM", "MMM" } };
			String str ="";
			int i = 0;
			while (num!=0)
			{
				int j = num % 10;
				str = roman[i++][j] + str;
				num = num / 10;
			}
			return str;
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 199;
		System.out.print(intToRoman(num));
		

	}

}

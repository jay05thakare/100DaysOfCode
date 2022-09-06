public class D26Q1_Binary_IP_to_hexadecimal_IP {
	int binaryToDecimal(long binary)
	{
		int decimalNumber = 0, i = 0;

		// loop to extract the digits of the binary
		while (binary > 0) {
			decimalNumber
				+= Math.pow(2, i++) * (binary % 10);

			// updating the binary by eliminating
			// the last digit on division by 10
			binary /= 10;
		}
		return decimalNumber;
	}

	// convert decimal to hexadecimal
	String decimalToHex(long binary)
	{
		int decimalNumber = binaryToDecimal(binary);

		String hexNumber
			= Integer.toHexString(decimalNumber);
		hexNumber = hexNumber.toUpperCase();

		return hexNumber;
	}

	public static void main(String[] args)
	{

		D26Q1_Binary_IP_to_hexadecimal_IP ob = new D26Q1_Binary_IP_to_hexadecimal_IP();

		long num = 10011110;    
    
		System.out.println("Inputted number : " +num);
		System.out.println(ob.decimalToHex(10011110));
	}
}

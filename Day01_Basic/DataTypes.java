class DataTypes
{
	public static void main(String[] args) {
		
		short s1 = 22;		 // short stores small integer values with less memory than int
		byte num = 20;		// byte stores very small integer values and saves memory
		int ino1 = 123456;		// int stores whole numbers and is the most commonly used integer type
		long value1 = 927367822;	// long stores very large integer values 

		char ch1 = 'K';		// char stores a single character using single quotes
		String name = "Komal";	// String stores a sequence of characters 
		boolean b1 = true;		// boolean stores only true or false values

		float f1 = 8828;		// float stores decimal numbers with less precision 	
		double d1 = 8784.2382783268; 	// double stores decimal numbers with high precision



		System.out.println("Short Value : " + s1);
		System.out.println("Byte Value : " + num);
		System.out.println("Integer Value : " + ino1);
		System.out.println("Long Value : " + value1);

		System.out.println("Char Value : " + ch1);
		System.out.println("String Value : " + name);
		System.out.println("Boolean Value : " + b1);

		System.out.println("Float Value : " + f1);
		System.out.println("Double Value : " + d1);
	}
}
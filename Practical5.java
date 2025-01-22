class Practical5 {
	int factorial1 (int number) {	
		int fact = 1;
		if (number == 0 || number == 1) {
			return 1;
		}
		else if (number < 0) {
			return 0; //Invalid Factorial
		}
		else {
			for (int i = 2; i <= number; i++) {
				fact *= i;
			}
		return fact;
		
		}
	}
	
	int factorial2 (int number) {
		int fact = 1;
		if (number == 0 || number == 1) {
			return 1;
		}
		else if (number < 0) {
			return 0;
		}
		else {
			int i = 2;
			while (i <= number) {
				fact *= i;
				i++;
			}
		return fact;
		}
	}
	
	int factorial3 (int number) {
		if (number == 0 || number == 1) {
			return 1;
		}
		else if (number < 0) {
			return 0;
		}
		else {
			return number * factorial3 (number - 1);
		}
	}
	
	int getSum(int[] numbers) {
        java.util.Arrays.parallelPrefix(numbers, (x, y) -> x + y); 
        return numbers[numbers.length - 1];
    }

	
	public static void main (String[] args) {
	
		Practical5 fact = new Practical5();
		int[] numbers = {1, 2, 3, 4, 5};
		int a = fact.factorial1(0);
		int b = fact.factorial1(-5);
		int c = fact.factorial1(5);
		int d = fact.factorial1(4);
		int e = fact.factorial1(3);
		int f = fact.getSum(numbers);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
}

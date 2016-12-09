package TestPackage;

public class Stapeltellen {	
	
	public int stapeltellen(int n) {
		
		int sum = 0;

		while (n > 9) {
			sum = 0;
			while (n > 0) {
				int rem = n % 10;
				sum = sum + rem;
				n = n / 10;
			}
			n = sum;
		}
		return sum;
	}

	public static void main(String[] args) {
		Stapeltellen stapelteller = new Stapeltellen();
		System.out.println(stapelteller.stapeltellen(782));
	}
	
}
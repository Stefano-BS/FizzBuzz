package fizzbuzz1;

public class Fizz {

	
	public static void main(String[] args) {
		String ris[] = valori(1, 100);
		for (int i=1; i<=100; i++) 
			System.out.println(ris[i-1]);
	}
	
	static String[] valori(int da, int a) {
		String risultato[] = new String[a-da+1];
		for (int i=da; i<=a; i++) 
			risultato[i-1] = fizzbuzz(i);
		return risultato;
	}
	
	static String fizzbuzz(int i) {
		if (i%5==0 && i%3==0) return "FizzBuzz";
		else if (i%3==0) return "Fizz";
		else if (i%5==0) return "Buzz";
		else return  "" + i;
	}
}

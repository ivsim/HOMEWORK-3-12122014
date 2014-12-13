package homework_exercises;

/*
 * Дефинирайте фунцкия която приема 3 параметъра - цели числа и
 * ги умножава едно с друго. Извикайте функцията 20 пъти с рандом
 * генерирани параметри. Изведете резултата на екрана
 */

import java.util.Random;

public class Exec4 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		for (int i=1; i<= 20; i++) {
			long number1 = rand.nextInt();
			long number2 = rand.nextInt();
			long number3 = rand.nextInt();
			
			long triple = tripleMultiply(number1, number2, number3);
			
			System.out.printf("%12s * %12s * %12s = %d%n", number1, number2, number3, triple);
		}
		
		

	} 
	
	public static long tripleMultiply(long num1, long num2, long num3){
		long multiply = num1 * num2 * num3;
		return multiply;
	}

}

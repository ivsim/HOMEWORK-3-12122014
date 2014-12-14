package homework_exercises;

/*
 * Да се състави програма на JAVA, която извежда сумата на всички числа от интервала 1 до въведено от конзолата число.
 * Числото трябва да е в интервала [10 - 30000].
 * Използвайте рекурсия за решението на задачата
 */

import java.util.Scanner;

public class Exec1 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please, enter integer [0;30000]: ");
		int num = input.nextInt();
		input.nextLine();
		
		System.out.printf("Sum of integers [0," + num + "] is: %d", sum(num));
		
		input.close();
		
	}
	
	public static int sum(int number)
	{
		if (number == 0)
		{
			return number;
		}
		
		else
			return number + sum(number - 1);
	}

}

package homework_exercises;

/*
 * Дефинирайте функция която приема 1 параметър - число и принтира на екрана
 * "четно" ако числото е четно и "нечетно" ако числото е нечетно.
 * Демонстрирайте действието на фукцията с няколкопримера
 */

import java.util.Scanner;

public class Exec5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		for(int i = 1; i<=4; i++){
			System.out.print("Моля, въведете число " + i + ": ");
			int num = input.nextInt();
			input.nextLine();
			oddevenCheck(num);
		}
		
		input.close();
	}
	
	public static void oddevenCheck(int a)
	{		
		switch (a)
		{
		case 0: System.out.println("нула");
		break;
		
		default:
			 if (a % 2 == 0) {System.out.println("четно");}
			 else {System.out.println("нечетно");}
		break;		
		}
	}

}

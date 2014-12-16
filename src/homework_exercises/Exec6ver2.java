package homework_exercises;

/*
 * Направете програма с функция която принтира всички симетрични числа в интервала [0 ; 999]
 */

public class Exec6ver2 {

	public static void main(String[] args) {
		
		for (int i = 0; i<1000; i++)
		{symnumberCheck(i);}	
		
	}
	
	public static void symnumberCheck(int a)
	{
		if (a == 0) {System.out.print(a + " ");}
		else
		{
		int hundred = a / 100;
		int ten = (a % 100) / 10;
		int single = (a % 100) % 10;
		
		if (hundred != 0 && hundred == single)
		{System.out.print(a + " ");}
		
		if (hundred == 0 && ten == single)
		{System.out.print(a + " ");}
		
		if (hundred == 0 && ten == 0)
		{System.out.print(a + " ");}
			

		}
	}

}

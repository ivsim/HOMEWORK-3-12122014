package homework_exercises;

/*
 * 	Направете двумерен масив от тип String с директна инициализация, който ще представлява таблица.
 	Таблицата представлява меню в ресторант като на първия ред трябва да изброят 3 вида супи,
 	на втория – 6 вида основни, а на третия 2 вида десерта. 
	Принтирайте таблицата на екрана във вида:
	Супи:  …..
	Основни: …….
	Десерти: ……..
 */

public class Exec3 {

	public static void main(String[] args) {
		
		String[][] menue = new String[][]{
		new String[] {"топчета", "шкембе", "боб"},
		new String[] {"пържола", "пържени кюфтета", "тас кебап", "кордон бльо", "шницел", "пиле фрикасе"},
		new String[] {"крем карамел", "сладолед"}
		};
		
		for (int i = 0; i < menue.length; i++ ){
			
			if (i == 0){System.out.print("Супи: ");}
			if (i == 1){System.out.print("Основни: ");}
			if (i == 2){System.out.print("Десерти: ");}
			
			for (int j = 0; j < (menue[i].length); j++){
				
				if (j != ((menue[i].length) - 1))
				{System.out.printf("%s, ", menue[i][j]);}
				else
				{System.out.print(menue[i][j]);}
				
			}
			
			System.out.println();
		}

		
		
	}

}

package homework_exercises;

/*
 * 	С помощта на функции в JAVA направете програма, която пресмята лицето на триъгълник по зададена страна и
 * 	височина към нея. (S=a.ha/2). На случаен принцип генерирайте 10 различни страни и съответно височини към тях
 * 	и изведете лицето на образувания от тях триъгълник на екрана
 * 	Дефинирайте функция за пресмятането на лицето
 * 	Дефинирайте функция за извеждането на страната, височината и лицето
 */

import java.util.Random;

public class Exec2 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		for (int i = 1; i < 11; i++){
			float side = rand.nextFloat();
			float heigth = rand.nextFloat();
					
			printArea(side, heigth, triangleArea(side, heigth));
		}

	}
	
	public static float triangleArea(float a, float h){
		float area = (a * h) / 2;
		return area;
	}
	
	public static void printArea(float a, float h, float result){
		System.out.printf("a = %-9f, h = %-9f, area = %-9f%n", a, h, result);
	}
	

}

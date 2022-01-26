/**
 * @author maxime_monterin_g4
 * CODE 8.1
 * Calcul l'aire et le périmètre d'un rectangle
 */

public class RectangleComputation {
	public static void main(String[] args){
		double length = 15;
		double weigth = 10;
		
		double perimeter = length + weigth + length + weigth;
		double area = length * weigth;
		
		System.out.println(perimeter + " " + area);
	}
}
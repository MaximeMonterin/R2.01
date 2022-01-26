/**
 * @author maxime_monterin_g4
 * CODE 8.2
 * Calcul le volume, l'aire de surface et l'aire de la base d'un cylindre
 */

public class CylinderComputation{
	public static void main(String[] args){

		double radius = 1.2;
		double heigth = 50;
		final double PI = 3.14159265;
		
		double surfaceArea = 2 * PI * radius * heigth;
		double baseArea = 2 * PI * (radius * radius);
		double volume = baseArea * heigth;
		
		System.out.printf("%.2f", surfaceArea);
		System.out.printf("%.2f", baseArea);
		System.out.printf("%.2f", volume);
	}
}
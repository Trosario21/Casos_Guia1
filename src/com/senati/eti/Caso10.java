package com.senati.eti;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese radio: ");
	    int radio = sc.nextInt();
	    
	    float area = (float) (Math.PI * Math.pow(radio,2));
	    float perimetro = (float) (2 * radio * Math.PI);
	    		
	    System.out.println("\n----------");
	    System.out.println("Resultados");
	    System.out.println("----------");
	    System.out.println("Area del circulo: " + area);
	    System.out.println("Perimetro del circulo: " + perimetro);

	}

}

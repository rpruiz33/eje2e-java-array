package test;

import model.ArregloBidimensional;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double resul[][]= {};
		double resul1[][]= {};
		double matrizB[][] = { { 1, 2, 3 },
							   { 1, 2, 3 } };
		double matrizC[][]= {{1,1},
							 {2,2},
							 {3,3}};
		ArregloBidimensional matriz = new ArregloBidimensional(matrizB);
		resul=matriz.sumar(matrizB);
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print( " [ "+resul[i][j] + " ] ");
			}
			System.out.println();

		}
		resul=matriz.restar(matrizB);
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print( " [ "+resul[i][j] + " ] ");
			}
			System.out.println();

		}
		resul1=matriz.traspuesta();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print( " [ "+resul1[i][j] + " ] ");
			}
			System.out.println();

		}
		resul1=matriz.multiplicar(3);
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print( " [ "+resul1[i][j] + " ] ");
			}
			System.out.println();

		}
		System.out.println("multiplicacion entre matrices");
		resul1=matriz.multiplicar(matrizC);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print( " [ "+resul1[i][j] + " ] ");
			}
			System.out.println();

		}
	}
	
}

package model;

public class ArregloBidimensional {
private double [][]matrizA;

public double[][] getMatrizA() {
	return matrizA;
}

public void setMatrizA(double[][] matrizA) {
	this.matrizA = matrizA;
}

public ArregloBidimensional(double[][] matrizA) {
	super();
	this.matrizA = matrizA;
}

public double[][] sumar(double[][]matrizB){
	int filas=2;
	int columnas=3;
	double [][] resultado= new double[filas][columnas];
	if (matrizA.length!=matrizB.length) {
		System.out.println("paso como parametro diferente longitud de matriz");
	}
	for (int i = 0; i <filas; i++) {
		for (int j = 0; j < columnas; j++) {
			resultado[i][j]=matrizA[i][j]+matrizB[i][j];
		}
		
	}
	
	return resultado;
}
public double[][] restar(double[][]matrizB){
	int filas=2;
	int columnas=3;
	double [][] resultado= new double[filas][columnas];
	if (matrizA.length!=matrizB.length) {
		System.out.println("paso como parametro diferente longitud de matriz");
	}
	for (int i = 0; i <filas; i++) {
		for (int j = 0; j < columnas; j++) {
			resultado[i][j]=matrizA[i][j]-matrizB[i][j];
		}
		
	}
	
	return resultado;
}
public double[][] traspuesta(){
	int filas=3;
	int columnas=2;
	double [][] resultado= new double[filas][columnas];
	
	for (int i = 0; i <filas; i++) {
		for (int j = 0; j <columnas ; j++) {
			resultado[i][j]=matrizA[j][i];
		}
		
	}
	
	return resultado;
}

public double[][] multiplicar(double numero ){
	int filas=2;
	int columnas=3;
	double [][] resultado= new double[filas][columnas];
	
	for (int i = 0; i <filas; i++) {
		for (int j = 0; j <columnas ; j++) {
			resultado[i][j]=matrizA[i][j]*numero;
		}
		
	}
	
	return resultado;
}
public double[][] multiplicar(double [][]matrizB ){
	int filas=2;
	int columnas=3;
	double [][] resultado= new double[filas][columnas];

	for (int i = 0; i <filas; i++) {
		for (int j = 0; j <columnas ; j++) {
			for (int k = 0; k < columnas; k++) {
                resultado[i][j] += matrizA[i][k] * matrizB[k][i];
            }
	}
	
	
}
	return resultado;
}
}
package lambdaEjemplo.ejemplo1;

import java.util.stream.IntStream;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		//Creacion de arreglo para pruebas
		int[] array = {1,3,4,6};
		
		//impresion de longitud de arreglo
		System.out.println(array.length);
		
		//impresion de valores para comparacion en consola
		IntStream.of(array).forEach(valor -> {
			System.out.println("valor: "+valor);
		});
		
		//Stream para calcular el valor minimo de un arreglo de enteros
		System.out.println("minimo: "+IntStream.of(array).min().getAsInt());
		
		//Stream para calcular el valor maximo de un arreglo de enteros
		System.out.println("maximo: "+IntStream.of(array).max().getAsInt());
		
		//Stream para calcular la suma de todos los elementos del arreglo
		System.out.println("suma: "+IntStream.of(array).sum());
		
		//Stream para calcular el promedio de los elementos que se encuentran en el arreglo
		System.out.println("suma: "+IntStream.of(array).average().getAsDouble());
		
		//Stream para imprimir la informacion general en un arreglo
		System.out.println("suma: "+IntStream.of(array).summaryStatistics());	

		//Suma manual de los elementos de un arreglo con la operacion reduce
		System.out.println("suma de otra manera: "+IntStream.of(array).reduce(0, (x,y) -> x+y));	
	}

}

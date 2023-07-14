package Excepciones;

public class Flujo {
	
	public static void main(String[] args) {
		System.out.println("Inicio main");
		metodo1();
		System.out.println("Fin main");
		
		System.out.println("Lanzando exception java");		
		// throw: se utiliza solo para lanzar objetos que sean exceptions "errores"
		// throw new ArithmeticException("lanzando una excepcion");
		
		System.out.println("Lanzando mi exception propia");
		// lanzando la exception creada por mi
		// throw new MiException("Mi exception, propia");
		
	}
	
	public static void metodo1() {
		System.out.println("Inicio metodo1");
		metodo2();
		System.out.println("Fin metodo1");
	}
	
	public static void metodo2() {
		System.out.println("Inicio metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			// resultado va dar error por intentar divir por cero, cuando se tiene idea de que el codigo
			// puede dar un error se debe utilizar "try" & "catch"
			try {
				if (i == 3) {
					int num = 0;			
					double resultado = i/num; // aquí hay un error de "ArithmeticException" division por cero
					System.out.println(resultado);
				}
				String text = null;
				System.out.println(text.toString()); // aquí hay un error de "NullPointerException"  text es nulo
				
			}
			// catch: se ejecuta si try contiene errores de codigo			
			catch(ArithmeticException | NullPointerException exception) { // se debe poner el error o errores a atrapar
				System.out.println(exception.getMessage());	
				exception.printStackTrace();
			}
			// se puede crear varios "catch" o poner en el mismo catch los errores que el codigo pueda tener
		}		
		System.out.println("Fin metodo2");
	}

}

package Excepciones;

public class Text_CuentaExceptionCheck {
	
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta();
		try {
			cuenta.deposita();
		// Exception: al ser el padre de todas las excepciones captura todo los errores que presentes
		// no es necesario poner el nombre especifico de las excepciones que va a atrapar
		} catch (Exception e) {			
			e.printStackTrace();
			System.out.println("ejecuto el catch");
		}
		
	}

}

package Excepciones;

public class Text_Conexion {
	
	public static void main(String[] args) {
		
		Conexion con = new Conexion();
		try {
			con.leerDatos();			
		} catch (IllegalStateException e) {
			System.out.println("Entro en el catch la excepcion");
			e.printStackTrace();
		} finally { // capture o no la excepcion siempre ejecutara "  finally"
			System.out.println("Ejecutando finally");
			con.cerrar();
		}
		
		
	}

}

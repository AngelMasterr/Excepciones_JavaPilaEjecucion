package Excepciones;

public class Text_Conexion2 {
	
	// De esta manera podemos declarar el recurso dentro de "try" y garantizar que cierre todo el recurso
	// sin la necesidad de crear "finally"
	public static void main(String[] args) throws Exception {
		
		try (Conexion con = new Conexion()){
			con.leerDatos();
		} catch (IllegalStateException e) {
			System.out.println("Ejecutando catch");
			e.printStackTrace();
		}
		
	}

}

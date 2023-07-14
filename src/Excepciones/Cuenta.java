package Excepciones;

public class Cuenta {
	
	public void deposita() throws MiException{
		double a = 50/0;
		System.out.println(a);
	}
	
}
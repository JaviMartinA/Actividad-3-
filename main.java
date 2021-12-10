package Actividad_2;

public class main {

	public static void main(String[] args) {
		Subclase1 subclase1 = new Subclase1(20,7.95f,true);
		subclase1.setPrecio(8.95f);
		String mensaje=subclase1.informar();
		System.out.println(mensaje);
		
		

	}

}

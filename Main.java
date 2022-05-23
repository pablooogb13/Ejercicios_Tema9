
public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Pablo",20,645756575,1600);
		Trabajador trabajador = new Trabajador("Juan",20,686343443,1659);
		
		System.out.println("Cliente anadido--> " + " Nombre: " + cliente.getNombre() + 
				" Edad: " + cliente.getEdad() + " Telefono : " + cliente.getTelefono() + 
				" Credito: " + cliente.getCredito());
		
		System.out.println("Trabajador anadido--> " + " Nombre: " + trabajador.getNombre() + 
				" Edad: " + trabajador.getEdad() + " Telefono : " + trabajador.getTelefono() + 
				" Salario: " + trabajador.getSalario());

	}

}

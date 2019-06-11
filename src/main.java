package exercicio2;

public class main {

	public static void main(String[] args) {
		SomadorEsperado somador = new AdapterSomador();
		
		Cliente c = new Cliente(somador);
		c.executar();
		
	}

}

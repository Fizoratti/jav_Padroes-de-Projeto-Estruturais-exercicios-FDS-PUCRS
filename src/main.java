
public class main {

	public static void main(String[] args) {
		ImprimeNumero in = new ImprimeNumero();
		ImprimeSimbolo si = new ImprimeSimbolo();
		
		ListaOrdenada lo = new ListaOrdenada(in);
		lo.adicionar("Pedro");
		lo.adicionar("Robsu");
		lo.adicionar("Michael");
		lo.adicionar("Bruno");
		lo.adicionar("Lu");
		

		ListaDesordenada ld = new ListaDesordenada(si);
		ld.adicionar("Cachorro");
		ld.adicionar("Macaco");
		ld.adicionar("Elefante");
		ld.adicionar("Girafa");
		ld.adicionar("Abelha");
		

		System.out.println("Impressão da lista ordenada por número: ");
		lo.imprimir();
		

		System.out.println("Impressão da lista desordenada por asteriscos: ");
		ld.imprimir();
		
		
		

	}

}

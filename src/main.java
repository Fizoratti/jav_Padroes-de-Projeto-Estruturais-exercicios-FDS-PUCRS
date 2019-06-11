package exercicio1;

public class main {

	public static void main(String[] args) {
		
		CocaCola coca = new CocaCola();
		Guarana guarana = new Guarana();
		
		TamanhoPequeno refri1 = new TamanhoPequeno(coca);
		TamanhoMedio refri2 = new TamanhoMedio(guarana);		
		refri1.beber();
		refri2.beber();

		System.out.println("Adições de Tamanho e Refrigerante:");
		Fanta fanta = new Fanta();
		TamanhoGrande refri3 = new TamanhoGrande(fanta);
		refri3.beber();

	}

}

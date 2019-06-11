import java.util.Collections;

public class ListaDesordenada extends AbstracaoLista {

	public ListaDesordenada(ImplementacaoImpressora imp) {
		super(imp);
	}

	@Override
	public void adicionar(String s) {
		lista.add("* " + s);
		Collections.shuffle(lista);
	}

	@Override
	public void imprimir() {
		for(String s : lista) {
			System.out.println(s);
		}
	}
}

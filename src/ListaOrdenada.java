
public class ListaOrdenada extends AbstracaoLista {
	Integer i = 0;

	public ListaOrdenada(ImplementacaoImpressora imp) {
		super(imp);
	}

	@Override
	public void adicionar(String s) {
		String t = i.toString();
		lista.add(t + " - " + s);
		i++;
	}

	@Override
	public void imprimir() {
		for(String s : lista) {
			System.out.println(s);
		}
	}
}

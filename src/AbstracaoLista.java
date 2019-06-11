import java.util.ArrayList;

public abstract class AbstracaoLista {
	protected ArrayList<String> lista = new ArrayList<String>();
	protected ImplementacaoImpressora impressora;
	
	public AbstracaoLista(ImplementacaoImpressora imp) {
		impressora = imp;
	}
	
	public abstract void adicionar(String s);
	
	public abstract void imprimir();
	
}







import java.util.ArrayList;
import java.util.List;

public class Tabela extends AbstractNode {
    private List<Linha> linhas = new ArrayList<Linha>();

    public void adicionar(Linha linha) {
        this.linhas.add(linha);
    }
    
	@Override
	void imprimir() {
		for (AbstractNode linha : linhas) {
            linha.imprimir();
        }
	}
}
import java.util.ArrayList;
import java.util.List;

public class Tabela extends AbstractNode {
    // private List<Linha> linhas = new ArrayList<Linha>();

    // public void adicionar(Linha linha) {
    //     this.linhas.add(linha);
    // }
    
    @Override
    public void add(AbstractNode node) {
        super.children.add(node);
    }
    
	@Override
	void imprimir() {
		for (AbstractNode linha : super.children) {
            linha.imprimir();
        }
	}
}
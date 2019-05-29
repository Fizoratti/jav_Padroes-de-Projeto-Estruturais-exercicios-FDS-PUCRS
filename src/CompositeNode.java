public class CompositeNode extends AbstractNode {
    
    public void imprimir(){
        // para cada c em children, faça a ls() da children
        for (AbstractNode c : super.children) {
            c.imprimir();
        }
    }
    
}
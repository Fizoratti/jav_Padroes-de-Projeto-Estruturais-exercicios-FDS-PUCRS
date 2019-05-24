public class CompositeNode extends AbstractNode {
    
    public void ls(){
        // para cada c em children, faça a ls() da children
        for (AbstractNode c : super.children) {
            c.ls();
        }
    }
    
}
import java.util.ArrayList;

abstract class AbstractNode {
    public ArrayList<AbstractNode> children = new ArrayList<>();

    abstract void imprimir();

    void add(AbstractNode node) {
        this.children.add(node);
    }

    void remove(AbstractNode node) {
        // Se o node está na lista
        if(searchChild(node)) {
            //remove o node passando por arg sua posição na lista
            children.remove(children.lastIndexOf(node));
        }
    }

    AbstractNode getChild(int index) {
        return this.children.get(index);
    }

    int getChildrenSize() {
        return this.children.size();
    }

    int getChildByIndex(AbstractNode node) {
        int value = 0;
        if(searchChild(node)) {
            // salva a posição do node na lista
            value = children.lastIndexOf(node);
        }
        return value;
    }

    boolean searchChild(AbstractNode node) {
        if(children.contains(node)) {
            return true;
        }else{
            return false;
        }
    }
}
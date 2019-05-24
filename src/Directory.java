import java.util.ArrayList;

class Directory extends AbstractNode {
    private String name;
    private ArrayList<AbstractNode> nodes = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(AbstractNode node) {
        nodes.add(node);
    }
    public void add(ArrayList<AbstractNode> nodes) {
        for (AbstractNode node : nodes) {
            this.nodes.add(node);
        }
    }

    public void ls() {
        for (AbstractNode node : nodes) {
            System.out.print("C:/" + this.name + "/");
            node.ls();
            System.out.print("\n");
        }
    }
}
class File extends AbstractNode {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void ls() {
        System.out.print(name);
    }
}
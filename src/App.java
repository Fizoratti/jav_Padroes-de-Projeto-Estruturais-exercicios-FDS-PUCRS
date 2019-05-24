import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/*
O padrão Composite serve para implementar uma árvore de itens e tratar todos os nós, folhas ou não,
de maneira uniforme. Implemente classes que representem um sistema de arquivos, com pastas e arquivos. 
Pastas possuem nome e diversos arquivos e subpastas. Arquivos possuem nome e tamanho em KB. Seu programa 
deve navegar pela árvore e imprimir seus itens e tamanhos.
*/

public class App {
    public static void main(String args[]) {
        System.out.println("> Started!\n");
        CompositeNode root = new CompositeNode();

        Directory music = new Directory("MUSIC");
        Directory scorpions = new Directory("SCORPIONS");
        Directory dio = new Directory("DIO");
        File track1 = new File("Don't wary, be happy.mp3");
        File track2 = new File("track2.m3u");
        File track3 = new File("Wind of change.mp3");
        File track4 = new File("Big city night.mp3");
        File track5 = new File("Rainbow in the dark.mp3");

        root.add(music);
        root.add(scorpions);
        root.add(dio);

        root.getChild(root.getChildIndex(music)).add(track1);
        root.getChild(root.getChildIndex(music)).add(track2);
        root.getChild(root.getChildIndex(scorpions)).add(track3);
        root.getChild(root.getChildIndex(scorpions)).add(track4);
        root.getChild(root.getChildIndex(dio)).add(track5);

        root.ls();

        System.out.println("\n> Finished!");
        

    }
}
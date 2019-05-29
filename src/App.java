import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class App {
    public static void main(String args[]) {

        System.out.println("> Started!\n");

        // Cria a Tabela
        Tabela tabela = new Tabela();

        // Cria Linhas
        Linha linha1 = new Linha();
        Linha linha2 = new Linha();
        Linha linha3 = new Linha();

        // Cria Celulas
        Celula celula1 = new Celula("(1:1)");
        Celula celula2 = new Celula("(1:2)");
        Celula celula3 = new Celula("(1:3)");

        Celula celula4 = new Celula("(2:1)");
        Celula celula5 = new Celula("(2:2)");
        Celula celula6 = new Celula("(2:3)");

        Celula celula7 = new Celula("(3:1)");
        Celula celula8 = new Celula("(3:2)");
        Celula celula9 = new Celula("(3:3)");

        // Insere as celulas nas linhas
        // linha1.add(celula1);
        // linha1.add(celula2);
        // linha1.add(celula3);
        // linha2.add(celula4);
        // linha2.add(celula5);
        // linha2.add(celula6);
        // linha3.add(celula7);
        // linha3.add(celula8);
        // linha3.add(celula9);

        // Insere as linhas na Tabela
        // tabela.adicionar(linha1);
        // tabela.adicionar(linha2);
        // tabela.adicionar(linha3);

        tabela.getChild(tabela.getChildIndex(linha1)).add(celula1);

        // Imprime
        tabela.imprimir();

        System.out.println("\n> Finished!");        

/* ########################################### */

        // System.out.println("> Started!\n");
        // CompositeNode root = new CompositeNode();

        // Directory music = new Directory("MUSIC");
        // Directory scorpions = new Directory("SCORPIONS");
        // Directory dio = new Directory("DIO");
        // File track1 = new File("Don't wary, be happy.mp3");
        // File track2 = new File("track2.m3u");
        // File track3 = new File("Wind of change.mp3");
        // File track4 = new File("Big city night.mp3");
        // File track5 = new File("Rainbow in the dark.mp3");

        // root.add(music);
        // root.add(scorpions);
        // root.add(dio);

        // root.getChild(root.getChildIndex(music)).add(track1);
        // root.getChild(root.getChildIndex(music)).add(track2);
        // root.getChild(root.getChildIndex(scorpions)).add(track3);
        // root.getChild(root.getChildIndex(scorpions)).add(track4);
        // root.getChild(root.getChildIndex(dio)).add(track5);

        // root.ls();

        // System.out.println("\n> Finished!");
        

    }
}
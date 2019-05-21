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

        Message message = new Message("Hello World!");
        System.out.println(message.getMessage());

        Scanner ler = new Scanner(System.in);

        String texto = ler.next();

        ler.close();

        System.out.println(texto);

    }
}
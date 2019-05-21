# JavaMake

##### To run makefile on linux run
    
    $ make -s run

##### To run makefile on windows run
    
    > .\make.bat

# Exercícios
### 3. Composite
- [ ] exercicio 3.1
- [ ] exercicio 3.2

### 4. Decorator
- [ ] exercicio 4.1
- [ ] exercicio 4.2

# Enunciados

### 3. Composite
#### 3.1.Exercício:
O padrão Composite serve para implementar uma árvore de itens e tratar todos os nós, folhas ou não, de maneira uniforme. Implemente classes que representem um sistema de arquivos, com pastas e arquivos.
Pastas possuem nome e diversos arquivos e subpastas. Arquivos possuem nome e tamanho em KB. Seu
programa deve navegar pela árvore e imprimir seus itens e tamanhos.

#### 3.2.Exercício:
As classes abaixo implementam uma tabela que contém linhas que por sua vez contêm células com
conteúdo texto de até 15 caracteres. Altere-as tal que elas fiquem no padrão Composite para que você possa escrever na classe Main um método imprimir() recursivo que recebe um componente genérico e imprime-o e também seus filhos. O método imprimir() deve, no final, imprimir toda a tabela. Como queremos exercitar o padrão Composite, o método imprimir() não pode conhecer as classes específicas Tabela, Linha e Coluna (o método main() pode).

```java
public class Tabela {
    private List<Linha> linhas = new ArrayList<Linha>();
    public void adicionar(Linha l) {
        linhas.add(l);
    }
}

public class Linha {
    private List<Celula> celulas = new ArrayList<Celula>();
    public void imprimir() {
        // Imprime a borda lateral.
        System.out.println(" |");

        // Imprime a linha.
        int tamanho = (celulas.size() * 17) + 5;
        char[] linha = new char[tamanho];
        for (int i = 0; i < tamanho; i++) linha[i] = '-';
        System.out.println(" " + new String(linha));
    }
    public void adicionar(Celula c) {
        celulas.add(c);
    }
}

public class Celula {
    private String conteudo;
    public Celula(String conteudo) {
        this.conteudo = conteudo;
    }
    public void imprimir() {
        // Limita o conteúdo a exatamente 15 caracteres.
        conteudo = conteudo + " ";
        conteudo = conteudo.substring(0, 15);
        // Imprime na mesma linha e com borda lateral.
        System.out.print(" | " + conteudo);
    }
}
```


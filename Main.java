package Trabalho;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
//        Instancias
        Node n1 = new Node(30);
        Node n2 = new Node(10);
        Node n3 = new Node(1234);
        Node n4 = new Node(588);
        Node n5 = new Node(210000000);

        lista.inserirInicio(n1);
        lista.inserirInicio(n2);
        lista.inserirFim(n3);
        lista.inserirInicio(n4);
        lista.inserirInicio(n5);
        lista.percorrerLista();

        lista.removerFinal();
        lista.percorrerLista();

        lista.qntdElemetnos();
        lista.removerEspecifico(-2);

        lista.percorrerLista();



    }
}

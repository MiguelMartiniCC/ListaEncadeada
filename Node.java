package Trabalho;

public class Node {
    private int valor;
    private Node prox;

    public Node(){
        this.valor = 0;
        this.prox = null;
    }
    public Node(int valor){
        this.valor = valor;
        this.prox = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Node getProx() {
        return prox;
    }

    public void setProx(Node prox) {
        this.prox = prox;
    }
}

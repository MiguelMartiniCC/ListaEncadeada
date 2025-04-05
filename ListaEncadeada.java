package Trabalho;

public class ListaEncadeada {
    private Node lista;
    private int nElementos;

    public ListaEncadeada(){
        this.lista = null;
        this.nElementos = 0;
    }

//  Formas de Percorrer a lista


    public void percorrerLista(){
        if(estaVazia()){
            System.out.println("Lista vazia!");
        }else{
            Node aux = this.lista;
            int vl = 0;
            System.out.println("======================");
            System.out.println("Seus dados são: ");
            while(aux != null){
                vl++;
                System.out.println(vl+ ": "+aux.getValor());
                aux = aux.getProx();
            }
        }
        System.out.println("======================");
    }

    public Node acesso(int posicao){
        if(estaVazia()){
            System.out.println("Lista vazia!");
            return null;
        }
        if(posicao < 0){
            System.out.println("Posição não encontrada");
            return null;
        }

        Node aux = this.lista;
        int i = 0;

        while(i < posicao && aux != null){
            i++;
            aux = aux.getProx();
        }
        if(aux == null){
            System.out.println("Posição fora do limite da lista");
            return null;
        }
        System.out.println("Valor do dado: " + aux.getValor());
        return aux;
    }

    public void qntdElemetnos(){
        if(estaVazia()){
            System.out.println("Lista vazia!");
        }else{
            Node aux = new Node();
            aux = lista;
            int qntd = 0;
            while (aux != null){
                aux = aux.getProx();
                qntd++;
            }
            System.out.println("Você tem " + qntd+ " de elementos na lista");
        }
    }

    private boolean estaVazia(){
        return this.lista == null;
    }

//    operacoes de modificação da lista
    public void inserirInicio(Node novoElemento){
        if (estaVazia()){
            this.lista =  novoElemento;
        }else{
            novoElemento.setProx(lista);
            this.lista = novoElemento;
        }
        this.nElementos++;
    }
    public void removerIncio(){
        if(estaVazia()){
            System.out.println("Lista esta vazia!");
        }else{
            System.out.println("Voce esta removendo o elemento: " + lista.getValor());
            lista = lista.getProx();
        }
    }

    public void inserirFim(Node novoElemento){
        if(estaVazia()){
            this.lista = novoElemento;
        }else{
            Node aux = this.lista;
            while(aux.getProx() != null){
                aux = aux.getProx();
            }
            aux.setProx(novoElemento);
        }
        this.nElementos++;
    }
    public void removerFinal(){
        if(estaVazia()){
            System.out.println("Lista vazia!");
        }else{
            if(this.nElementos == 1){
                this.lista = null;
                this.nElementos = 0;
            }else {
                Node aux = this.lista;
                Node ant = this.lista;
                while (aux.getProx() != null){
                    ant = aux;
                    aux = aux.getProx();
                }
                System.out.println("Você removeu um dado do final da lista: " + aux.getValor());
                ant.setProx(null);
                nElementos--;
            }
        }
    }

    public void inserirEspecifico(Node novoElemento,int posicao){
        Node anterior = this.lista;
        int i = 1;

        while(i < posicao && anterior != null){
            anterior = anterior.getProx();
            i++;
        }
//        Caso a posição seja 0 adicionará no final
        if(posicao == 0){
            novoElemento.setProx(this.lista);
            this.lista = novoElemento;
            this.nElementos++;

        }
//        Caso a posição seja menor ou igual a qntd de elementos e for maior que 0, irá inserir no local correto
//        Caso seja maior que a qntd de elementos ou menor que 0, irá rodar o else
        if(posicao <= nElementos && posicao > 0){
            novoElemento.setProx(anterior.getProx());
            anterior.setProx(novoElemento);
            this.nElementos++;
        }else{
            System.out.println("Posição inválida!");
        }
    }

    public void removerEspecifico(int posicao){

        if(posicao < 0 || posicao >= this.nElementos){
            System.out.println("Posição inválida!");
            return;
        }
        if(posicao == 0){
            System.out.println("Você esta removendo o dado: " + lista.getValor());
            lista = lista.getProx();
        }else{
            Node atual = this.lista;
            int i = 1;

            while (i < posicao){
                atual = atual.getProx();
                i++;
            }
            Node removendo = atual.getProx();
            if(removendo != null){
                System.out.println("Removendo o dado: " + removendo.getValor());
                atual.setProx(removendo.getProx());
            }
        }
        this.nElementos--;

    }
}

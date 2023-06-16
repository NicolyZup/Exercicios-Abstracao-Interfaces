package Exercicio1;

//classe abstrata modelo para outra classes
abstract class Produto {
    //atributos
    private String nome;
    private double preco;
    private String codigoBarras;

    //construtor
    public Produto(String nome, double preco, String codigoBarras){
        this.nome=nome;
        this.preco=preco;
        this.codigoBarras=codigoBarras;
    }

    //métodos para retornar os atributos
    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return  preco;
    }

    public String getCodigoBarras(){
        return codigoBarras;
    }

    //método abstrato que as outras classes irão implementar
    public abstract void mostrarDetalhesDoItem();

    //método concreto que faz a lógica de comparar o código de barras informado com os já existente na lista de produtos
    public boolean equals(Object item){
        if(this == item){
            return true;
        }
        if (item == null || getClass() != item.getClass()) {
            return false;
        }
        Produto produto = (Produto) item;
        return codigoBarras.equals(produto.codigoBarras);
    }

}

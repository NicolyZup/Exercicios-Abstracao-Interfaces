package Exercicio1;

//classe extensão da classe abstrata Produto
class DVD extends Produto{
    //atributo característico desta classe
    private int duracao;

    //construtor
    public DVD(String nome, double preco, String codigoBarras, int duracao){
        super(nome, preco, codigoBarras);//informações que a classe pai (Produto) pede
        this.duracao=duracao;
    }

    //método para retornar a duração
    public int getDuracao(){return duracao;}

    //método abstrato da classe pai, ele é obrigatório nesta classe, ela é extensão da classe Pai(Produto)
    public void mostrarDetalhesDoItem(){
        System.out.println("Nome: "+getNome());
        System.out.println("Preço: "+getPreco());
        System.out.println("Duração: "+getDuracao());
    }
}

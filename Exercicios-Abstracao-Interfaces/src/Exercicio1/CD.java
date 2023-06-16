package Exercicio1;

//classe extensão da classe abstrata Produto
class CD extends Produto{
    //atributo característico desta classe
    private int numeroFaixas;

    //construtor
    public CD(String nome, double preco, String codigoBarras, int numeroFaixas){
        super(nome, preco, codigoBarras);//informações que a classe pai (Produto) pede
        this.numeroFaixas=numeroFaixas;
    }

    //método para retornar o número de faixas
    public int getNumeroFaixas(){
        return numeroFaixas;
    }

    //método abstrato da classe pai, ele é obrigatório nesta classe, ela é extensão da classe Pai(Produto)
    public void mostrarDetalhesDoItem(){
        System.out.println("Nome: "+getNome());
        System.out.println("Preço: "+getPreco());
        System.out.println("Número de faixas: "+numeroFaixas);
    }
}

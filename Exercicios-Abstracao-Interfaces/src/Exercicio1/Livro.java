package Exercicio1;

//classe extensão da classe abstrata Produto
class Livro extends Produto{
    //atributo característico desta classe
    private String autor;

    //construtor
    public Livro(String nome, double preco, String codigoBarras, String autor){
        super(nome, preco, codigoBarras); //informações que a classe pai (Produto) pede
        this.autor=autor;
    }

    //método para retornar o autor
    public String getAutor(){return autor;}

    //método abstrato da classe pai, ele é obrigatório nesta classe, ela é extensão da classe Pai(Produto)
    @Override
    public void mostrarDetalhesDoItem(){
        System.out.println("Nome: "+getNome());
        System.out.println("Preço: "+getPreco());
        System.out.println("Autor: "+getAutor());
    }
}

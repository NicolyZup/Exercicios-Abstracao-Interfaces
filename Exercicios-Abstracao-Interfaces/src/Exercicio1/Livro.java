package Exercicio1;

class Livro extends Produto{
    private String autor;

    public Livro(String nome, double preco, String codigoBarras, String autor){
        super(nome, preco, codigoBarras);
        this.autor=autor;
    }

    public String getAutor(){
        return autor;
    }

    @Override
    public void mostrarDetalhesDoItem(){
        System.out.println("Nome: "+getNome());
        System.out.println("Preço: "+getPreco());
        System.out.println("Autor: "+autor);
    }
}

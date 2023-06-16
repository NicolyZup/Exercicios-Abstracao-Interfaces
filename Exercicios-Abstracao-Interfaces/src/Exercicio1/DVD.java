package Exercicio1;

class DVD extends Produto{
    private int duracao;

    public DVD(String nome, double preco, String codigoBarras, int duracao){
        super(nome, preco, codigoBarras);
        this.duracao=duracao;
    }

    public int getNumeroFaixas(){
        return duracao;
    }
    public void mostrarDetalhesDoItem(){
        System.out.println("Nome: "+getNome());
        System.out.println("Preço: "+getPreco());
        System.out.println("Duração: "+duracao);
    }
}

package Exercicio1;

class CD extends Produto{
    private int numeroFaixas;

    public CD(String nome, double preco, String codigoBarras, int numeroFaixas){
        super(nome, preco, codigoBarras);
        this.numeroFaixas=numeroFaixas;
    }

    public int getNumeroFaixas(){
        return numeroFaixas;
    }

    public void mostrarDetalhesDoItem(){
        System.out.println("Nome: "+getNome());
        System.out.println("Preço: "+getPreco());
        System.out.println("Número de faixas: "+numeroFaixas);
    }
}

package Exercicio4;

//classe que implementa interface Tributos
public class ContaCorrente implements Tributos{
    //atributo saldo para pegar o 1%
    private double conta;

    //construtor da classe ContaCorrente
    public ContaCorrente(double conta){
        this.conta=conta;
    }

    //subscreve o método abstrato da interface Tributos, calcular o 1% de tributos
    //regra de negócio: precisa pagar 1% da conta;
    @Override
    public double calcularTributos() {
        return 1/100 * conta;
    }
}

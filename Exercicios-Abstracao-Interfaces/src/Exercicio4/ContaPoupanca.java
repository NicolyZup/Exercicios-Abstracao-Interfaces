package Exercicio4;

//classe que implementa interface Tributos
public class ContaPoupanca implements Tributos{

    //subscreve o método da interface
    //regra de negócio: não é tributável, logo não retorna nada
    @Override
    public double calcularTributos() {
        return 0;
    }
}

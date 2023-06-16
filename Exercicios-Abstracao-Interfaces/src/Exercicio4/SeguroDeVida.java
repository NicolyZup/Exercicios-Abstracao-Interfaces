package Exercicio4;

//classe que implementa a interface Tributos
public class SeguroDeVida implements Tributos{
    //subscreve o método abstrato da interface Tributos
    //regra de negócio: taxa fixa de 42 reais
    @Override
    public double calcularTributos() {
        return 42;
    }
}

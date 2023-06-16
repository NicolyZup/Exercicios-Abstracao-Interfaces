package Exercicio2;

//subclasse da classe retângulo
class Quadrado extends Retangulo{

    //construtor do quadrado, chama a classe pai (super) retângulo, como quadrado tem todos os lados iguais, passamos
    //apenas um parâmetro em seu construtor, e como a classe retângulo espera receber 2 parâmetros em seu construtor
    //mandamos 2 vezes o mesmo parâmetro
    public Quadrado(double lado){
        super(lado,lado);
    }
}

package Exercicio2;

//classe abstrata, não pode ser instanciada diretamente
abstract class Forma {

    //métodos abstratos, as classes que forem extensões desta classe devem conter ambos métodos obrigatoriamente
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

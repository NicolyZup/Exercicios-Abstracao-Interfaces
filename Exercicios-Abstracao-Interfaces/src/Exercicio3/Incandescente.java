package Exercicio3;

//classe que implementa a interface
public class Incandescente implements Lampada {

    //métodos da interface Lampada
    @Override
    public void ligar(){
        System.out.println("Lâmpada Incandescente: ligada");
    }

    @Override
    public  void desligar(){
        System.out.println("Lâmpada Incandescente: desligada");
    }
}

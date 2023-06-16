package Exercicio3;

//classe que implementa a interface
public class Fluorescente implements Lampada {

    //métodos da interface Lampada
    @Override
    public void ligar(){
        System.out.println("Lâmpada Fluorescente: ligada");
    }

    @Override
    public  void desligar(){
        System.out.println("Lâmpada Fluorescente: desligada");
    }
}

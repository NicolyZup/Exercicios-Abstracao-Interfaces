package Exercicio3;

//classe para lógica da construção da lâmpada
public class FabricaLampada {

    //método do tipo interface Lampada, dessa forma conseguirmos usar as classes que estão implementando "Lâmpada"
    public Lampada construir(String lampada){
        if(lampada.equals("Incandescente") || lampada.equals("incandescente")){
            return new Incandescente();
        } else if (lampada.equals("Fluorescente") || lampada.equals("fluorescente")) {
            return new Fluorescente();
        } else {
           System.out.println("Houve um problema, tente novamente mais tarde.");
           return null;
        }
    }
}

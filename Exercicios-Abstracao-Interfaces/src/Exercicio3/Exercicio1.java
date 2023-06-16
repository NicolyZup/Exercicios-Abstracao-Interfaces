package Exercicio3;

import java.util.Scanner;

//classe que interage com o usuário
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        FabricaLampada fabricar = new FabricaLampada(); //instanciar classe para uso do método

        //pegar informação com usuário
        System.out.println("Qual lâmpada deseja construir: Fluorescente ou Incandescente?");
        String tipoInformado = entrada.next();

        //polimorfismo, conseguimos usar as classes que implementam a interface "Lampada"
        Lampada lampadaConstruir = fabricar.construir(tipoInformado);

        //lógica que constrói lampada conforme o que foi informado pelo usuário
        if(lampadaConstruir != null){
            System.out.println("Lâmpada criada oom sucesso!");
            lampadaConstruir.ligar();
            lampadaConstruir.desligar();
        }
    }
}

package Exercicio2;

import java.util.ArrayList;
import java.util.List;

//classe executável para fazer os testes
public class MainTeste {
    public static void main(String[] args) {
        //Array para guardar os objetos instanciados abaixo
        List<Forma> formasGeometricas = new ArrayList<>();

        //criação das formas
        formasGeometricas.add(new Circulo(3.0));
        formasGeometricas.add(new Quadrado(8.0));
        formasGeometricas.add(new Retangulo(3.0, 5.2));
        formasGeometricas.add(new Retangulo(1.5, 4.0));
        formasGeometricas.add(new Circulo(8.9));

        //laço que percorre o array e trás as informações dos objetos
        for (Forma item : formasGeometricas){
            System.out.println("=======================================");
            System.out.println("Forma: "+item.getClass().getSimpleName());
            System.out.printf("Área: %.2f \r\n",item.calcularArea());
            System.out.printf("Perímetro: %.2f \r\n",item.calcularPerimetro());
            System.out.println("=======================================");
        }
    }
}

package Exercicio2;

//classe Circulo é extensão da classe abstrata Forma
class Circulo extends Forma {
    //atributos
    private double raio;
    private double PI;

    //construtor
    public Circulo(double raio){
        this.raio=raio;
        this.PI = 3.14;
    }

    //Abaixo vem os 2 métodos abstratos (são obrigatórios, pois a classe Circulo é extensão da classe Forma)

    //@Override que sobrescreve o método da classe abstrata
    @Override
    public double calcularArea(){
        return PI*(raio*raio);
    }

    @Override
    public double calcularPerimetro(){
        return 2 * (PI*raio);
    }
}

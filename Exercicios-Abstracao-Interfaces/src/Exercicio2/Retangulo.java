package Exercicio2;

//classe Retângulo que é extensão da classe abstrata Forma
class Retangulo extends Forma{
    //atributos
    private double lado;
    private double altura;

    //construtor
    public Retangulo(double lado, double altura){
        this.lado=lado;
        this.altura=altura;
    }

    //método que retorna lado, pega informação contida no atributo "lado"
    public double getLado(){
        return lado;
    }

    //método que retorna altura, pega informação contida no atributo "altura"
    public double getAltura(){
        return altura;
    }

    //Abaixo vem os 2 métodos abstratos (são obrigatórios, pois a classe Retangulo é extensão da classe Forma)

    //@Override que sobrescreve o método da classe abstrata
    @Override
    public double calcularArea(){
        return  lado * altura;
    }

    @Override
    public  double calcularPerimetro(){
        return (altura*2)+(lado*2);
    }
}

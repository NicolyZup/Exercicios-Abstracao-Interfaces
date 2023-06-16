package Exercicio1;

//classe executável
public class Loja {
    public static void main(String[] args) {
        //lista de produtos conforme sua instancia
        Produto[] itens = new Produto[5];

        //criação de produtos
        itens[0]= new Livro("Harry Potter 1", 18.65, "009jhg890", "J.K");
        itens[1]= new CD("Luan santana", 09.99, "432ggedt6", 10);
        itens[2]= new DVD("Barbie", 53.90, "klki0980", 2);
        itens[3]= new Livro("Harry Potter 2", 18.65, "jtgjuet76598", "J.K");
        itens[4]= new Livro("Harry Potter 3", 18.65, "bsehfey73", "J.K");

        //laço que mostra detalhes de cada produto / o método mostrarDetalhesDoItem é da classe abstrata Produto
        for (Produto item : itens){
            item.mostrarDetalhesDoItem();
            System.out.println("=======================================");
        }

        //informando qual produto quero buscar
        Produto produtoBuscar = itens[1];
        //método com lógica de procurar produto (informo o item e a lista para procurar o item)
        buscarProduto(produtoBuscar, itens);

        //Variáveis com os objetos igual e diferente para usar o método comparar da superclasse abstrata (Produto)
        Produto itemIgual = new CD("Luan santana", 09.99, "432ggedt6", 10);
        Produto itemDiferente = new CD("Luan santana", 09.99, "09vd09gsghnk", 10);

        //informando se é true ou false para produto igual e produto diferente
        System.out.println("Produto igual: "+ produtoBuscar.equals(itemIgual));
        System.out.println("Produto diferente: "+produtoBuscar.equals(itemDiferente));
    }

    //método com lógica de busca de produto
    private static void buscarProduto(Produto produtoBuscar, Produto[] itens) {
        for(int i=0;i < itens.length;i++){
            if(produtoBuscar.equals(itens[i])){
                System.out.println("Produto informado esta na posição "+i+"° da lista.");
                return; // return para sair do laço e retornar o método
            }
        }
        System.out.println("Produto não encontrado.");
    }

}

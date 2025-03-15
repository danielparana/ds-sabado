import java.util.Scanner;

public class atividade1{
public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    System.out.println("CALCULADORA DE PRESTAÇÕES");

    float quantidadePrestacoes = 5;
-
    System.out.println("Insira o preço do produto: ");
    float precoProduto = leia.nextFloat();

    float precoPrestacoes = precoProduto/quantidadePrestacoes;

    System.out.println("MERCADO MAMÃO COM AÇUCAR");
    System.out.println("O valor das parcelas é de R$ " + precoPrestacoes);
    
}
}
import java.util.Scanner;

public class atividade2{
public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    System.out.println("SISTEMA GERENCIADOR ACADÊMICO");

    System.out.println("Digite seu nome completo: ");
    String nomeCompleto = leia.nextLine();

    System.out.println("Insira a nota da 1ª prova: ");
    float notaPrimeiraProva = leia.nextFloat();
    System.out.println("Insira a nota da 2ª prova: ");
    float notaSegundaProva = leia.nextFloat();

    float notaFinal = (notaPrimeiraProva+notaSegundaProva)/2;


    System.out.println("Nome completo: " + nomeCompleto);
    System.out.println("Nota final: " + notaFinal);
    if (notaFinal >= 7) {

        System.out.println("Resultado final: Aprovado ");
        
    } else {
        System.out.println("Resultado final: Reprovado ");

    }




 }
}
package Desafio2;
import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] nomes = new String[5];
        int quantidade = 0;
        int opcao = 0;

        while(opcao != 3) {
            System.out.println("===== MENU =====");
            System.out.println("1 - Cadastrar nome");
            System.out.println("2 - Listar nomes");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            opcao = teclado.nextInt();
            teclado.nextLine();

            if(opcao == 1) {
                if(quantidade < nomes.length) {
                    System.out.print("Digite um nome: ");
                    String nome = teclado.nextLine();
                    nomes[quantidade] = nome;
                    quantidade = quantidade + 1;
                    System.out.println("Nome cadastrado!");
                } else {
                    System.out.println("Limite de nomes atingido!");
                }
            }

            if(opcao == 2) {
                System.out.println("Nomes cadastrados:");
                for(int contador = 0; contador < quantidade; contador++) {
                    System.out.println((contador + 1) + " - " + nomes[contador]);
                }
            }

            if(opcao == 3) {
                System.out.println("Saindo do sistema...");
            }

            if(opcao < 1 || opcao > 3) {
                System.out.println("Opção inválida!");
            }
        }
    }
}

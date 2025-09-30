package Desafios;

import javax.swing.*;
import java.sql.SQLOutput;

public class Desafio1 {
    public static void main(String[] args) {

        // Ninja 1
        String nome1 = "Guilherme";
        int idade = 17;
        char nivel_missao = 'S';
        String nome_missao = "Amar alguem de novo";
        String Status_conclusao = "Em andamento";

        if (idade <= 15 ){
            if (nivel_missao == 'C' || nivel_missao == 'D') {
               Status_conclusao = "Concluida";
            } else {
                Status_conclusao = "Não concluida";
            }
        } else {
            Status_conclusao = "Concluida";
        }

        //Ninja 2
        String nome2 = "joaquim";
        char nivel_missao2 = 'C';
        int idade2 = 3;
        String nome_missao2 = "Guardar os brinquedos";
        String status_conclusao2 = "Em andamento";

        if (idade2 <= 15 ){
            if (nivel_missao2 == 'C' || nivel_missao2 == 'D') {
                status_conclusao2 = "Concluida";
            } else {
                status_conclusao2 = "Não Concluida";
            }
        } else {
            status_conclusao2 = "Concluida";
        }
        String nome3 = "Tetéia";
        char nivel_missao3 = 'S';
        int idade3 = 15;
        String nome_missao3 = "Roer um osso";
        String status_conclusao3 = "Em andamento";

        if (idade3 <= 15 ){
            if (nivel_missao3 == 'C' || nivel_missao3 == 'D') {
                status_conclusao3 = "Concluida";
            } else {
                status_conclusao3 = "Não Concluida";
            }
        } else {
            status_conclusao3 = "Concluida";
        }
        System.out.println("Carregando...");
        System.out.println("======================================#100%");
        System.out.println("----------------Ninja 1:---------------------");
        System.out.println("Nome do ninja 1: " + nome1);
        System.out.println("Idade do Primeiro Ninja: " + idade);
        System.out.println("Nivel da missão: " + nivel_missao);
        System.out.println("Nome da Missão: " + nome_missao);
        System.out.println("Status da missão: " + Status_conclusao);

        System.out.println("----------------Ninja 2:---------------------");
        System.out.println("Nome do ninja : " + nome2);
        System.out.println("Idade do Ninja: " + idade2);
        System.out.println("Nivel da missão: " + nivel_missao2);
        System.out.println("Nome da Missão: " + nome_missao2);
        System.out.println("Status da missão: " + status_conclusao2);

        System.out.println("----------------Ninja 3:---------------------");
        System.out.println("Nome do ninja : " + nome3);
        System.out.println("Idade do Ninja: " + idade3);
        System.out.println("Nivel da missão: " + nivel_missao3);
        System.out.println("Nome da Missão: " + nome_missao3);
        System.out.println("Status da missão: " + status_conclusao3);


    }
}

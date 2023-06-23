package estruturaDeDecisao;
/*

Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:

"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?"

O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
Caso contrário, ele será classificado como "Inocente".

 */

import java.util.Locale;
import java.util.Scanner;

public class questao25 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String resposta;
        int aux = 0;

        System.out.printf("Telefonou para a vítima?(S/N) ");
        resposta = sc.nextLine().toUpperCase();
        if(resposta .equals("S")) {
            aux++;
        } 
        System.out.printf("Esteve no local do crime?(S/N) ");
        resposta = sc.nextLine().toUpperCase();
        if(resposta .equals("S")) aux++;

        
        System.out.printf("Mora perto da vítima?(S/N) ");
        resposta = sc.nextLine().toUpperCase();
        if(resposta.equals("S")) aux++;

        
        System.out.printf("Devia para a vítima?(S/N) ");
        resposta = sc.nextLine().toUpperCase();
        if(resposta .equals("S")) aux++;

        
        System.out.printf("Já trabalhou com a vítima?(S/N) ");
        resposta = sc.nextLine().toUpperCase();
        if(resposta .equals("S")) aux++;

        if(aux <= 1) System.out.printf("Você é inocente.");
        if(aux == 2) System.out.printf("Você é suspeito.");
        if(aux == 3 || aux == 4) System.out.printf("Você é Cúmplice.");
        if(aux == 5) System.out.printf("Você é o assassino.");

        sc.close();
    }
}

/*
 * 
 * O programa deve no final emitir uma classificação sobre a participação da
 * pessoa no crime.
 * Se a pessoa responder positivamente a 2 questões ela deve ser classificada
 * como "Suspeita",
 * entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
 * Caso contrário, ele será classificado como "Inocente".
 * 
 */
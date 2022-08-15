/*
    Nome: Gabriel Sotero Mendonça
    Objetivo: Faça um programa que leia três valores distintos a serem digitados pelo usuário, determine e exiba o
    menor deles.
 */

import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num[] = {0,0,0};
        int i;
        for (i = 0; i < 3; i++) {
            System.out.println("Digite o " + (i+1) + " numero");
            num[i] = scanner.nextInt();
        }
        int menor = num[0];
        for (i = 1; i < 3; i++) {
            if (num[i] < menor){
                menor = num[i];
            }
        }
        System.out.println("O menor numero digitado: " + menor);
    }
}

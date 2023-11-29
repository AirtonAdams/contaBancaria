package br.com.alura.contaBancaria;

import br.com.alura.contaBancaria.models.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.println("Bem vindo!");
        System.out.print("Para iniciar digite seu nome: ");
        user.setName(sc.nextLine());
        System.out.print("Digite o tipo da conta: ");
        user.setTypeOfAccount(sc.nextLine());
        System.out.print("Digite o saldo inicial: ");
        user.setOpeningBalance(sc.nextDouble());
        System.out.printf("""
                *****************
                Dados do cliente:
                
                Nome: %s
                Tipo de conta: %s
                Saldo inicial: %.2f
                *****************
                """, user.getName(), user.getTypeOfAccount(), user.getBalance());
        int option = 0;
        while (option != 4) {
            System.out.println();
            System.out.println("Operações");
            System.out.println("""
                    1- Consultar Saldos
                    2- Receber Valores
                    3- Tranferir valores
                    4- Sair
                    """);
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println(user.balanceInquiry());
                    break;
                case 2:
                    System.out.print("Digite o valor a ser recebido: R$");
                    System.out.println(user.receivesValue(sc.nextDouble()));
                    break;
                case 3:
                    System.out.print("Digite o valor a ser transferido: R$");
                    System.out.println(user.sendValue(sc.nextDouble()));
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Não existe esta opção!");
            }
        }


        sc.close();
    }
}
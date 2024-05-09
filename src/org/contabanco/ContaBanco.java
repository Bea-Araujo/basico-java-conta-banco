package org.contabanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da sua conta: \t");
        int accountNumber = scanner.nextInt();
        System.out.print("Por favor, digite o número da sua agência: \t");
        String agencyNumber = scanner.next();
        System.out.print("Por favor, digite o seu nome: \t");
        String name = scanner.next();
        System.out.print("Por favor, digite o saldo: \t");
        double amount = scanner.nextDouble();

        System.out.println("\nProcessando suas informações \n");

        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencyNumber + ", conta nº" + accountNumber + " e seu saldo R$" + amount + " já está disponível para saque.");
        scanner.close();
    }
}

package org.contabanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    int accountNumber;
    String agencyNumber;
    String name;
    double amount;

    public void createAccount(){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da sua conta: \t");
        accountNumber = scanner.nextInt();
        
        System.out.print("Por favor, digite o número da sua agência: \t");
        agencyNumber = scanner.next();
        
        System.out.print("Por favor, digite o seu nome: \t");
        name = scanner.next();
        
        System.out.print("Por favor, digite o saldo: \t");
        amount = scanner.nextDouble();

        System.out.println("\nProcessando suas informações \n");

        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencyNumber + ", conta nº" + accountNumber + " e seu saldo R$" + amount + " já está disponível para saque.");
        scanner.close();
    }
}

package sistemaBancario.ui;

import sistemaBancario.domain.util.CurrentTime;
import sistemaBancario.domain.model.AccountPersonalData;
import sistemaBancario.domain.service.AccountManager;

import java.util.Scanner;

public class AccountDataInput {
    Scanner sc = new Scanner(System.in);
    public static void inputPersonalData() {
        AccountPersonalData registerNewAccount = new AccountPersonalData();
        Scanner sc = new Scanner(System.in);

        System.out.println(" INSIRA OS DADOS ABAIXO: ");
        System.out.print(" Nome Completo: ");
        registerNewAccount.setFullName(sc.nextLine());

        System.out.print(" CPF (apenas números): ");
        registerNewAccount.setCpfNumber(sc.nextLine());

        System.out.println("    Data de nascimento. ");
        System.out.print(" Ano: ");
        registerNewAccount.setBirthYear(sc.nextInt());

        System.out.print(" Mês: ");
        registerNewAccount.setBirthMonth(sc.nextInt());

        System.out.print(" Dia: ");
        registerNewAccount.setBirthDay(sc.nextInt());
        sc.nextLine();

        System.out.print(" Pais: ");
        registerNewAccount.setCountryAddress(sc.nextLine());

        System.out.print(" Estado - xx: ");
        registerNewAccount.setStateAddress(sc.nextLine());

        System.out.print(" Cidade: ");
        registerNewAccount.setCityAddress(sc.nextLine());

        System.out.print(" Endereço (Rua, Av., etc): ");
        registerNewAccount.setStreetAddress(sc.nextLine());

        System.out.print(" Número do Endereço (digite 0 se não houver: ");
        registerNewAccount.setHouseNumberAddress(sc.nextInt());
        sc.nextLine();

        System.out.print(" Bairro: ");
        registerNewAccount.setNeighborhoodAddress(sc.nextLine());

        registerNewAccount.setCreationDate(CurrentTime.currentTimeAndDate());

        AccountManager.createAndStoreCompleteAccount(registerNewAccount);
    }
        }
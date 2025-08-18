package sistemaBancario.domain.service;

import sistemaBancario.domain.model.AccountBankData;
import sistemaBancario.domain.model.AccountPersonalData;

// Classe não instanciável.
public class AccountManager {
    private final static int ACCOUNTS_NUMBER = 100;
    private final static AccountPersonalData[] ACCOUNT_PERSONAL_DATA = new AccountPersonalData[ACCOUNTS_NUMBER];
    private final static AccountBankData[] ACCOUNT_BANK_DATA = new AccountBankData[ACCOUNTS_NUMBER];
    private static int accountIndex = 0;

    private static void storeNewAccount(AccountPersonalData accountData){
        ACCOUNT_PERSONAL_DATA[accountIndex] = accountData;
    }

    private static void storeAccountBankData(AccountBankData accountBankData){
        ACCOUNT_BANK_DATA[accountIndex] = accountBankData;
    }
    
    public static void createAndStoreCompleteAccount(AccountPersonalData accountPersonalData){
        storeNewAccount(accountPersonalData);
        AccountBankData accountBankData = BankDataFactory.bankDataCreation(accountPersonalData.getStateAddress());
        storeAccountBankData(accountBankData);
        accountIndex++;
    }

    public static void createNewAccount(){
        
    }

    public static void printData(int user){
        System.out.println("Nome: " + ACCOUNT_PERSONAL_DATA[user].getFullName());
        System.out.println("CPF: " + ACCOUNT_PERSONAL_DATA[user].getCpfNumber());
        System.out.println("Data/Hora de Criação: " + ACCOUNT_PERSONAL_DATA[user].getCreationDate());
        System.out.println("Pais: " + ACCOUNT_PERSONAL_DATA[user].getCountryAddress());
        System.out.println(" --- Account Bank Data ---");
        System.out.println("Banco: " + ACCOUNT_BANK_DATA[user].getBankNumber());
        System.out.println("Agência: " + ACCOUNT_BANK_DATA[user].getAgencyNumber());
        System.out.println("Número da conta: " + ACCOUNT_BANK_DATA[user].getAccountNumber());
    }

    public int getMaxAccountsAllowed(){
        return ACCOUNTS_NUMBER;
    }

    public static int getAccountIndex(){
        return accountIndex;
    }

    public static AccountBankData[] getAccountBankData(){
        return ACCOUNT_BANK_DATA;
    }
}

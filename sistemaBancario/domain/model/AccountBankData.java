package sistemaBancario.domain.model;

public class AccountBankData {

    private final static int BANK_NUMBER = 171;
    private final String agencyNumber;
    private final String accountNumber;

    public AccountBankData(String agencyNumber, String accountNumber) {
        this.agencyNumber = agencyNumber;
        this.accountNumber = accountNumber;
    }

    public String getAgencyNumber() {
        return agencyNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBankNumber(){
        return BANK_NUMBER;
    }
}



//    Banco: 001 (Banco do Brasil)
//    Agência: 1234-5 (número + dígito)
//    Conta: 12345-6 (número + dígito)
//    Titular: João da Silva
//    CPF: 123.456.789-00
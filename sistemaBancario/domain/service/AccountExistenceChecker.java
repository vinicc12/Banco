package sistemaBancario.domain.service;

import sistemaBancario.domain.model.AccountBankData;

public class AccountExistenceChecker {
    public static boolean accountExistis(String accountNumber, String agencyNumber) {
        for (int i = 0; i < AccountManager.getAccountIndex(); i++) {
            AccountBankData accountBankData = AccountManager.getAccountBankData()[i];
            if (accountBankData.getAccountNumber().equals(accountNumber) && accountBankData.getAgencyNumber().equals(agencyNumber)) {
                return true;
            }
        }
        return false;
    }
}

package sistemaBancario.domain.service;

import sistemaBancario.ZDatabase.Database;
import sistemaBancario.domain.model.AccountBankData;

import java.util.Random;

public class BankDataFactory {

    //Define o número da agência baseado no endereço.
    private static String agencyNumberCreator(String ufState) {
        String agencyNumber = "0000-0";
        for (int i = 0; i < Database.BRAZILIAN_STATES.length; i++) {
            if (Database.BRAZILIAN_STATES[i].equals(ufState)) {
                agencyNumber = (i < 9) ? "000" + (i + 1) + "-1" : "00" + (i + 1) + "-1";
                break;
            }
        }
        return agencyNumber;
    }

    //Define o número da conta baseado na agência.
    private static String accountNumberCreator(String agencyNumber) {
        String accountNumberFinal = "00000-0";
        while (accountNumberFinal.equals("00000-0") || AccountExistenceChecker.accountExistis(accountNumberFinal, agencyNumber)) {
            Random random = new Random();
            String accountNumberN = String.valueOf(random.nextInt(10000, 100000));
            String accountNumberD = String.valueOf(random.nextInt(1, 10));
            accountNumberFinal = accountNumberN + "-" + accountNumberD;
        }
        return accountNumberFinal;
    }

    public static AccountBankData bankDataCreation(String ufState){
        String agencyNumber = agencyNumberCreator(ufState);
        String accountNumber = accountNumberCreator(agencyNumber);
        return new AccountBankData(agencyNumber, accountNumber);
    }
}

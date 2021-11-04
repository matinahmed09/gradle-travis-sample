package io.turntabl;

public class AccountManager {
    private final String accountManagerName;

    public AccountManager(String accountManagerName) {
        this.accountManagerName = accountManagerName;
    }

    public String getAccountManagerName() {
        return accountManagerName;
    }


    @Override
    public String toString() {
        return "AccountManager{" +
                "accountManagerName='" + accountManagerName + '\'' +
                '}';
    }

}

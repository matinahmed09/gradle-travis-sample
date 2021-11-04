package io.turntabl;

public class CorporateClient extends Client{
    private AccountManager accountManager;
    public CorporateClient(String clientName, Integer clientId, ServiceLevel serviceLevel) {
        super(clientName, clientId, serviceLevel);
    }

    @Override
    public String getClientName() {
        return accountManager.getAccountManagerName();
    }

    @Override
    public String toString() {
        return "Corporate{" +
                "accountManager=" + accountManager +
                '}';
    }
}

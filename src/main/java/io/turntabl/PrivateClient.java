package io.turntabl;

public class PrivateClient extends Client {
    private String name;

    public PrivateClient(String name, Integer clientId, ServiceLevel serviceLevel) {
        super(name, clientId, serviceLevel);
    }

    @Override
    public String getClientName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "PrivateClient{" +
                "name='" + name + '\'' +
                '}';
    }
}

package io.turntabl;

public abstract class Client {
    private  String clientName;
    private Integer clientId;
    private  ServiceLevel serviceLevel;


    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public void setServiceLevel(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public Client(String clientName, Integer clientId, ServiceLevel serviceLevel) {
        this.clientName = clientName;
        this.clientId = clientId;
        this.serviceLevel = serviceLevel;
    }

    public abstract String getClientName();



    public Integer getClientId() {
        return clientId;
    }

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", clientId=" + clientId +
                ", serviceLevel=" + serviceLevel +
                '}';
    }

}

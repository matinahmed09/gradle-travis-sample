import io.turntabl.Client;
import io.turntabl.ServiceLevel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RegisterClient {
    private List<Client> clientList = new ArrayList<>();

    public RegisterClient(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<String> getContactNames() {
        return clientList.stream()
                .filter(c->c.getServiceLevel().equals(ServiceLevel.Gold)).map(Client::getClientName)
                .collect(Collectors.toList());
    }
    public String getClientNameByID(String clientId){
        return clientList.stream()
                .filter(c->c.getClientId().equals(clientId))
                .map(Client::getClientName)
                .findFirst()
                .orElseThrow(()->new RuntimeException("NOT FOUND"));
    }
    public Map<ServiceLevel, Long> getcountforservicelevel(){
        return clientList.stream()
                .collect(Collectors.
                        groupingBy(Client::getServiceLevel,
                                Collectors
                                        .counting()));
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }
}

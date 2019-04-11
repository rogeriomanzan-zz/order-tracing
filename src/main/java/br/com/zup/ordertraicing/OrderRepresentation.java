package br.com.zup.ordertraicing;

import javax.validation.constraints.NotNull;

public class OrderRepresentation {

    private String id;

    @NotNull(message = "ClientId cannot be null")
    private String clientId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

}

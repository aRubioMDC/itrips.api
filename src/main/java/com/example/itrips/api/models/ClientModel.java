package com.example.itrips.api.models;

import javax.persistence.*;

@Entity
@Table(name = "client")

public class ClientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long clientId;

    private String clientFGivenName;
    private String clientSGivenName;
    private String clientFLastName;
    private String clientSLastName;
    
    public long getClientId() {
        return clientId;
    }
    public void setClientId(long clientId) {
        this.clientId = clientId;
    }
    public String getClientFGivenName() {
        return clientFGivenName;
    }
    public void setClientFGivenName(String clientFGivenName) {
        this.clientFGivenName = clientFGivenName;
    }
    public String getClientSGivenName() {
        return clientSGivenName;
    }
    public void setClientSGivenName(String clientSGivenName) {
        this.clientSGivenName = clientSGivenName;
    }
    public String getClientFLastName() {
        return clientFLastName;
    }
    public void setClientFLastName(String clientFLastName) {
        this.clientFLastName = clientFLastName;
    }
    public String getClientSLastName() {
        return clientSLastName;
    }
    public void setClientSLastName(String clientSLastName) {
        this.clientSLastName = clientSLastName;
    }
}

package br.com.serviceflow.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = Client.TABLE)
public final class Client extends Users {

    private static final String TABLE = "client";

    public Client(UUID id, String username, String name, String password, String telephone, String email){
        super(id, username, name, password, telephone, email);
    }

    public Client(){
        super();
    }
    
}

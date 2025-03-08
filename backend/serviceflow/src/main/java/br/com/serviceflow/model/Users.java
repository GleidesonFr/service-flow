package br.com.serviceflow.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public sealed class Users permits Client, Attendant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, length = 15)
    private String telephone;

    @Column(nullable = false)
    private String email;

    public Users(UUID id, String username, String name, String password, String telephone, String email){
        this.id = id;
        this.username = username;
        this.name = name;
        this.password = password;
        this.telephone = telephone;
        this.email = email;
    }

    public Users(){}

    
    public UUID getId(){
        return this.id;
    }

    public void setId(UUID id){
        this.id = id;
    }

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getTelephone(){
        return this.telephone;
    }

    public void setTelephone(String telephone){
        this.telephone = telephone;
    }
}

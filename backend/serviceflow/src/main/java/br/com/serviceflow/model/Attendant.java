package br.com.serviceflow.model;

import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = Attendant.TABLE)
public final class Attendant extends Users {

    private static final String TABLE = "attendant";

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "setor_id")
    private Setor setor;

    public Attendant(UUID id, String username, String name, String password, 
    String telephone, String email, Setor setor){
        super(id, username, name, password, telephone, email);
        this.setor = setor;
    }

    public Attendant(){
        super();
    }
}

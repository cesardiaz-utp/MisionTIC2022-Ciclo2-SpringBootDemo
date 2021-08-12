package co.edu.utp.misiontic2022.c2.cdiaz.gr48sbdemo.model.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String pass;
}

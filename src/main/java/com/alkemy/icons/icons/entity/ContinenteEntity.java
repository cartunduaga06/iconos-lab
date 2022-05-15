package com.alkemy.icons.icons.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;


import javax.persistence.*;

@Entity
@Table(name="continente")

@Getter
@Setter

public class ContinenteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String imagen;
    private String denominacion;
}

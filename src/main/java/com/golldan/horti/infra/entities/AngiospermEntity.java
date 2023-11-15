package com.golldan.horti.infra.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Table(name = "angiosperm")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class AngiospermEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_angiosperm;

    @Column
    private String common_name;
    
    @Column
    private String scientific_name;
    
    @Column
    private Integer id_genus;
    
    @CreatedDate
    private LocalDateTime created_at;

    @LastModifiedDate
    private LocalDateTime updated_at;
}

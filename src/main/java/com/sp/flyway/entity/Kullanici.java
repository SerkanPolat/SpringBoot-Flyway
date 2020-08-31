package com.sp.flyway.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="kullanici")
@Data
public class Kullanici {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String kulad;
    @Column
    private String kulsoyad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKulad() {
        return kulad;
    }

    public void setKulad(String kulad) {
        this.kulad = kulad;
    }

    public String getKulsoyad() {
        return kulsoyad;
    }

    public void setKulsoyad(String kulsoyad) {
        this.kulsoyad = kulsoyad;
    }
}

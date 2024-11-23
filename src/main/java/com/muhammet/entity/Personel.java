package com.muhammet.entity;

import java.util.UUID;

public class Personel {
    private String id;
    private String ad;
    private String adres;
    private String tel;
    private String email;
    private Unvanlar unvan;
    /**
     * 1-20 arasında olmalı,
     * 1- Hizmetli
     * 2- Müdür
     * 3- Mutemet
     * 4- Mühendis
     * 5- Genel Müdür
     * .....
     */
    private int intUnvan;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personel{");
        sb.append("id='").append(id).append('\'');
        sb.append(", ad='").append(ad).append('\'');
        sb.append(", adres='").append(adres).append('\'');
        sb.append(", tel='").append(tel).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", unvan='").append(unvan).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Personel(String ad, String adres, String tel, String email, Unvanlar unvan, int intUnvan) {
        this.ad = ad;
        this.adres = adres;
        this.tel = tel;
        this.email = email;
        this.unvan = unvan;
        this.intUnvan = intUnvan;
        this.id = UUID.randomUUID().toString();
    }


    public Unvanlar getUnvan() {
        return unvan;
    }

    public void setUnvan(Unvanlar unvan) {
        this.unvan = unvan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

package com.sample.core.domain;

import com.sample.core.enums.CajaEnum;

public class Rodado {

    private int id;
    private String patente;
    private String motor_rodaje;
    private String motor;
    private String color;
    private String baul;
    private CajaEnum caja;
    private CajaEnum tipo;
    private CajaEnum tipoconsumo;
    private CajaEnum puertas;
    private CajaEnum tiporodado;

    public Rodado() {}

    public Rodado(int id, String patente, String motor_rodaje, String motor, String color, String baul,
                  CajaEnum caja, CajaEnum tipo, CajaEnum tipoconsumo,
                  CajaEnum puertas, CajaEnum tiporodado) {
        this.id = id;
        this.patente = patente;
        this.motor_rodaje = motor_rodaje;
        this.motor = motor;
        this.color = color;
        this.baul = baul;
        this.caja = caja;
        this.tipo = tipo;
        this.tipoconsumo = tipoconsumo;
        this.puertas = puertas;
        this.tiporodado = tiporodado;
    }

    // 🔹 GETTERS Y SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMotor_rodaje() {
        return motor_rodaje;
    }

    public void setMotor_rodaje(String motor_rodaje) {
        this.motor_rodaje = motor_rodaje;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBaul() {
        return baul;
    }

    public void setBaul(String baul) {
        this.baul = baul;
    }

    public CajaEnum getCaja() {
        return caja;
    }

    public void setCaja(CajaEnum caja) {
        this.caja = caja;
    }

    public CajaEnum getTipo() {
        return tipo;
    }

    public void setTipo(CajaEnum tipo) {
        this.tipo = tipo;
    }

    public CajaEnum getTipoconsumo() {
        return tipoconsumo;
    }

    public void setTipoconsumo(CajaEnum tipoconsumo) {
        this.tipoconsumo = tipoconsumo;
    }

    public CajaEnum getPuertas() {
        return puertas;
    }

    public void setPuertas(CajaEnum puertas) {
        this.puertas = puertas;
    }

    public CajaEnum getTiporodado() {
        return tiporodado;
    }

    public void setTiporodado(CajaEnum tiporodado) {
        this.tiporodado = tiporodado;
    }
}
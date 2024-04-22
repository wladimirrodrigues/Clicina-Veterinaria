package br.com.soaave.ClicinaVeterinaria.models;

public class Consulta {
    // Aqui você define os atributos da consulta (por exemplo, nomePet, dataConsulta, etc.)
    private String nomePet;
    private String dataConsulta;




    // Construtor, getters e setters
    public Consulta(String nomePet, String dataConsulta) {
        this.nomePet = nomePet;
        this.dataConsulta = dataConsulta;

    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }
}

package br.com.soaave.ClicinaVeterinaria.models;

public class Consulta {
    // Aqui você define os atributos da consulta (por exemplo, nomePet, dataConsulta, etc.)
    private String nomePet;
    private String dataConsulta;
    private final String nomeDono;




    // Construtor, getters e setters
    public Consulta(String nomePet, String dataConsulta, String nomeDono) {
        this.nomePet = nomePet;
        this.dataConsulta = dataConsulta;
        this.nomeDono = nomeDono;

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
    public String getNomeDono() {
        return nomeDono;
    }
    public void setNomeDono(String nomeDono) {
        this.dataConsulta = nomeDono;
    }
}

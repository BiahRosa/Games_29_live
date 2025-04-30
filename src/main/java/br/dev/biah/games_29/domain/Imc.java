package br.dev.biah.games_29.domain;

public class Imc {

    private String nome;
    private int peso;
    private double altura;
    private double imc;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        imc = peso / Math.pow(altura, 2);
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
}

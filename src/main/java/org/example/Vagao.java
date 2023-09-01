package org.example;

public class Vagao {
    private int idVagao;
    private double capMaxdeCarga;
    private Composicao composicaoVagao;

    public Vagao (int idVagao, double capMaxdeCarga, Composicao composicaoVagao){
        this.idVagao = idVagao;
        this.capMaxdeCarga = capMaxdeCarga;
        this.composicaoVagao = composicaoVagao;    
    }

    public int getIdVagao() {
        return idVagao;
    }

    public void setIdVagao(int idVagao) {
        this.idVagao = idVagao;
    }

    public double getCapMaxdeCarga() {
        return capMaxdeCarga;
    }

    public void setCapMaxdeCarga(double capMaxdeCarga) {
        this.capMaxdeCarga = capMaxdeCarga;
    }

    public Composicao getComposicaoVagao() {
        return composicaoVagao;
    }

    public void setComposicaoVagao(Composicao composicaoVagao) {
        this.composicaoVagao = composicaoVagao;
    }
}

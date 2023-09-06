package org.example;

import java.util.ArrayList;

public class Composicao {
    private int idComposicao;
    private int qtdLocomotivas;
    private Locomotiva locomotiva;
    private int qtdVagao;
    private Vagao vagao;


    public Composicao(int idComposicao, int qtdLocomotivas, Locomotiva locomotiva, int qtdVagao,
            Vagao vagao) {
        this.idComposicao = idComposicao;
        this.qtdLocomotivas = qtdLocomotivas;
        this.locomotiva = locomotiva;
        this.qtdVagao = qtdVagao;
        this.vagao = vagao;
    }

    public int getidComposicao() {
        return idComposicao;
    }

    public int getQtdLocomotivas() {
        return qtdLocomotivas;
    }

    public void setQtdLocomotivas(int qtdLocomotivas) {
        this.qtdLocomotivas = qtdLocomotivas;
    }

    public Locomotiva getLocomotiva() {
        return locomotiva;
    }

    public void setLocomotiva(ArrayList<Locomotiva> locomotiva, int posicao) {
        if (locomotiva == null) {
            this.locomotiva = null;
        } else {
            this.locomotiva = locomotiva.get(posicao);
        }

    }

    public int getQtdVagao() {
        return qtdVagao;
    }
    
    public void setQtdVagao(int qtdVagao) {
        this.qtdVagao = qtdVagao;
    }

    public Vagao getVagao() {
        return vagao;
    }

    public void setVagao(Vagao vagao) {
        this.vagao = vagao;
    }

    public boolean criarComposicao(ArrayList<Locomotiva> locomotiva, ArrayList<Composicao> composicao) {
        boolean estado = false;
        
        return estado;
    }

    public boolean apagarComposicao(Locomotiva[] locomotiva, int posicao, Composicao[] composicao) {
        boolean estado = false;

        for (int i = 0; i < locomotiva.length; i++) {
            if (locomotiva[i] == null) {
                locomotiva[i] = composicao[posicao].getLocomotiva();
                composicao[posicao].setLocomotiva(null, posicao);
                composicao[posicao] = null;
                break;
            }
        }
        return estado;
    }

    public boolean engataLocomotiva(Locomotiva[] locomotiva, int posicao, Composicao[] composicao) {
        boolean estado = false;
        return estado;
    }

    public boolean desengataLocomotiva(Locomotiva[] locomotiva, int posicao, Composicao[] composicao) {
        boolean estado = false;
        return estado;
    }

    public boolean engataVagao(Vagao vagao) {
        boolean estado = false;
        return estado;
    }

    public boolean desengataVagao(Vagao vagao) {
        boolean estado = false;
        return estado;
    }

    public void toString(ArrayList<Composicao> composicao, int posicao) {
        System.out
                .println("ID:" + composicao.get(posicao).getidComposicao() + "\nQuantidade Locomotivas: "
                        + composicao.get(posicao).getQtdLocomotivas() + "\nLocomotiva: "
                        + composicao.get(posicao).getLocomotiva() + "\nQuantidade Vagões: "
                        + composicao.get(posicao).getQtdVagao() + "\nVagão: " + composicao.get(posicao).getVagao());
    }
}

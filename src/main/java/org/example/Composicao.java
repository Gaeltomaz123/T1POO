package org.example;

public class Composicao {
    private int identificadorComposicao;
    private int qtdLocomotivas;
    private Locomotiva locomotiva;
    private int qtdVagao;
    private Vagao vagao;

    public Composicao(int identificadorComposicao, int qtdLocomotivas, Locomotiva locomotiva, int qtdVagao,
            Vagao vagao) {
        this.identificadorComposicao = identificadorComposicao;
        this.qtdLocomotivas = qtdLocomotivas;
        this.locomotiva = locomotiva;
        this.qtdVagao = qtdVagao;
        this.vagao = vagao;
    }

    public int getIdentificadorComposicao() {
        return identificadorComposicao;
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

    public void setLocomotiva(Locomotiva locomotiva) {
        this.locomotiva = locomotiva;
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

    public boolean engataLocomotiva(Locomotiva locomotiva) {
        boolean estado = false;
        if (getLocomotiva() == null) {
            estado = true;
            setLocomotiva(locomotiva);
            System.out.println("Locomotiva encaixada!");
        } else {
            System.out.println("Locomotiva não encaixou!");
        }
        return estado;
    }

    public boolean desengataLocomotiva(Locomotiva locomotiva) {
        boolean estado = false;
        if (getLocomotiva() != null) {
            estado = true;
            setLocomotiva(null);
            System.out.println("Locomotiva desengatada");
        } else {
            System.out.println("A locomotiva não está engatada");
        }
        return estado;
    }

    public boolean engataVagao(Vagao vagao) {
        boolean estado = false;
        if (getVagao() == null) {
            estado = true;
            setVagao(vagao);
            System.out.println("Vagão encaixado!");
        } else {
            System.out.println("Vagão não encaixou!");
        }
        return estado;
    }

    public boolean desengataVagao(Vagao vagao) {
        boolean estado = false;
        if (getVagao() != null) {
            estado = true;
            setVagao(null);
            System.out.println("Vagão desengatado");
        } else {
            System.out.println("O vagão não está engatado");
        }
        return estado;
    }
}

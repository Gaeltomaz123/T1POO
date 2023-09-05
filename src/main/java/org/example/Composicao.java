package org.example;

public class Composicao {
    private String idComposicao;
    private int qtdLocomotivas;
    private Locomotiva locomotiva;
    private int qtdVagao;
    private Vagao vagao;

    public Composicao(String idComposicao, int qtdLocomotivas, Locomotiva locomotiva, int qtdVagao,
            Vagao vagao) {
        this.idComposicao = idComposicao;
        this.qtdLocomotivas = qtdLocomotivas;
        this.locomotiva = locomotiva;
        this.qtdVagao = qtdVagao;
        this.vagao = vagao;
    }

    public String getidComposicao() {
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

    public void setLocomotiva(Locomotiva[] locomotiva, int posicao) {
        this.locomotiva = locomotiva[posicao];
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

    public boolean engataLocomotiva(Locomotiva[] locomotiva, int posicao, Composicao[] composicao) {
        boolean estado = false;
        if (getLocomotiva() == null) {
            estado = true;
            setLocomotiva(locomotiva, posicao);
            locomotiva[posicao].setComposicao(composicao[posicao]);
        } else {
            System.out.println("A locomotiva não foi engatada!");
            estado = false;
        }
        return estado;
    }

    public boolean desengataLocomotiva(Locomotiva[] locomotiva, int posicao, Composicao[] composicao) {
        boolean estado = false;
        int cont = 0;
        for(int i = 0; i < locomotiva.length; i++){
            if(locomotiva[cont] != null){
                cont++;
            }
        }
        locomotiva[cont] = locomotiva[posicao]; 
        // if (getLocomotiva() != null) {
        //     estado = true;
        //     System.out.println("Locomotiva desengatada!");
        //     composicao[posicao].setLocomotiva (null , posicao);
        // } else {
        //     System.out.println("A locomotiva não está engatada");
        // }
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

    public void toString(Composicao[] composicao, int posicao) {
        System.out
                .println("ID:" + composicao[posicao].getidComposicao() + "\nQuantidade Locomotivas: "
                        + composicao[posicao].getQtdLocomotivas() + "\nLocomotiva: "
                        + composicao[posicao].getLocomotiva() + "\nQuantidade Vagões: "
                        + composicao[posicao].getQtdVagao() + "\nVagão: " + composicao[posicao].getVagao());
    }
}

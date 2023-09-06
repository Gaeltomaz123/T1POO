package org.example;

import java.util.ArrayList;

public class Composicao {
    private int idComposicao;
    private ArrayList<Locomotiva> arrayLocomotivas;
    private ArrayList<Vagao> arrayVagao;


    public Composicao(int idComposicao, ArrayList<Locomotiva> arrayLocomotivas, ArrayList<Vagao> arrayVagao) {
        this.idComposicao = idComposicao;
        this.arrayLocomotivas = arrayLocomotivas;
        this.arrayVagao = arrayVagao;
    }

    public int getidComposicao() {
        return idComposicao;
    }

    public int getQtdLocomotivas() {
        return arrayLocomotivas.size();
    }

    public Locomotiva getLocomotiva(int posicao) {
        return arrayLocomotivas.get(posicao);
    }

    public int getQtdVagao() {
        return arrayVagao.size();
    }

    public Vagao getVagao(int posicao) {
        return arrayVagao.get(posicao);
    }

    public boolean criarTrem(int id, ArrayList<Locomotiva> arrayLocomotivas){
        boolean estado = false;
        return estado;
    }

    public boolean engataLocomotiva(Locomotiva[] locomotiva, int posicao, Composicao[] composicao) {
        boolean estado = false;
        return estado;
    }

    public boolean engataVagao(Vagao vagao) {
        boolean estado = false;
        return estado;
    }

    public boolean desengataLocomotiva(Locomotiva[] locomotiva, int posicao, Composicao[] composicao) {
        boolean estado = false;
        return estado;
    }

    public boolean desengataVagao(Vagao vagao) {
        boolean estado = false;
        return estado;
    }

    public void toString(ArrayList<Composicao> composicao, int posicao) {
        System.out.println("Id do Trem:" + composicao.get(posicao).getidComposicao() 
        + "\nQuantidade Locomotivas: " + composicao.get(posicao).getQtdLocomotivas()
        + "\nLocomotivas: "); for(int i=0; i<getQtdLocomotivas(); i++){
            System.out.println("Id da Locomotiva: " + composicao.get(posicao).arrayLocomotivas.get(i).getIdLocomotiva());
        }
        System.out.println("\nQuantidade Vagões: " + composicao.get(posicao).getQtdVagao()
        + "\nVagoẽs: "); for(int i=0; i<getQtdVagao(); i++){
            System.out.println("Id do Vagao: " + composicao.get(posicao).arrayVagao.get(i).getIdVagao());
        };
        System.out.println("..........................");
    }
}

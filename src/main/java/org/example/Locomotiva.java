package org.example;

public class Locomotiva {
    private int idLocomotiva;
    private float pesoMaximo;
    private int numeroMaxVagoes;
    private Composicao composicao;

    public Locomotiva(int idLocomotiva, float pesoMaximo, int numeroMaxVagoes, Composicao composicao){
        this.idLocomotiva = idLocomotiva;
        this.pesoMaximo = pesoMaximo;
        this.numeroMaxVagoes = numeroMaxVagoes;
        this.composicao = composicao;
    }

    public int getIdLocomotiva() {
        return idLocomotiva;
    }

    public void setIdLocomotiva(int idLocomotiva) {
        this.idLocomotiva = idLocomotiva;
    }

    public float getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(float pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public int getNumeroMaxVagoes() {
        return numeroMaxVagoes;
    }

    public void setNumeroMaxVagoes(int numeroMaxVagoes) {
        this.numeroMaxVagoes = numeroMaxVagoes;
    }

    public Composicao getComposicao() {
        return composicao;
    }

    public void setComposicao(Composicao composicao) {
        this.composicao = composicao;
    }
}
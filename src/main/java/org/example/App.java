package org.example;

public class App {
    public static void main(String[] args) {
        Locomotiva[] arrayLocomotivas = new Locomotiva[5];
        Vagao[] arrayVagao = new Vagao[5];
        Composicao[] arrayComposicao = new Composicao[5];

        arrayComposicao[0] = new Composicao("1", 0, null, 0, null);
        arrayLocomotivas[0] = new Locomotiva(0, 0, 0, null);
        arrayVagao[0] = new Vagao(0, 0, null);


        arrayComposicao[0].engataLocomotiva(arrayLocomotivas, 0, arrayComposicao);
        // arrayComposicao[0].toString(arrayComposicao, 0);
        // arrayComposicao[0].desengataLocomotiva(arrayLocomotivas, 0, arrayComposicao);
    }
}

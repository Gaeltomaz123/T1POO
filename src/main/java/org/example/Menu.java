package org.example;

import java.util.Scanner;

public class Menu {
    private Locomotiva[] arrayLocomotivas = new Locomotiva[5];
    private Vagao[] arrayVagao = new Vagao[5];
    private Composicao[] arrayComposicao = new Composicao[5];

    public void criarVagoesIniciais() {
        arrayComposicao[0] = new Composicao(0, 0, null, 0, null);
        arrayComposicao[1] = new Composicao(1, 0, null, 0, null);
        arrayComposicao[2] = new Composicao(2, 0, null, 0, null);
        arrayComposicao[3] = new Composicao(3, 0, null, 0, null);
        arrayComposicao[4] = new Composicao(4, 0, null, 0, null);

        arrayLocomotivas[0] = new Locomotiva(0, 0, 0, null);
        arrayLocomotivas[1] = new Locomotiva(1, 0, 0, null);
        arrayLocomotivas[2] = new Locomotiva(2, 0, 0, null);
        arrayLocomotivas[3] = new Locomotiva(3, 0, 0, null);
        arrayLocomotivas[4] = new Locomotiva(4, 0, 0, null);

        arrayVagao[0] = new Vagao(0, 0, null);

        arrayComposicao[0].criarComposicao(arrayLocomotivas, 0, arrayComposicao);
        arrayComposicao[1].criarComposicao(arrayLocomotivas, 1, arrayComposicao);
        arrayComposicao[2].criarComposicao(arrayLocomotivas, 2, arrayComposicao);
        arrayComposicao[3].criarComposicao(arrayLocomotivas, 3, arrayComposicao);
        arrayComposicao[4].criarComposicao(arrayLocomotivas, 4, arrayComposicao);

        arrayComposicao[0].apagarComposicao(arrayLocomotivas, 0, arrayComposicao);
        arrayComposicao[2].apagarComposicao(arrayLocomotivas, 2, arrayComposicao);
        arrayComposicao[4].apagarComposicao(arrayLocomotivas, 4, arrayComposicao);


    }

    public Menu() {
        criarVagoesIniciais();
        Scanner teclado = new Scanner(System.in);
        int escolhaMenu=0;
        int escolhaEditar;
        boolean controlaSwitchEdicao = true;
        while(escolhaMenu != 5){
            System.out.println("\n[1] ...... Criar um trem");
            System.out.println("\n[2] ...... Editar um trem");
            System.out.println("\n[3] ...... Listar todos os trens criados"); // todos os trens que estao no patio
            System.out.println("\n[4] ...... Desfazer um trem");
            System.out.println("\n[5] ...... Sair");
            System.out.println("\n..................................");
            System.out.println("");
            escolhaMenu = teclado.nextInt();
            System.out.println("\f");
            switch (escolhaMenu) {
                case 1: {
                    System.out.println("..........................");
                    System.out.println("Você selecionou a opção 1");
                    System.out.println("..........................");
                    // Criar um trem
                    break;
                }
                case 2: {
                        System.out.println("..........................");
                        System.out.println("Você selecionou a opção 2");
                        System.out.println("..........................");
                    do {

                        
                        System.out.println("\n[1] ...... Inserir uma locomotiva");
                        System.out.println("\n[2] ...... Inserir um vagão");
                        System.out.println("\n[3] ...... Remover um vagão");
                        System.out.println("\n[4] ...... Listar locomotivas livres");
                        System.out.println("\n[5] ...... Listar os vagões livres");
                        System.out.println("\n[6] ...... Voltar ao menu");
                        System.out.println("\n..................................");
                        System.out.println("");

                        escolhaEditar = teclado.nextInt();

                        switch (escolhaEditar) {
                            case 1: {
                                System.out.println("..........................");
                                System.out.println("Você selecionou a opção 1");
                                System.out.println("..........................");
                                // inserir uma locomotiva
                                break;
                            }
                            case 2: {
                                System.out.println("..........................");
                                System.out.println("Você selecionou a opção 2");
                                System.out.println("..........................");
                                // inserir um vagão
                                break;
                            }
                            case 3: {
                                System.out.println("..........................");
                                System.out.println("Você selecionou a opção 3");
                                System.out.println("..........................");
                                // remover o ultimo elemento do trem
                                break;
                            }
                            case 4: {
                                System.out.println("..........................");
                                System.out.println("Você selecionou a opção 4");
                                System.out.println("..........................");
                                for (int i = 0; i < arrayLocomotivas.length; i++) {
                                    if (arrayLocomotivas[i] != null) {
                                        System.out.println("Locomotiva " + arrayLocomotivas[i].getIdLocomotiva() +
                                                " está disponível!");
                                        System.out.println("");
                                    }
                                }
                                break;
                            }
                            case 5: {
                                System.out.println("..........................");
                                System.out.println("Você selecionou a opção 5");
                                System.out.println("..........................");
                                break;
                            }
                            case 6: {
                                System.out.println("..........................");
                                System.out.println("Você selecionou a opção 6");
                                System.out.println("..........................");
                                controlaSwitchEdicao = false;
                                break;

                            }
                            default: {
                                System.out.println("Opção Inválida");
                                System.out.println("");
                                break;
                            }
                        }
                    } while (controlaSwitchEdicao == true);
                    break;
                }
                case 3: {
                    System.out.println("..........................");
                    System.out.println("Você selecionou a opção 3");
                    System.out.println("..........................");
                    for (int i = 0; i < arrayComposicao.length; i++) {
                if (arrayComposicao[i] != null) {
                    arrayComposicao[i].toString(arrayComposicao, i);
                    System.out.println();
                } else {
                    System.out.println("Composição " + i + " não existe!\n");
                }
            }
                    break;
                }
                case 4: {
                    System.out.println("..........................");
                    System.out.println("Você selecionou a opção 4");
                    System.out.println("..........................");
                    // Desfazer um trem
                    break;
                }
                case 5: {
                    // sair
                }
                default: {
                    System.out.println("Opção Inválida");
                    break;
                }

            }
    }
}
}

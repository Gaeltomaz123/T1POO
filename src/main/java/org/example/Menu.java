package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    private ArrayList<Locomotiva> arrayLocomotivas = new ArrayList<Locomotiva>();
    private ArrayList<Vagao> arrayVagao = new ArrayList<Vagao>();
    private ArrayList<Composicao> arrayComposicao = new ArrayList<Composicao>();

    public void condicoesIniciais() {
        for(int i=0; i<10; i++) {
            arrayComposicao.add(new Composicao(i, 0, null, 0, null));
        }
        for(int i=0; i<10; i++) {
            arrayVagao.add(new Vagao(i, 0, null));
        }
        for(int i=0; i<10; i++) {
            arrayLocomotivas.add(new Locomotiva(i, 0, 0, null));
        }
    }

    public Menu() {
        condicoesIniciais();
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
                                for (int i = 0; i < arrayLocomotivas.size(); i++) {
                                    Locomotiva locomotiva = arrayLocomotivas.get(i);
                                    if (locomotiva != null) {
                                        System.out.println("Locomotiva " + locomotiva.getIdLocomotiva() + " está disponível!");
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
                    if(arrayComposicao.isEmpty()){
                        System.out.println("Nenhum trem no pátio!\n");
                    } else {
                        for (int i = 0; i < arrayComposicao.size(); i++) {
                            arrayComposicao.get(i).toString(arrayComposicao, i);;
                            System.out.println();
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

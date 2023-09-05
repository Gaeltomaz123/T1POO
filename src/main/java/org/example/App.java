package org.example;
import java.util.Scanner;
public class App {
        static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        Locomotiva[] arrayLocomotivas = new Locomotiva[5];
            Vagao[] arrayVagao = new Vagao[5];
            Composicao[] arrayComposicao = new Composicao[5];

        arrayComposicao[0] = new Composicao(0, 0, null, 0, null);
        arrayComposicao[1] = new Composicao(1, 0, null, 0, null);
        arrayLocomotivas[0] = new Locomotiva(0, 0, 0, null);
        arrayLocomotivas[1] = new Locomotiva(1, 0, 0, null);
        arrayLocomotivas[2] = new Locomotiva(2, 0, 0, null);
        arrayVagao[0] = new Vagao(0, 0, null);

        arrayComposicao[0].criarComposicao(arrayLocomotivas, 0, arrayComposicao);
        arrayComposicao[1].criarComposicao(arrayLocomotivas, 1, arrayComposicao);

            arrayComposicao[0].engataLocomotiva(arrayLocomotivas, 0, arrayComposicao);
            // arrayComposicao[0].toString(arrayComposicao, 0);
            // arrayComposicao[0].desengataLocomotiva(arrayLocomotivas, 0, arrayComposicao);
            while (menu());
            
        }


    public static boolean menu(){
        String escolhaMenu;
        String escolhaEditar;
        boolean controlaSwitchEdicao = true;
            
            System.out.println("\n[1] ...... Criar um trem");
            System.out.println("\n[2] ...... Editar um trem");
            System.out.println("\n[3] ...... Listar todos os trens criados"); //todos os trens que estao no patio
            System.out.println("\n[4] ...... Desfazer um trem");
            System.out.println("\n[5] ...... Sair");
            System.out.println("\n..................................");
            System.out.println("");

            escolhaMenu = teclado.next();
            
        switch(escolhaMenu){
            case "1": {
                //Criar um trem
                break;
            }
            case "2": {
                do{
                System.out.println("\n[1] ...... Inserir uma locomotiva");
                System.out.println("\n[2] ...... Inserir um vagão");
                System.out.println("\n[3] ...... Remover um vagão");
                System.out.println("\n[4] ...... Listar locomotivas livres");
                System.out.println("\n[5] ...... Listar os vagões livres");
                System.out.println("\n[6] ...... Voltar ao menu");
                System.out.println("\n..................................");
                System.out.println("");

                escolhaEditar = teclado.next();
                
                switch(escolhaEditar){
                    case "1": {
                        //inserir uma locomotiva
                        break;
                    }
                    case "2": {
                        //inserir um vagão
                        break;
                    }
                    case "3": {
                        //remover o ultimo elemento do trem
                        break;
                    }
                    case "4": {
                        //Listar locomotivas livres
                        break;
                    }
                    case "5":{
                        //Listar vagões livres
                        break;
                    }
                    case "6":{
                        //Encerrar edição do trem
                        controlaSwitchEdicao = false;
                        break;
                        
                    }
                    default : {
                    System.out.println("Opção Inválida");
                    break;
                    }
                }
            }while(controlaSwitchEdicao == true);
                break;
            }
            case "3": {
                //listar todos os trens
                break;
            }
            case "4": {
                //Desfazer um trem
                break;
            }
            case "5": {
                //sair
                return false;
                
            }
            default : {
                System.out.println("Opção Inválida");
                break;
            }

            }
            
        
        return true;
    }
    
}

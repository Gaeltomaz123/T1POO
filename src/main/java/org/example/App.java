package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Locomotiva locomotivaUm = new Locomotiva(0, 0, 0, null);
        Vagao vagaoUm = new Vagao(0, 0, null);
        Composicao composicaoUm = new Composicao(1, 0, null, 0, null);
        
        System.out.println("Antes: "+composicaoUm.getLocomotiva());
        composicaoUm.engataLocomotiva(locomotivaUm);
        System.out.println("Depois: "+ composicaoUm.getLocomotiva());

        System.out.println("Antes: "+composicaoUm.getVagao());
        composicaoUm.engataVagao(vagaoUm);
        System.out.println("Depois: "+ composicaoUm.getVagao());

        System.out.println("Antes: "+composicaoUm.getLocomotiva());
        composicaoUm.desengataLocomotiva(locomotivaUm);
        System.out.println("Depois: "+ composicaoUm.getLocomotiva());

        System.out.println("Antes: "+composicaoUm.getVagao());
        composicaoUm.desengataVagao(vagaoUm);
        System.out.println("Depois: "+ composicaoUm.getVagao());
    } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediadoaluno;

import java.util.Scanner;

/**
 *
 * @author leandro.osouza
 */
public class Mediadoaluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);

      double nota1, nota2, media;

      System.out.printf("Informe a 1a. nota:\n");
      nota1 = ler.nextDouble();

      System.out.printf("\nInforme a 2a. nota:\n");
      nota2 = ler.nextDouble();

      

      media = (nota1 + nota2 ) / 2;

      

      if (media >= 6.0) {
          System.out.printf("\n Media final = %.2f", media);
         System.out.printf(" (aluno aprovado).\n");
      
      } else {
         double nota3;
         System.out.printf(" informe a terceira nota ");
         nota3 = ler.nextDouble();
         
         if (nota1>=  )
          
      }
    }

}
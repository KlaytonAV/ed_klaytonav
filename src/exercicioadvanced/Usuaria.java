/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicioadvanced;

import java.util.Scanner;
/**
 *
 * @author Klayton Vilares
 */
public class Usuaria {
  
    public static void main(String[] args)
          {
              int maxSize = 100;            // coloca em uma constante o tamanho do vetor
              Estrutur arr = new Estrutur(maxSize); // instancia a estrutura de dados
              Scanner entrada = new Scanner (System.in); //Instancio o objeto entrada do tipo Scanner
              Scanner entradaint = new Scanner (System.in);
              Scanner entradadouble = new Scanner (System.in);
              System.out.println("Cadastro de Joagadores");
              
              for (int i = 1; i < 2; i++) {
                 System.out.println("Digite o nome do jogador " + i);
                 String nome = entrada.nextLine();
                 System.out.println("Digite a altura do Jogador " + nome);
                 double altura = entradadouble.nextDouble();
                 System.out.println("Digite a idade do Jogador " + nome);
                 int idade = entradaint.nextInt();
                 arr.insert(nome, altura, idade);
              }

              System.out.println("Muito Bem! Agora que você cadastrou os jogadores, digite uma idade");

              if (!arr.findByAge(entradadouble.nextLine())
                  System.out.println("Não encontrado nenhum nome!!");
              
              
              
              int posicao = arr.findByAge(entradadouble.nextLine());
              
              if (posicao != arr.size())
                    System.out.println("Encontrei na posicao" + posicao );
              else
                    System.out.println("Não encontrado");
              
              
              
              
              
              arr.display();
          }      
          
}

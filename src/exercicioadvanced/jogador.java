/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicioadvanced;

/**
 *
 * @author Klayton Vilares
 */
public class jogador
   { 
   private String nome;
   private double altura;
   private int idade;
//--------------------------------------------------------------
   public jogador(String n, double a, int id)
      {                               // comentario aqui
      nome = n;
      altura = a;
      idade = id;
      }
//--------------------------------------------------------------
   public void displayjogador()
      {
      System.out.print("   Nome: " + nome);
      System.out.print(", Altura " + altura);
      System.out.println(", Idade: " + idade);
      }
//--------------------------------------------------------------
   public String getNome()           // comentario aqui
      { return nome; }
   }  // Final da Classe jogador
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
public class jogador {

    private String nome;
    private int idade;
    private double altura;

    public jogador(String n, int i, double a) {                               // comentario aqui
        nome = n;
        idade = i;
        altura = a;
    }
    
    public void displayJogador()
      {
      System.out.print("  Nome: " + nome);
      System.out.print(", Idade: " + idade);
      System.out.println(", Altura: " + altura);
      }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
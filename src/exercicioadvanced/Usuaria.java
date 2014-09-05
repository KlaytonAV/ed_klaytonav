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

    public static void main(String[] args) {
        int maxSize = 100;            // coloca em uma constante o tamanho do vetor
        Estrutura estrutura = new Estrutura(maxSize);
        Scanner scanner = new Scanner(System.in);
        estrutura.insert("Jonas", 19, 1.8);
        estrutura.insert("Andre", 28, 2.3);
        estrutura.insert("Marcos", 23, 1.5);
        estrutura.insert("Alfredo", 32, 2.2);
        estrutura.insert("Josias", 24, 1.7);
        estrutura.insert("Marcelo", 18, 2.9);
        estrutura.insert("Rubens", 21, 2.7);
        estrutura.insert("Bob Marley", 35, 2.0);
        estrutura.display();

        System.out.println("\nInsira a Idade para pesquisa: ");
        int idade = Integer.parseInt(scanner.nextLine());
        int posicao = estrutura.findByIdade(idade);
        if (posicao == estrutura.size()) {
            System.out.println("Nenhum cadastro se encaixa nessa idade!");
        } else {
            estrutura.DisplayByPosition(posicao);
        }

        System.out.println("Insira um Nome para pesquisa: ");
        String nome = scanner.nextLine();
        estrutura.DisplayByName(nome);
        
        System.out.println("Insira um nome para excluir:");
        nome = scanner.nextLine();
        if (!estrutura.delete(nome)) {
            System.out.println("Não encontrado");
        } else {
            System.out.println("Deletado!");
        }        
        estrutura.display();
    }
}
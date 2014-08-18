/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package klaytonvilares;

import java.util.Scanner;

class EstruturaAvancada //Criamos aqui nossa classe EstruturaAvancada
{

    private String[] a;                 // cria a referência do vetor
    private int nElems;               // nElems controla quantos elementos o vetor terá ...
    //-----------------------------------------------------------

    public EstruturaAvancada(int max) // método construtor
    {
        a = new String[max];                 // cria o vetor ...
        nElems = 0;                        // inicialmente sem itens ...
    }
//--------------------------------------------------------------
//Método de busca ....
//--------------------------------------------------------------

    public boolean find(String searchKey) {                              // metodo buscará o valor que a classe usuaria pedir ...
        int j;
        boolean localizado = false;
        for (j = 0; j < nElems; j++) // varrerá o vetor buscando ...
        {
            if (a[j].equals(searchKey)) // entrou o item?
            {
                localizado = true;
                break;                       // sai do for antes de finalizar ...
            }
        }
        return localizado;                    // se não, encontrou ...
    }  // fim da busca

    public boolean findx(String searchKey) {                              // metodo buscará o valor que a classe usuaria pedir ...

        int j;
        for (j = 0; j < nElems; j++) // varrerá o vetor buscando ...
        {
            if (a[j].equals(searchKey)) // entrou o item?
            {
                break;                       // sai do for antes de finalizar ...
            }
        }
        if (j == nElems) // precisou chegar no final??
        {
            return false;                   // se sim, retorna falso
        } else {
            return true;
        }
    }  // fim da busca
//--------------------------------------------------------------
//Método de inserção ....
//--------------------------------------------------------------

    public void insert(String value) // insere um elemento no vetor
    {
        a[nElems] = value;             // insere nessa posição ...
        nElems++;                      // incrementa o tamanho
    }
//--------------------------------------------------------------
//Método de remoção ....
//--------------------------------------------------------------

    public boolean delete(String value) {
        int j;
        for (j = 0; j < nElems; j++) // varre o vetor 
        {
            if (value.equals(a[j])) {
                break;
            }
        }
        if (j == nElems) // se não encontrar retorna falso
        {
            return false;
        } else // se encontrar ...
        {
            for (int k = j; k < nElems; k++) // move os mais altos para "frente"
            {
                a[k] = a[k + 1];
            }
            nElems--;                   // decrementa o contador de elementos
            return true;
        }
    }  // final do método de remoção
//--------------------------------------------------------------
//Método de visualização ....
//--------------------------------------------------------------

    public void display(String letra) // mostra o conteúdo do vetor
    {
        for (int j = 0; j < nElems; j++) {
            if (a[j].charAt(0) == letra.charAt(0)) // entrou o item?
            {
                System.out.println(a[j]);
                break;                       // sai do for antes de finalizar ...
            }

        }
        System.out.println("");
    }
    
    public void displayAll() // mostra o conteúdo do vetor
    {
        for (int j = 0; j < nElems; j++) {           
                System.out.println(a[j]);
        }
        //System.out.println("");
    }
    //-----------------------------------------------------------

    boolean findFirstChar(String letra) {
        int j;
        boolean localizado = false;
        for (j = 0; j < nElems; j++) // varrerá o vetor buscando ...
        {
            if (a[j].charAt(0) == letra.charAt(0)) // entrou o item?
            {
                localizado = true;
                break;                       // sai do for antes de finalizar ...
            }
        }
        return localizado;                    // se não, encontrou ...

    }
}  // aqui termina a classe EstruturaAvancada

/**
 *
 * @author Aluno
 */
public class AndersonAndradeCastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int maxSize = 100;            // coloca em uma constante o tamanho do vetor
        EstruturaAvancada arr;                // cria referencia para a estrutura de dados
        arr = new EstruturaAvancada(maxSize); // instancia a estrutura de dados
        int qntNomes;
        Scanner entrada = new Scanner(System.in);
        Scanner entradaInteiro = new Scanner(System.in);

        System.out.println("Bem Vindo ao Programa de Vetores!!!");
        System.out.println("Quantos nomes deseja digitar?");
        qntNomes = entradaInteiro.nextInt();
        int i = 0;
        while (i < qntNomes) {
            System.out.println("Digite o nome " + (i + 1));
            String nome = entrada.nextLine();
            if (arr.findx(nome)) {
                System.out.println("O nome ja esta cadastrado");
            } else {
                arr.insert(nome);
                i++;
            }
        }

        System.out.println("Digite a letra que deseja buscar");

        String letra = entrada.nextLine();

        if (!arr.findFirstChar(letra)) {
            System.out.println("Nenhum nome encontrado");
        }
        else
            arr.display(letra);

        while (true) {
            System.out.println("Digite o nome que deseja deletar");
            String nomeDeletar = entrada.nextLine();
            if (!nomeDeletar.equals("")) {
                if (arr.find(nomeDeletar)) {
                    arr.delete(nomeDeletar);
                    System.out.println("");
                    arr.displayAll();
                } else {
                    System.out.println("Nome nao encontrado, tente novamente");
                }
            } else {
                break;
            }
        }

    }

}

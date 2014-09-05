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
public class Estrutura {

    private jogador[] a;                 // cria a referência para um vetor do tipo Jogador
    private int nElems;               // nElems controla quantos elementos o vetor terá ...
    //-----------------------------------------------------------

    public Estrutura(int max) // método construtor
    {
        a = new jogador[max];                 // cria o vetor ...
        nElems = 0;                        // inicialmente sem itens ...
    }

    //--------------------------------------------------------------
//Método que retorna quantidade de itens do vetor ....
//--------------------------------------------------------------
    public int size() {
        return nElems;
    }

    //--------------------------------------------------------------
//Método de pesquisa binária com Inteiro
//--------------------------------------------------------------
    public int findByIdade(int searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn].getIdade() == searchKey) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return nElems;
            } else {
                if (a[curIn].getIdade() < searchKey) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }  // fim do método de pesquisa binária()

    //--------------------------------------------------------------
//Método de Busca e imprime jogador com o nome - busca linear
//--------------------------------------------------------------
    public void DisplayByName(String searchKey) {
        int j;
        boolean find = false;
        for (j = 0; j < nElems; j++) {
            if (a[j].getNome().equals(searchKey)) {
                a[j].displayJogador();
                find = true;
                break;
            }
        }
        if (!find)
        {
            System.out.println("Nenhum jogador encontrado com o nome de "+searchKey);
        }
    }
    
    public void DisplayByPosition(int position) {
        if (position >= 0 && position < nElems)
            a[position].displayJogador();
        else
            System.out.println("Nenhum jogador encontrado na posicao "+position);        
    }

    public int findByName(String searchKey) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j].getNome().equals(searchKey)) {
                break;
            }
        }

        return j;
    }
    
    private int getIndexInsert(int idade)
    {
        int j = 0;
        if (nElems != 0) {
            for (j = 0; j < nElems; j++) // localiza onde esse elemento se encaixa
            {
                if (a[j].getIdade() > idade) {
                    break;
                }
            }         
        }
        return j;
    }

//--------------------------------------------------------------
//Método de inserção ORDENADA com idade!!! ....
//--------------------------------------------------------------
    public void insert(String nome, int idade, double altura) // insere o elemento no vetor
    {
        int j = getIndexInsert(idade);

        for (int k = nElems; k > j; k--) // move os elementos maiores uma posição p/ frente
        {
            a[k] = a[k - 1];
        }
        //Apos abrir um espaço no lugar certo, ele cria o nome objeto Jogador na posição aberta!!!
        a[j] = new jogador(nome, idade, altura);                  // insere o elemento na posição necessária
        nElems++;                      // incrementa a variavel de controle de tamanho
    }  // finaliza o método de inserção



//--------------------------------------------------------------
//Método de visualização ....
//--------------------------------------------------------------
    public void display() // mostra o conteúdo do vetor
    {
        for (int j = 0; j < nElems; j++) {
            a[j].displayJogador();
        }
    }
   //-----------------------------------    
}
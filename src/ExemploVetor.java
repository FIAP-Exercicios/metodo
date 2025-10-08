/* Programa para preencher um vetor de 10 posições com valores inteiros aleatórios.
Em seguida imprimir:

a) os dados armazenados no vetor
b) soma dos elementos
c) média
d) o maior vetor

 */

import java.util.Random;

public class ExemploVetor {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        preencher(vetor);
        imprimir(vetor);
        System.out.println();
        System.out.println("\nSoma dos elementos--> " + somar(vetor));
        System.out.println("Media dos elementos--> " + media(vetor));
        System.out.println("Media dos elementos--> " + maiorValor(vetor));
    }

    public static void preencher(int[] vetor){
        Random random = new Random();
        for (int i=0; i< vetor.length; i++){

            vetor[i]= random.nextInt(100);
        }
    }

    public static void imprimir(int[] vetor){
        for (int valor : vetor){
            System.out.print(valor + " ");
        }
    }

    public static int somar(int[] vetor){
        int total = 0;
        for (int valor : vetor){
            total += valor;
        }
        return total;
    }

    public static int media(int[] vetor){
        return somar(vetor) / vetor.length;
    }
    public static int maiorValor(int[] vetor){
        int maior = Integer.MIN_VALUE;
        for (int valor: vetor){
            if (valor > maior) {
                maior = valor;
            }
        }
            return maior;
    }
}

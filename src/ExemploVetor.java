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
        imprimeir(vetor);
    }

    public static void preencher(int[] vetor){
        Random random = new Random();

        for (int i=0; i< vetor.length; i++){

            vetor[i]= random.nextInt();

        }



    }
}

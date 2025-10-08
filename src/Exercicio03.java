import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] x = new int[3];

        for (int i=0; i< x.length; i++) {
            System.out.print("Me informe o " + (i+1) + " valor--> ");
            x[i]=sc.nextInt();
        }

        int maior= maiorValor(x);

        System.out.print("O maior valor é--> "+ maior);

    }
    public static int maiorValor(int[] x){
        int aux= x[0];

        for (int i=0; i< x.length; i++){

            if(x[i] > aux){
                aux= x[i];


            }

        }
        return aux;
    }
}

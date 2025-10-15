import java.util.Random;

public class Exercicio05 {
    public static void main(String[] args) {
        int[] x;

        x= Preencher();
        Imprimir(x);

        System.out.println();

        x= Inversão(x);
        Imprimir(x);

    }
    public static int[] Preencher(){
        Random rd= new Random();
        int[] y= new int[10];

        for (int i= 0; i< y.length; i++){

            y[i]= rd.nextInt(0, 15);

        }
        return y;

    }
    public static void Imprimir(int[] x){

        for (int i : x){

            System.out.print(i + " ");

        }

    }
    public static int[] Inversão(int[] x){
        int aux;

        for (int i=0; i< x.length / 2; i++){

            aux= x[i];
            x[i] = x[x.length -1 -i];
            x[x.length -1 -i] = aux;
        }
        return x;

    }
}

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N1;

        System.out.println("Me informe o 1° valor Inteiro--> ");
        N1= sc.nextInt();

        if (N1 >= 0){

            imprimirDivisor(N1);

        }


    }

    public static void imprimirDivisor(int N1){
        for (int cont= 1; cont <= N1; cont++){

            if(N1 % cont== 0){

                System.out.println("Divisores deste número é--> " + -cont + " " + cont);

            }

        }

    }
}

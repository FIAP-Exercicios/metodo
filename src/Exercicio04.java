import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a,b,c,delta;
        double[] raiz;

        System.out.println("a--> ");
        a = sc.nextDouble();

        if (a==0){
            System.out.println("Não é uma Equação de 2° grau");
        }

        else {

            System.out.println("b--> ");
            b = sc.nextDouble();

            System.out.println("c--> ");
            c = sc.nextDouble();

            delta= Delta(a,b,c);
            if (delta<0){

                System.out.println("A equação não tem raiz real");

            }
            else {

                raiz= CalcularRaiz(a,b,delta);
                System.out.println("x'= "+ raiz[0]);
                System.out.println("x''= "+ raiz[1]);
            }
        }



    }
    public static double Delta(double a, double b, double c){
        return b*b - 4 * a * c;
    }
    public static double[] CalcularRaiz(double a, double b, double delta){
        double[] raizes= new double[2];
        raizes[0]= (-b + Math.sqrt(delta)) / (2 * a);
        raizes[1]= (-b - Math.sqrt(delta)) / (2 * a);

        return raizes;

    }

}



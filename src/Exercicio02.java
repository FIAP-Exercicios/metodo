import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double valor1, valor2, valor3;


        System.out.print("Me inform o 1° valor--> ");
        valor1=sc.nextInt();

        System.out.print("Me inform o 2° valor--> ");
        valor2=sc.nextInt();

        System.out.print("Me inform o 3° valor--> ");
        valor3=sc.nextInt();

        if (validar(valor1, valor2, valor3)){
            classificar(valor1, valor2, valor3);
        }
        else {

            System.out.println("Não é um triângulo");
        }


    }
    public static boolean validar(double v1, double v2, double v3){
        return (v1 < v2 + v3 && v2 < v1 +v3 && v3 < v1 + v2);
    }

    public static void classificar(double v1, double v2, double v3){

        if (v1 == v2 && v2==v3){

            System.out.println("Triângulo equilátero");

        } else if (v1==v2 || v1==v3 || v2==v3) {
            System.out.println("Triângulo isósceles");
        }
        else {
            System.out.println("Triângulo escaleno");
        }

    }
}

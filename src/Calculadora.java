
import java.util.Scanner;
public class Calculadora {


    void iniciarCalculadora(){
        int cont = 0;
        int resultado= 0;
        System.out.println("Calculadora Iniciada");
        System.out.println("Este programa finalizara luego de 5 operaciones");
        System.out.println("---------------------");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n1 = leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        int n2 = leer.nextInt();
        System.out.println(" + - * /");
        System.out.println("Ingrese el signo de la operacion que quiere realizar: ");
        String operacion=leer.next();
        while(cont < 5 ){
            switch (operacion) {
                case "+":
                    resultado = suma(n1, n2);
                    cont = cont + 1;
                    break;
                case "-":
                    resultado = resta(n1, n2);
                    cont = cont + 1;
                    break;
                case "*":
                    resultado = multiplicacion(n1, n2);
                    cont = cont + 1;
                    break;
                case "/":
                    //Ejercicio 3
                    try {
                        resultado = division(n1, n2);
                        cont = cont + 1;
                    }catch (Exception ex){
                        System.out.println("NO se puede dividir por cero");
                    }

                    break;
                default:
                    System.out.println("Error, operación no encontrada");
                    break;
            }
            System.out.println("Resutaldo: "+resultado);
            if(resultado < 0){
                System.out.println("El resultado es negativo, tene cuidado!");
            } else if (resultado > 1000) {
                System.out.println("El resultado es un número grande");
            }

           if(cont < 5){
               System.out.println("Opreciones restantes: "+(5-cont));
               System.out.println("Ingrese un numero: ");
               n1 = leer.nextInt();
               System.out.println("Ingrese otro numero: ");
               n2 = leer.nextInt();
               System.out.println(" + - * /");
               System.out.println("Ingrese el signo de la operacion que quiere realizar: ");
               operacion=leer.next();
           }
        }
    }


    int suma(int n1, int n2){
        return n1+n2;
    }
    int resta(int n1, int n2){
        return n1-n2;
    }
    int multiplicacion(int n1, int n2){
        return n1*n2;
    }
    int division(int n1, int n2){
        return n1/n2;
    }
}

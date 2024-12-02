import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca num:");
        int num1 = input.nextInt();
        
        System.out.print("Introduzca la operación: ");
        String operacion = input.next();
        
        System.out.print("Introduzca num:");
        int num2 = input.nextInt();
        
        switch (operacion) {
            case "+":
                int suma = num1 + num2;
                
                System.out.printf("Resultado de %d + %d = %d\n", num1, num2, suma);
                break;
            case "-":
                int resta = num1 - num2;
                System.out.printf("Resultado de %d - %d = %d\n", num1, num2, resta);
                break;
            
            case "*":
                int multiplicacion = num1 * num2;
                System.out.printf("Resultado de %d * %d = %d\n", num1, num2, multiplicacion);
                break;

            case "/":
                int division = num1 / num2;
                int resto = num1 % num2;
                System.out.printf("Resultado de %d / %d = %d con un resto = %d\n", num1, num2, division, resto);
                break;     
                
                 
        }
    }
    
}

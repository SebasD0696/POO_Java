
package Paquete1;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        int op = 0, x, y;
        float radio, altura, base, lado1, lado2, lado3;
        Scanner leer = new Scanner(System.in);
        
        do {            
            System.out.println("==================== Menu ====================");
            System.out.println("1. Agregar Circulo");
            System.out.println("2. Agregar Triangulo");
            System.out.println("3. Agregar Rectangulo");
            System.out.println("4. Agregar Cuadrado");
            System.out.println("5. Salir");
            System.out.print("Digite su opcion: ");
            op = leer.nextInt();
                    
            switch (op) 
            {
                case 1 -> {
                    System.out.print("Digite el radio del circulo: ");
                    radio = leer.nextFloat();
                    
                    System.out.print("Digite la posicion en x del circulo: ");
                    x = leer.nextInt();
                    
                    System.out.print("Digite la posicion en y del circulo: ");
                    y = leer.nextInt();
                    
                    Circulo circulo = new Circulo(x, y, radio);
                    System.out.println(circulo.mostrarDatos());
                    break;
                }
                
                case 2 -> {
                    System.out.print("Digite el lado 1 del triangulo: ");
                    lado1 = leer.nextFloat();
                    
                    System.out.print("Digite el lado 2 del triangulo: ");
                    lado2 = leer.nextFloat();
                    
                    System.out.print("Digite el lado 3 del triangulo: ");
                    lado3 = leer.nextFloat();
                    
                    System.out.print("Digite la posicion en x del circulo: ");
                    x = leer.nextInt();
                    
                    System.out.print("Digite la posicion en y del circulo: ");
                    y = leer.nextInt();                    
                    
                    Triangulo triangulo = new Triangulo(lado1, lado2, lado3, x, y);
                    System.out.println(triangulo.mostrarDatos());
                    break;
                }
                
                case 3 -> {
                    System.out.print("Digite la base del rectangulo: ");
                    base = leer.nextFloat();
                    
                    System.out.print("Digite la altura del rectangulo: ");
                    altura = leer.nextFloat();
                    
                    System.out.print("Digite la posicion en x del circulo: ");
                    x = leer.nextInt();
                    
                    System.out.print("Digite la posicion en y del circulo: ");
                    y = leer.nextInt();                    
                    
                    Rectangulo rectangulo = new Rectangulo(base, altura, x, y);
                    System.out.println(rectangulo.mostrarDatos());
                    break;
                }
                
                case 4 -> {
                    System.out.print("Digite el lado del cuadrado: ");
                    base = leer.nextFloat();
                    
                    System.out.print("Digite la posicion en x del circulo: ");
                    x = leer.nextInt();
                    
                    System.out.print("Digite la posicion en y del circulo: ");
                    y = leer.nextInt();                    
                    
                    Cuadrado cuadrado = new Cuadrado(x, y, base);
                    System.out.println(cuadrado.mostrarDatos());
                    break;
                }
            }

        } while(op != 5);
    }
}

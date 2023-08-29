
package Paquete1;

public class Triangulo extends Figura
{
    private float lado1;
    private float lado2;
    private float lado3;

    public Triangulo(float lado1, float lado2, float lado3, int x, int y) 
    {
        super(x, y);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    @Override
    public double obtenerArea()
    {
        double s = (lado1 + lado2 + lado3) / 2; 
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
    
    @Override
    public float obtenerPerimetro()
    {
        float perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }
    
    @Override
    public String mostrarDatos()
    {
        return "El triangulo tiene un area de: " + obtenerArea() + "\nPerimetro de: " + obtenerPerimetro() + "\nEsta ubicado en el punto ( " + getX() + " , " + getY() + " )";
    }
    
}

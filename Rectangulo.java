
package Paquete1;

public class Rectangulo extends Figura
{
    private float base;
    private float altura;

    public Rectangulo(float base, float altura, int x, int y) 
    {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double obtenerArea()
    {
        double area = base * altura;
        return area;
    }
    
    @Override
    public float obtenerPerimetro()
    {
        float perimetro = 2 * (base + altura);
        return perimetro;
    }
    
    @Override
    public String mostrarDatos()
    {
        return "El Rectangulo tiene un area de: " + obtenerArea() + "\nPerimetro de: " + obtenerPerimetro() + "\nEsta ubicado en el punto ( " + getX() + " , " + getY() + " )";
    }
        
}

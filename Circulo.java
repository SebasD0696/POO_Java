
package Paquete1;

public class Circulo extends Figura
{
    private float radio;
    
    public Circulo(int x, int y, float radio) 
    {
        super(x, y);
        this.radio = radio;
    }
    
    @Override
    public double obtenerArea()
    {
        double area = (radio * radio) * 3.1415f;
        return area;
    }
    
    @Override
    public float obtenerPerimetro()
    {
        float perimetro = radio * 2 * 3.1415f;
        return perimetro;
    }
    
    @Override
    public String mostrarDatos()
    {
        return "El circulo tiene un area de: " + obtenerArea() + "\nPerimetro de: " + obtenerPerimetro() + "\nEsta ubicado en el punto ( " + getX() + " , " + getY() + " )";
    }
    
    
}

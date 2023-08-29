
package Paquete1;

public class Cuadrado extends Rectangulo
{

    public Cuadrado(int x, int y, float base)
    {
        super(base, base, x, y);
    }
    
    @Override
    public String mostrarDatos()
    {
        return "El Cuadrado tiene un area de: " + obtenerArea() + "\nPerimetro de: " + obtenerPerimetro() + "\nEsta ubicado en el punto ( " + getX() + " , " + getY() + " )";
    }
    
}

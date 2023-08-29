
package Paquete1;

public abstract class Figura 
{
    private int x;
    private int y;

    public Figura(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }

    public int getX() 
    {
        return x;
    }

    public int getY() 
    {
        return y;
    }
    
    public abstract double obtenerArea();
    public abstract float obtenerPerimetro();
    public abstract String mostrarDatos();
}

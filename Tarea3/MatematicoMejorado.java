package Tarea1;

public class MatematicoMejorado
{
    double a, b, c;
    Punto d, m;
    double hipotenusa, cateto;

    public MatematicoMejorado(double a, double b, double c, double hipotenusa, double cateto){
        this. a = a;
        this. b = b;
        this. c = c;
        this. hipotenusa = hipotenusa;
        this. cateto = cateto;
    }

    public String ecuacionDeSegundoGrado(){
        double x1 = (-b + (Math.sqrt(Math.pow(b, 2) - 4 * (a * c))))/ 2 * a;
        double x2 = (-b - (Math.sqrt(Math.pow(b, 2) - 4 * (a * c))))/ 2 * a;
        
        String res = "Los valores que X podria tener son: "+x1+" , "+x2;
        
        return res;
    }
    
    public String ecuacionDeLaRecta(Punto d, Punto m){
        double calcularM = (d.getY() - m.getY())/(d.getX()- m.getX());
         String res = "Y = "+ calcularM + " * (X - "+ d.getX()+ ")+ " + d.getY();
         return res;
    }
    
    public double hallarCatetoFaltante(){
        double catetoFaltante = Math.sqrt(Math.pow(hipotenusa, 2) + Math.pow(cateto, 2)); 
        return catetoFaltante;
    }
}

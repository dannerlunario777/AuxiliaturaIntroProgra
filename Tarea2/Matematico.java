package Tarea1;

public class Matematico
{
    int n1, n2, n3;
    double base, altura;
    Punto d, m;
    public Matematico(int n1, int n2, int n3, double base, double altura){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.base = base;
        this.altura = altura;
    }

    public String numMayorMedioMenor(){
        String res = "";
        if(n1 > n2 && n1 > n3){
            int aux = n1;
            if(n2 > n3){
                res = "El numero mayor es: "+aux+", El numero del medio es: "+n2+" Y el numero menor es: "+n3;
            }else{
                res = "El numero mayor es: "+aux+", El numero del medio es: "+n3+" Y el numero menor es: "+n2;
            }
        }if(n2 > n1 && n2 > n3){
            int aux = n2;
            if(n1 > n3){
                res = "El numero mayor es: "+aux+", El numero del medio es: "+n1+" Y el numero menor es: "+n3;
            }else{
                res = "El numero mayor es: "+aux+", El numero del medio es: "+n3+" Y el numero menor es: "+n1;
            }
        }if(n3 > n1 && n3 > n2){
            int aux = n3;
            if(n1 > n2){
                res = "El numero mayor es: "+aux+", El numero del medio es: "+n1+" Y el numero menor es: "+n2;
            }else{
                res = "El numero mayor es: "+aux+", El numero del medio es: "+n2+" Y el numero menor es: "+n1;
            }
        }
        return res;
    }

    public double areaCuadrado(){
        return base * altura;
    }

    public double distanciEntrePuntos(Punto d, Punto m){
        return Math.sqrt(Math.pow(m.getX() -  d.getX(), 2)+Math.pow(m.getY() - d.getY(), 2));
    }

    public String cuadrante(Punto d){
        String res = "";
        if(d.getX() > 0 && d.getY() > 0 ){
            res = "Tu punto se encuentra en el primer cuadrante";
        }if(d.getX() < 0 && d.getY() < 0 ){
            res = "Tu punto se encuentra en el tercer cuadrante";
        }if(d.getX() > 0 && d.getY() < 0 ){
            res = "Tu punto se encuentra en el cuarto cuadrante";
        }if(d.getX() < 0 && d.getY() > 0 ){
            res = "Tu punto se encuentra en el segundo cuadrante";
        }
        return res;
    }
}





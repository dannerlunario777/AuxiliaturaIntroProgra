package Tarea2P2;

public class Estudiante
{
    private String name;
    private int nota;
    
    public Estudiante(String name, int nota){
        this.name = name;
        this.nota = nota;
    }
    public String getName(){
        return name;
    }
    public int getNota(){
        return nota;
    }
}

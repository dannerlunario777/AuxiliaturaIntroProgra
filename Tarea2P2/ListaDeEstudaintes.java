package Tarea2P2;
import java.util.ArrayList;
public class ListaDeEstudaintes
{
    private ArrayList<Estudiante> estudiantes;
    private int limiteDeEstudiantes;
    public ListaDeEstudaintes(int limite){
        estudiantes = new ArrayList();
        limiteDeEstudiantes = limite;
    }

    public void añadirEstudiantes(Estudiante estudent){
        int cont = 0;
        while(cont < limiteDeEstudiantes){
            cont++;
            estudiantes.add(estudent);
            break;
        }
    }

    public int sacarPromedioDeNotas(){
        int promedio = 0;
        for(int i = 0; i < estudiantes.size(); i ++){
            promedio += estudiantes.get(i).getNota();
        }
        promedio = promedio / limiteDeEstudiantes;
        return promedio;
    }

    public int sacarPromedioDeNotasAprobadas(){
        int promedioAprob = 0;
        int estudentAprob = 0;
        for(int i = 0; i < estudiantes.size(); i ++){
            if(estudiantes.get(i).getNota() > 51){
                estudentAprob++;
                promedioAprob += estudiantes.get(i).getNota();
            }
        }
        promedioAprob = promedioAprob / estudentAprob;
        return promedioAprob;
    }
    
    public int cantidadDeReprobados(){        
        int estudentReprob = 0;
        for(int i = 0; i < estudiantes.size(); i ++){
            if(estudiantes.get(i).getNota() < 51){
                estudentReprob++;
            }
        }
        return estudentReprob;
    }
    
    public int cantidadDeAprobados(){        
        int estudentAprob = 0;
        for(int i = 0; i < estudiantes.size(); i ++){
            if(estudiantes.get(i).getNota() > 51){
                estudentAprob++;
            }
        }
        return estudentAprob;
    }
    
    public String notaMasAlta(){
        String res = "La nota mas alta es del estudiante: ";
        int notaMasAlta = estudiantes.get(0).getNota();
        for(int i = 0; i < estudiantes.size(); i ++){
        if(notaMasAlta < estudiantes.get(i).getNota()){
            notaMasAlta = estudiantes.get(i).getNota();
            res = res + estudiantes.get(i) + ", su nota es de: " + notaMasAlta + " puntos!!";
        }else{
            notaMasAlta = notaMasAlta;
            res = res + estudiantes.get(0) + ", su nota es de: " + notaMasAlta + " puntos!!";
        }
        }
        return res;
    }
}

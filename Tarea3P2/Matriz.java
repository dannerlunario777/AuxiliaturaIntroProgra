package Tarea3P2;

public class Matriz
{
    private int [][] matriz;
    private int tamaño;

    public Matriz(int tam){
        tamaño = tam;
        matriz = new int [tam][tam];
    }

    public void llenarMatriz(int num){
        for(int i = 0; i < tamaño; i++){
            for(int j = 0; j < tamaño; j++){
                matriz [i][j] = num;
                num++;
            }
        }
    }

    public void recorridoCaracol(){
        int aux = matriz.length;
        int [][] nMatriz = new int [aux][aux];
        for(int i = 0; i < tamaño; i++){
            for(int j = 0; j < tamaño; j++){

            }
        }
    }

    public void recorridoEnX(){
        int aux = matriz.length;
        int [][] nMatriz = new int [aux][aux];
        for(int i = 0; i < tamaño; i++){
            for(int j = 0; j < tamaño; j++){
                if((i + j) == tamaño - 1 || i == j){
                    nMatriz[i][j] = matriz[i][j];
                }else{
                    nMatriz[i][j] = 0;
                }
            }
        }
        mostrar(nMatriz);
    }

    public void mostrar(int [][] matriz){
        for(int fila = 0; fila < matriz.length; fila++){
            for(int columna = 0; columna < matriz.length; columna++){
                System.out.print(matriz[fila][columna]+"");
            }
            System.out.println();
        }
    }
}


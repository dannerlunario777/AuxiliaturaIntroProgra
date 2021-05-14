
public class CiclosE1
{
    private int num;
    private int cont;
    public CiclosE1(int num){
        this.num = num;
        cont = 0;
    }

    public void Ejercicio1(){
        int aux = 0;
        while(cont < num){
            if(num >= 0 & num <= 8){
                switch(num){
                    case 8:
                    aux = 5;
                    System.out.println(aux);
                    cont++;
                    case 7:
                    aux = 4;
                    System.out.println(aux);
                    cont++;
                    case 6:
                    aux = 3;
                    System.out.println(aux);
                    cont++;
                    case 5:
                    aux = 2;
                    System.out.println(aux);
                    cont++;
                    case 4:
                    aux = 2;
                    System.out.println(aux);
                    cont++;
                    case 3:
                    aux = 1;
                    System.out.println(aux);
                    cont++;
                    case 2:
                    aux = 1;
                    System.out.println(aux);
                    cont++;
                    case 1:
                    aux = 1;
                    System.out.println(aux);
                    cont++;
                    break;
                }
            }else{
                cont = 7;
                System.out.println("1\n"+"1\n"+"1\n"+"2\n"+"2\n"+"3\n"+"4\n"+"5");
                for(int i = 2;i < num - 7; i++){
                    System.out.println(cont);
                    cont = cont + i; 
                }
            }

        }
    }
}


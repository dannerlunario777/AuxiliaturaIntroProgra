
public class CiclosE2
{
    private int num;
    private int cont;
    public CiclosE2(int num){
        this.num = num;
        cont = 0; 
    }

    public void ejercicio2(){
        int aux = 0;
        int cont = 1;
        int help = 0;
        int aux2 = 0;
        int aux3 = 2;
        while(aux < num){
            if(help<4){
                for(int i = aux2; i < 4 && aux < num; i++){
                    cont = cont + i;
                    System.out.println(cont);
                    aux++;
                    help++;

                } 
            }else{
                help = 2;
                if(help > 0){
                    for(int i = aux3; i > 0; i--){
                        cont = cont + i;
                        System.out.println(cont);
                        aux++;
                        help--;
                    }
                    cont=cont+1;
                    aux2 = 1;
                    aux3 = 1;
                }
            }
        }
    }
}


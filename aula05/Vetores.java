void main(){
    //vetor é um objeto
    int[] vetor = new int[5];

    int tamanho = vetor.length;

    vetor[0] = 10;
    vetor[4] = 99;

    int outra[] = {1, 2, 3, 4};

    int matriz[][] = new int [3][2]; //matriz com linha e coluna

    matriz[2][1] = 50;

    // vetor com 10 posições, iniciando com números ímpares, começando com 3

    int matrizDez[] = {3, 5, 7, 9, 11, 13, 15, 17, 19, 21};

    //vetor de cem posições
    int vetorCem[] = new int[100];
    //dando valores ás 100 posições com loop for (todos ímpares)
    for ( int i = 0; i<vetorCem.length; i++ ){
        
        // maneira com operador ternário (ou elvis)
        vetorCem[i] = (i==0 ? vetorCem[i] = 3 : vetorCem[i-1]+2);

        //maneira com if-else tradicional 
        /*   if (i == 0) {
            vetorCem[i] = 3;
        }else{
            vetorCem[i] = vetorCem[i-1]+2;
        }*/ 
        
        //maneira com switch case tradicional
       /*  switch (i) {
            case 0:
                vetorCem[i] = 3;
                break;
        
            default:
            vetorCem[i] = vetorCem[i-1]+2;
                break;
        } */

        //maneira com switch como expressão
        /*vetorCem[i] = switch(i){
         case 0 -> vetorCem[i] = 3;
         default -> vetorCem[i-1]+2;   
        }; */ 

        IO.println(vetorCem[i]);
    }

   
}
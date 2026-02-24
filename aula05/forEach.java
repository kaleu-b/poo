public void main(){

    int[] vetor = {4,7,20,4000};

    int matrix[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

    for (int num : vetor) {
        IO.println(num);
    }

    for (int[] linha : matrix) {
        for(int valor : linha){
            IO.println(valor);
        }
        
    }

}
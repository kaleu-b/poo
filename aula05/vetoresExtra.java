void main(){

     int matrix[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

    
    for (int i=0; i<matrix.length; i++){
        for(int j = 0; j<matrix[i].length; j++){
            

            if (j == matrix[j].length-1) {
                IO.print(matrix[i][j]);
                IO.println("");
            }else{
            IO.print(matrix[i][j]);    
            }

        }
    }
}


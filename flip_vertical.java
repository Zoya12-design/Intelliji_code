public class swip_columnwise {
    public static void main(String args[]){
        int[][] array = {
                {1,2,3},
                {4,5,6},
                 {7,8,9}};

        for(int i =0; i< array.length;i++){
            for(int j = 0; j<array[i].length; j++){
                System.out.print(array[i][j]+" ");
            }
        }
        System.out.println();

        //swip column wise
        int col = array[0].length;
        for(int i =0;i<col;i++){
            int top =0;
            int bottom = array.length-1;
            if(top <bottom){
                int temp = array[top][i];
                array[top][i] = array[bottom][i];
                array[bottom][i] = temp;
                top++;
                bottom--;

            }
        }
        //print array again
        for(int i =0; i< array.length;i++){
            for(int j = 0; j<array[i].length; j++){
                System.out.print(array[i][j]+" ");
            }
        }
    }
}

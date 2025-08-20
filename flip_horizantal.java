public class flip_horizentally{
    public static void main(String[] args) {
        int array[][] = {{1, 2, 3}, { 4, 5,6}, {7,8,9}};

        for(int i =0; i< array.length;i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }

        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            int left = 0;
            int right = array[i].length-1;
            while (left < right) {
                int temp = array[i][left];
                array[i][left] = array[i][right];
                array[i][right] = temp;
                left++;
                right--;
            }
        }
            for(int i =0; i< array.length;i++){
                for(int j =0; j< array[i].length;j++){
                    System.out.print(array[i][j]+" ");
                }
            }

        }

    }
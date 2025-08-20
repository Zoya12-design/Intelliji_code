public class row_magic {
    public static void checkrow(int[][] array) {
        int rows = array.length;

        boolean isRowMagic = true;
        int rowSum = 0;

        for (int j = 0; j < rows; j++) {
            rowSum += array[0][j];
        }

        for (int i = 1; i < rows; i++) {
            int currentRowSum = 0;

            for (int j = 0; j < rows; j++) {
                currentRowSum += array[i][j];
            }
            if (currentRowSum != rowSum) {
                isRowMagic = false;
                break;
            }
        }
            if(isRowMagic){
                System.out.println("row magic");
            }
            if(!isRowMagic){
                System.out.println("not row magic");
            }

        }

        public static void main (String args[]){
            int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

            System.out.println("original array");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
            row_magic majic = new row_magic();
            majic.checkrow(array);

        }
    }

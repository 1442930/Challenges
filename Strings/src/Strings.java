public class Strings {
    public static void main(String[] args) {
        String line = "1,4,3,2,3,7,5,6,9\n"+
                "8,6,3,7,3,7,5,6,9\n";
        String[] arr = line.split("\n");
        String[][] mat = new String[2][];
        for(int i = 0; i < arr.length; i++){
            mat[i] = arr[i].split(",");
        }
        int[][] matrix = new int[2][mat[0].length];
        System.out.println("Unsorted");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < mat[i].length; j++){
                matrix[i][j] = Integer.parseInt(mat[i][j]);
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        BubbleSortAscend(matrix);
        BubbleSortDescend(matrix);

    }

    public static void BubbleSortAscend(int[][] array){
        int temp;
        for(int k = 0; k < 2; k++) {
            for (int i = 0; i < array[k].length - 1; i++) {
                for (int j = 0; j < array[k].length - i -  1; j++) {
                    if (array[k][j] > array[k][j + 1]) {
                        temp = array[k][j];
                        array[k][j] = array[k][j + 1];
                        array[k][j + 1] = temp;
                    }
                }
            }
        }
        System.out.println("Ascending");
        print(array);
    }

    public static void BubbleSortDescend(int[][] array){
        int temp;
        for(int k = 0; k < 2; k++) {
            for (int i = 0; i < array[k].length - 1; i++) {
                for (int j = 0; j < array[k].length  -  1; j++) {
                    if (array[k][j] < array[k][j + 1]) {
                        temp = array[k][j];
                        array[k][j] = array[k][j + 1];
                        array[k][j + 1] = temp;
                    }
                }
            }
        }
        System.out.println("Descending");
        print(array);

    }
    public static void print(int[][] array){
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

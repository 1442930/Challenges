public class String1 {
    public static void main(String[] args) {
        String line = "1,4,3,2,3,7,5,6,9";
        String[] array = line.split(",");
        int[] arr = new int[array.length];
        System.out.println("Unsorted");
        for(int i = 0; i < array.length; i++){
            arr[i] = Integer.parseInt(array[i]);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSortAscend(arr);
        print(arr);
        bubbleSortDescend(arr);
        print(arr);
    }

    public static void bubbleSortAscend(int[] array){
        int temp;
        System.out.println("Ascending");
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - 1; j++){
                if(array[j] > array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortDescend(int[] array){
        int temp;
        System.out.println("Descending");
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - 1; j++){
                if(array[j] < array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void print(int[] array){
        System.out.println();
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

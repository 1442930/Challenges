public class Arrays {
    public static void main(String[] args) {
        int[] array = new int[50];
        for(int i = 0; i < 50; i++){
            array[i] = (int)(Math.random()*100);
        }
        for(int number : array){
            System.out.print(number + " ");
        }
        System.out.println();
        for(int i = 0; i < 50; i++){
            array[i] = array[i] + 1;
        }
        for(int number : array){
            System.out.print(number + " ");
        }
    }
}

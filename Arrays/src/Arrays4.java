public class Arrays4 {
    public static void main(String[] args) {
        int[] array = new int[50];
        for(int i = 0; i < 50; i++){
            array[i] = (int)(Math.random()*100);
        }
        for(int i = 0; i < 50; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        for(int i = 0; i < 50; i++){
            array[i] = array[i] + 1;
        }
        for(int i = 0; i < 50; i++){
            System.out.print(array[i]+ " ");
        }
    }
}

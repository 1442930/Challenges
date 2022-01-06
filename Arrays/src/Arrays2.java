public class Arrays2 {
    public static void main(String[] args) {
        int[] array = new int[50];
        for(int i = 0; i < 50; i++){
            array[i] = (int)(Math.random()*100);
        }
        for(int number : array){
            if(number%2 == 0 && number%11 == 0)
                System.out.print(number + " ");
        }
        System.out.println();
    }
}

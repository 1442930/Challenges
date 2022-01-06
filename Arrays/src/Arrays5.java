public class Arrays5 {
    public static void main(String[] args) {
        int[] array = new int[50];
        for(int i = 0; i < 50; i++){
            array[i] = (int)(Math.random()*100);
        }
        for(int i = 0; i < 50; i++){
            if(array[i]%2 == 0 && array[i]%11 == 0)
                System.out.print(array[i]+ " ");
        }
        System.out.println();
        for(int i = 0; i < 50; i++){
            array[i] = array[i] + 1;
        }
        for(int i = 0; i < 50; i++){
            if(array[i]%2 == 0 && array[i]%11 == 0)
                System.out.print(array[i]+ " ");
        }
    }
}


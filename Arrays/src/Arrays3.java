public class Arrays3 {
    public static void main(String[] args) {
        int[] array = new int[50];
        int i = 0;
        while(i < 50){
            array[i] = (int)(Math.random()*100);
            i++;
        }
        i = 0;
        while(i < 50){
            int even = array[i]%2;
            int divisible = array[i]%11;
            switch(even){
                case 0:
                    System.out.print(array[i] + " ");
                    break;
                default:
                    switch(divisible){
                        case 0:
                            System.out.print(array[i] + " ");
                    }
            }
            i++;
        }
        System.out.println();
    }
}

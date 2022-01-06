public class Arrays7 {
    public static void main(String[] args) {
        int[][] multi = new int[100][30];
        for(int i = 0; i < 100; i ++){
            for(int j = 0; j < 30; j++){
                multi[i][j] = (int)(Math.random()*100);
            }
        }
        for(int i = 0; i < 100; i ++){
            for(int j = 0; j < 30; j++){
                if(multi[i][j]%2 == 1 || multi[i][j]%8 == 0)
                    System.out.print(multi[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < 100; i ++){
            for(int j = 0; j < 30; j++){
                multi[i][j] += 1;
            }
        }

        for(int i = 0; i < 100; i ++){
            for(int j = 0; j < 30; j++){
                if(multi[i][j]%2 == 1 || multi[i][j]%8 == 0)
                    System.out.print(multi[i][j] + " ");
            }
            System.out.println();
        }
    }
}

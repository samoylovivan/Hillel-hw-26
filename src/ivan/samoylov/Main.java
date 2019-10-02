package ivan.samoylov;

public class Main {

    public static void main(String[] args) {
        int[][] islandMap = {{0,1,0,0},
                             {1,1,1,0},
                             {0,1,0,0},
                             {1,1,0,0}};
        int island = 0;
        int border = 0;
        int islandPerimetr;

        for(int i = 0; i < islandMap.length; i++){
            for(int j = 0; j < islandMap[i].length; j++){
                if(islandMap[i][j] == 1){
                    island ++;
                    if(i > 0 && islandMap[i-1][j] == 1){
                        border ++;
                    }
                    if(j > 0 && islandMap[i][j-1] == 1){
                        border ++;
                    }
                }
            }
        }
        islandPerimetr = island * 4 - border * 2;
        System.out.println("Island perimeter length: " + islandPerimetr);
	}
}

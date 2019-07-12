public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        int sides = 0; //碰到0或是超出格子，就是一個邊
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] == 0){
                    continue;
                }
                if(i-1 == -1){  //向上
                    sides++;
                }else if (i-1 != -1 && grid[i-1][j] == 0){
                    sides++;
                }

                if(i+1 == grid.length){  //向下
                    sides++;
                }else if(i-1 != grid.length && grid[i+1][j] == 0){
                    sides++;
                }

                if(j-1 == -1){  //向左
                    sides++;
                }else if (j-1 != -1 && grid[i][j-1] == 0){
                    sides++;
                }

                if(j+1 == grid[i].length){    //向右
                    sides++;
                }else if (j+1 != grid[i].length && grid[i][j+1] == 0){
                    sides++;
                }

            }
        }
        return sides;
    }
}

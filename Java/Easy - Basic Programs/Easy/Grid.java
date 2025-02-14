package Easy - Basic Programs;

public class Grid {
public int minOperation (int [][] Grid){

        int rows = Grid.length;

        int cols = Grid[0].length;

        int minoperation = 0;

        for (int col = 0; col<cols; col++){

            for (int row = 1; row<rows; row++){

                if (Grid[row][col] <= Grid[row-1][col]){

                    int increase = Grid[row-1][col]-Grid[row][col]+1;

                    Grid[row][col] += increase;

                    minoperation += increase;
                }
            }
        }

        return minoperation;

    }

    public static void main(String[] args) {
        
        Grid operation = new Grid();

        int [][] Grid = {{3,2},{1,1},{0,1}};

        int resulte = operation.minOperation(Grid);

        System.out.println("minimum Opearation : " + resulte);
    }
    
    
}

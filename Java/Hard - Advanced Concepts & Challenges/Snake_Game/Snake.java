import java.util.ArrayList;

public class Snake {

    private String dir;// direction
    private ArrayList<Point> snakePoints;
    private Board board;
    
    public static final String RIGHT = "RIGHT"; 
    public static final String LEFT = "LEFT"; 
    public static final String UP = "UP"; 
    public static final String DOWN = "DOWN"; 
    public static final String NONE = "NONE"; 

    Snake(Point point, int length, Board b){
        
        this.board = b;
        snakePoints = new ArrayList<>();
        snakePoints.add(point);
        for(int i = 1; i <=length; ++i){
            snakePoints.add(new Point(point.getX()-i, point.getY()));
        }
        dir = Snake.RIGHT;
    }

    void eatFoods(){
        int index = snakePoints.size()-1;
        snakePoints.add(snakePoints.get(index).clone());
        System.out.println("Caught Food");
    }

    void moveSnake(){
        
        if(dir.equals(Snake.RIGHT))
            snakePoints.add(0, new Point(snakePoints.get(0).getX()+1 > board.getWidth() ? 1 : snakePoints.get(0).getX()+1, snakePoints.get(0).getY()));
        else if(dir.equals(Snake.LEFT))
            snakePoints.add(0, new Point(snakePoints.get(0).getX()-1 < 1 ? board.getWidth() : snakePoints.get(0).getX()-1, snakePoints.get(0).getY()));
        else if(dir.equals(Snake.UP))
            snakePoints.add(0, new Point(snakePoints.get(0).getX(), snakePoints.get(0).getY()-1 < 1 ? board.getHeight() : snakePoints.get(0).getY()-1));
        else if(dir.equals(Snake.DOWN))
            snakePoints.add(0, new Point(snakePoints.get(0).getX(), snakePoints.get(0).getY()+1 > board.getHeight() ? 1 : snakePoints.get(0).getY()+1));
        
        snakePoints.remove(snakePoints.size()-1);
    }

    public void setDirection(String d){
        this.dir = d;
    }
    
    public String getDirection() {
        return dir;
    }
    
    public ArrayList<Point> getSnakePoints() {
        return snakePoints;
    }
}
import java.util.ArrayList;
import java.util.Random;

public class Board {

    private int width;
    private int height;
    private Point food; 
    private Snake snake;

    public Board(int w, int h) {
        this.width = w;
        this.height = h;
        snake = new Snake(new Point(w/2,h/2), 4,this);
        createFood();
    }

    private void createFood(){
        Random r = new Random();
        food = null;
        while(food == null) {
            food = new Point(r.nextInt(width-1) + 1, r.nextInt(height-1) + 1);
            switch (snake.getDirection()){
                case Snake.RIGHT:
                    if(snake.getSnakePoints().get(0).getY()+1 == food.getY() && snake.getSnakePoints().get(0).getX() == food.getX())
                        food = null;
                    break;
                case Snake.LEFT:
                    if(snake.getSnakePoints().get(0).getY()-1 == food.getY() && snake.getSnakePoints().get(0).getX() == food.getX())
                        food = null;
                    break;
                case Snake.DOWN:
                    if(snake.getSnakePoints().get(0).getX()+1 == food.getX() && snake.getSnakePoints().get(0).getY() == food.getY())
                        food = null;
                    break;
                case Snake.UP:
                    if(snake.getSnakePoints().get(0).getX()-1 == food.getX() && snake.getSnakePoints().get(0).getY() == food.getY())
                        food = null;
                    break;
            }
            for (Point points : snake.getSnakePoints()) {
                if (points.equals(food)) {
                    food = null;
                }
            }
        }

    }

    public boolean play(String direction){
        setDirection(direction);
        snake.moveSnake();
        
        boolean collision = false;
        ArrayList<Point> points = snake.getSnakePoints();
        for(int i = 1; i < points.size(); ++i){
            collision = points.get(0).equals(points.get(i)) || collision;
        }
        if(points.get(0).equals(food)){
            snake.eatFoods();
            
            createFood();
        }
        return collision;
    }

    private void setDirection(String direction){
        if(!direction.equals(Snake.NONE) && snake.getDirection() != direction){
            switch (direction){
                case Snake.RIGHT:
                    if(!snake.getDirection().equals(Snake.LEFT)){
                        snake.setDirection(direction);
                    }
                    break;
                case Snake.LEFT:
                    if(!snake.getDirection().equals(Snake.RIGHT)){
                        snake.setDirection(direction);
                    }
                    break;
                case Snake.DOWN:
                    if(!snake.getDirection().equals(Snake.UP)){
                        snake.setDirection(direction);
                    }
                    break;
                case Snake.UP:
                    if(!snake.getDirection().equals(Snake.DOWN)){
                        snake.setDirection(direction);
                    }
                    break;
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    
    public Snake getSnake() {
        return snake;
    }

    public Point getFood() {
        return food;
    }

}
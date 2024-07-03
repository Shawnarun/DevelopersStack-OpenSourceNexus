import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.*;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyEvent;

public class Game extends Application {

    private Stage stage;
    private Scene mainScene;
    private GridPane mainFrame;
    private GraphicsContext boardGraphic, backgroundGraphic;
    private Canvas boardCanvas, background;
    private AnimationTimer thread;
    private String playerInput = "NONE";
    private Board gameboard;

    private void drawBoard(){
        boardGraphic.clearRect(0, 0, boardCanvas.getWidth(), boardCanvas.getHeight());
        boardGraphic.setFill(Color.BLUE);
        for(Point p : gameboard.getSnake().getSnakePoints()){
            boardGraphic.fillRoundRect(20* p.getX(),20* p.getY(), 20, 20, 15, 15);
        }
        boardGraphic.setFill(Color.RED);
        boardGraphic.fillRoundRect(20* gameboard.getFood().getX(),20* gameboard.getFood().getY(), 20, 20, 20, 20);
    }
    
    public void startGame(Stage stage, Board board){
        this.stage = stage;
        this.gameboard = board;
        boardCanvas = new Canvas(500, 500);
        background = new Canvas(500, 500);
        mainFrame = new GridPane();
        boardGraphic = boardCanvas.getGraphicsContext2D();
        backgroundGraphic = background.getGraphicsContext2D();
        mainScene = new Scene(mainFrame, 440, 440);

        thread = new AnimationTimer() {
            long lastInteraction = 0;
            @Override
            public void handle(long now) {
                if(now > lastInteraction + 99999000){
                    if(board.play(playerInput)){
                        this.stop();
                        System.out.println("Game Over!");
                        Alert alert = new Alert(AlertType.INFORMATION);
                        alert.setHeaderText("Game Over!");
                        alert.show();
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.exit(1);
                        
                    }
                    playerInput = "NONE";
                    drawBoard();
                    lastInteraction = now;
                }
                
            }
            
        };
        
        mainFrame.add(boardCanvas, 0, 0);
        mainFrame.add(background, 0, 0);
        
        backgroundGraphic.setFill(Color.BLACK);
        for(int i = 1; i <=gameboard.getWidth(); i++){
            for(int j = 1; j<= gameboard.getHeight(); j++){
                backgroundGraphic.fillRoundRect((20 + 0) * i,(20 + 0) * j, 20, 20, 0, 0);
            }
        }
        mainScene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent e) {
                playerInput = e.getCode().toString();
                System.out.println(playerInput);
                
            }
        });
       
        stage.setTitle("Snake Game");
        stage.centerOnScreen();
        stage.setScene(mainScene);
        stage.show();
        boardCanvas.toFront();
        drawBoard();
        thread.start();
    }

    @Override
    public void start(Stage stageStage) throws Exception {
        Board board = new Board(20, 20);
        startGame(stageStage, board);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
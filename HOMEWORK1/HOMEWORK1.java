import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;




public class HOMEWORK1 extends Application{
    public void start(Stage primaryStage){

        Pane pane = new Pane();

        double height = 300;
        double paneHeight = 150;

        Rectangle r1 = new Rectangle(10, paneHeight = height * 0.2, 100, height * 0.2);
        r1.setFill(Color.RED);
        Text text1 = new Text(10, paneHeight = height * 0.2 - 10,"Project -- 20%");

        Rectangle r2 = new Rectangle(10+110, paneHeight = height * 0.2, 100, height * 0.2);
        r1.setFill(Color.BLUE);
        Text text2 = new Text(10+110, paneHeight = height * 0.2 - 10,"Quiz -- 10%");

        Rectangle r3 = new Rectangle(10+220, paneHeight = height * 0.2, 100, height * 0.2);
        r1.setFill(Color.GREEN);
        Text text3 = new Text(10+220, paneHeight = height * 0.2 - 10,"Midterm -- 30%");

        Rectangle r4 = new Rectangle(10+330, paneHeight = height * 0.2, 100, height * 0.2);
        r1.setFill(Color.ORANGE);
        Text text4 = new Text(10+330, paneHeight = height * 0.2 - 10,"Final -- 40%");

        pane.getChildren().addAll(r1, text1, r2, text2, r3, text3, r4, text4);

        Scene scene = new Scene(pane, 500, paneHeight);
        primaryStage.setTitle("Bar Chart");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }

}

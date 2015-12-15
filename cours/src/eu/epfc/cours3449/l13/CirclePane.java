
package eu.epfc.cours3449.l13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class CirclePane extends Application {
    
    public static void main(String[] args) {
        System.out.println("main start");
        Application.launch(args);
        System.out.println("main done");
    }

    @Override
    public void start(Stage stage) {
        Circle c = new Circle();
        c.setRadius(80);
        c.setCenterX(150);
        c.setCenterY(150);
        c.setStroke(Color.BLUE);
        c.setStrokeWidth(10);
        c.setFill(Color.YELLOW);
        Pane p = new Pane();
        p.getChildren().add(c);
        Scene s = new Scene(p, 300, 300);        
        stage.setScene(s);
        stage.setTitle("CercleInPane");
        stage.show();
    }
    
}


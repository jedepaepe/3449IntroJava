/*
 */

package eu.epfc.cours3449.l12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application {
    
    public static void main(String[] args) {
        System.out.println("main start");
        Application.launch(args);
        System.out.println("main done");
    }

    @Override
    public void start(Stage stage) {
        System.out.println("start invoked");
        Button b1 = new Button("1st child");
        Button b2 = new Button("2st child");
        FlowPane p = new FlowPane();
        p.getChildren().add(b1);
        p.getChildren().add(b2);
        Scene s = new Scene(p);
        stage.setScene(s);
        stage.setTitle("ButtonInPane");
        stage.show();
    }
    
}

/*
page 537
*/
package eu.epfc.cours3449.l12;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {
    
    public static void main(String[] args) {
        Application.launch(args);
     }
    
    @Override
    public void start(Stage stage) {
        Button b = new Button("Hello JavaFx");
        Scene s = new Scene(b);
        stage.setScene(s);
        stage.setTitle("Enfin");
        stage.show();
    }    
}

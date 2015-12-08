/*

 */

package eu.epfc.cours3449.l12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author jedepaepe
 */
public class MyJavaFXShort extends Application {
    
    public static void main(String[] args) {
        Application.launch(args);
     }
    
    @Override
    public void start(Stage stage) {
        stage.setScene(new Scene( new Button("Hello JavaFX")));
        stage.setTitle("Enfin");
        stage.show();
    }    
    
}

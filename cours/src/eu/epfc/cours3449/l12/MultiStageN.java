/*
Create N stage
 */

package eu.epfc.cours3449.l12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultiStageN extends Application{

    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        for(int i=0; i<10; i++) {
            Stage s = new Stage();
            Scene t = new Scene(new Button("Button: " + i));
            s.setScene(t);
            s.setTitle("Stage " + i);
            s.setX(i*130);
            s.setY(200);
            s.show();
        }
        System.out.println("Sort de la méthode start");
    }
    
}

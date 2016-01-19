package eu.epfc.cours3449l16.Except;

import javafx.application.Application;
import javafx.stage.Stage;

public class TestThrowJavaFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        try {
            Application.launch(args);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}

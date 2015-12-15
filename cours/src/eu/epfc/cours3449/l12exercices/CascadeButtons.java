package eu.epfc.cours3449.l12exercices;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/*
Leçon 12 Exercice 2
écrire un programme JavaFX qui
crée deux fenêtres
place 5 butons dans chaque fenêtre
les affiche de gauche à droite et de haut en bas dans la première fenêtre 
les affiche de droite à gauche et de bas en haut dans la seconde fenêtre
*/
public class CascadeButtons extends Application {
    
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane p = new Pane();
        for(int i=0; i<5; i++) {
            Button b = new Button("pm" + i);
            b.setLayoutX(i*40);
            b.setLayoutY(i*20);
            p.getChildren().add(b);
        }
        Scene s = new Scene(p);
        primaryStage.setScene(s);
        primaryStage.setTitle("Gauche à droite");
        primaryStage.setX(0);
        primaryStage.setY(0);
        primaryStage.show();
        
        Stage st = new Stage();
        Pane pt = new Pane();
        for(int i=0; i<5; i++) {
            Button b = new Button("s" + i);
            b.setLayoutX((4-i)*40);
            b.setLayoutY(i*20);
            pt.getChildren().add(b);
        }
        Scene t = new Scene(pt);
        st.setScene(t);
        st.setTitle("Droite à gauche");
        st.setX(400);
        st.setY(400);
        
        st.show();
    }
    
}

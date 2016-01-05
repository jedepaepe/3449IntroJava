package eu.epfc.cours3449.l13exercices;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/*
 Exercice 2 - GUI Afficher Personne
 (sans formulaire)
 */
public class PersonneReport extends Application {

    // pour la démonstration
    // en pratique la personne doit être récupérée d'une source extérieure
    // nous verrons plus tard comment faire
    private Personne personne = new Personne("Durant", "Marcelle", "Rue des nuages 5, 1000 Bruxelles", "027002011", 80, "belge");

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(30, 30, 30, 30));
        pane.setVgap(5.5);
        pane.setHgap(5.5);
        Label[] labels = new Label[6];
        labels[0] = new Label("Nom : " + personne.getNom());
        labels[1] = new Label("Prénom : " + personne.getPrenom());
        labels[2] = new Label("Adresse : " + personne.getAdresse());
        labels[3] = new Label("Téléphone : " + personne.getTelephone());
        labels[4] = new Label("Age : " + personne.getAge());
        labels[5] = new Label("Nationalité : " + personne.getNationalite());
        for (int i = 0; i < labels.length; i++) {
            pane.add(labels[i], 0, i);
        }
        Scene scene = new Scene(pane);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Personne Report");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

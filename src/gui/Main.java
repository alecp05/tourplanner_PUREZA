package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // fxml created with SceneBuilder
        Parent root = FXMLLoader.load(getClass().getResource("views/tourView.fxml"));
        System.out.println("fxml loaded");

        // bootstrap "window" named stage
        primaryStage.setTitle("First Task");
        System.out.println("set title");

        // set scene into stage in defined size
        primaryStage.setScene(new Scene(root, 800, 500));
        System.out.println("set scene");

        // let's go
        primaryStage.show();
        System.out.println("show stage");
    }

    public static void main(String[] args) {
        launch(args);
    }
}

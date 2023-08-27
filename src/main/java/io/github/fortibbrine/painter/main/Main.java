package io.github.fortibbrine.painter.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/painter.fxml"));

        Parent root = fxmlLoader.load();

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Painter");
        primaryStage.show();
    }
}

package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

import javax.print.DocFlavor;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 800, 600);

        Pane button = new Pane();
        Button buttonSignIn = new Button();
        buttonSignIn.setLayoutX(350);
        buttonSignIn.setLayoutY(200);

        Button buttonLogIn = new Button();
        buttonLogIn.setLayoutX(300);
        buttonLogIn.setLayoutY(250);

        buttonSignIn.setText("Войти");
        buttonLogIn.setText("Зарегестрироваться");

        button.getChildren().add(buttonSignIn);
        button.getChildren().add(buttonLogIn);

        root.getChildren().add(button);



        primaryStage.setTitle("Менеджер бюджета");
        primaryStage.setScene(scene);
        primaryStage.show();

    }






    public static void main(String[] args) {
        launch(args);
    }
}

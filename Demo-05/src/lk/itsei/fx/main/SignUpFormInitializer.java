package lk.itsei.fx.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SignUpFormInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/lk/itsei/fx/view/SignUpForm.fxml"));
        Parent root = loader.load();
        Scene mainScene = new Scene(root);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("FX Demo");
        primaryStage.setResizable(false);
        primaryStage.show();
        primaryStage.centerOnScreen();

    }
}

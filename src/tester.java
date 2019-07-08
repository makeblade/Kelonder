import GUI.Log_in;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class tester extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Stage stage = new Stage();

        Log_in log_in_page = new Log_in();

        Scene scene = log_in_page.getScene();
        stage.setScene(scene);
        stage.show();

    }
}

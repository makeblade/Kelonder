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

        Pane pane = new Pane();

        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.show();

    }
}

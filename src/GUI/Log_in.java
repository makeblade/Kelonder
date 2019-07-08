package GUI;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;

public class Log_in {

    public Scene getScene()
    {
        GridPane root = new GridPane();
        int rows = 10;

        root.setVgap(5);
        root.setHgap(5);

        for(int i=0; i<rows; i++)
        {
            RowConstraints rc = new RowConstraints();
            rc.setPercentHeight(100/rows);
            rc.setValignment(VPos.CENTER);
            root.getRowConstraints().add(rc);
        }

        ColumnConstraints cc = new ColumnConstraints();
        cc.setPercentWidth(100);
        cc.setHalignment(HPos.CENTER);
        root.getColumnConstraints().add(cc);

        TextField usernameField = new TextField();
        PasswordField passwordField = new PasswordField();
        StackPane passwordPane = new StackPane();
        StackPane usernamePane = new StackPane();

        passwordPane.getChildren().add(passwordField);
        usernamePane.getChildren().add(usernameField);

        usernameField.setMaxWidth(160);
        passwordField.setMaxWidth(160);
        usernameField.setAlignment(Pos.BOTTOM_CENTER);
        passwordField.setAlignment(Pos.BOTTOM_CENTER);
        usernameField.setId("usernameField");
        passwordField.setId("passwordField");

        Button login_but = new Button("Log In");
        Button sign_up_but = new Button("Sign up");
        login_but.setId("login_but");
        sign_up_but.setId("sign_up_but");

        Line line = new Line();
        line.setStartX(0); line.setEndX(140);

        root.add(usernamePane, 0, 3);
        root.add(line, 0, 4);
        root.add(passwordPane, 0, 5);
        root.add(login_but, 0, 7);
        root.add(sign_up_but, 0, 8);

        root.setGridLinesVisible(false);

        Scene scene = new Scene(root, 450, 500);
        return scene;
    }

}

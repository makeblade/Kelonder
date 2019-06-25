package GUI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;

public class Log_in {

    public Scene getScene()
    {
        StackPane root = new StackPane();
        Scene scene = new Scene(root);

        TextArea usernameField = new TextArea("UserName");
        TextArea passwordField = new TextArea("Password");
        usernameField.setId("usernameField");
        passwordField.setId("passwordField");

        Button login_but = new Button("Log In");
        Button sign_up_but = new Button("Sign up");
        login_but.setId("login_but");
        sign_up_but.setId("sign_up_but");

        root.getChildren().addAll(usernameField, passwordField, login_but, sign_up_but);

        return scene;
    }

}

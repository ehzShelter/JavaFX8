import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FormCSS extends Application {

    // Stage stores the reference of Scene
    // Scene keeps track of children (Scengraph example, StackPane --> child node buttons)
    @Override
    public void start(Stage initialStage) {
        initialStage.setTitle("FormCSS");

        Text sceneTitle = new Text("Welcome FX");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));


        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // sceneTitle add to grid
        grid.add(sceneTitle, 0, 0, 2, 1);

        // userName
        Label userName = new Label("userName: ");
        grid.add(userName, 0, 1);
        TextField user = new TextField();
        grid.add(user, 1, 1);

        // password
        Label password = new Label("password: ");
        grid.add(password, 0, 2);
        PasswordField passKey = new PasswordField();
        grid.add(passKey, 1, 2);

        // addSceneGraph to main Scene
        Scene scene = new Scene(grid, 300, 275);

        // HBox grid
        HBox horizontalBoxButton = new HBox(10);
        horizontalBoxButton.setAlignment(Pos.BOTTOM_RIGHT);

        // Button btn = new Button
        Button btn = new Button("FX Sign in");
        horizontalBoxButton.getChildren().add(btn);
        grid.add(horizontalBoxButton, 1, 4);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("FX SingIn Pressed");
            }
        });

        initialStage.setScene(scene);
        scene.getStylesheets().add
            (FormCSS.class.getResource("Login.css").toExternalForm());
        initialStage.show();
    }

    public static void main(String... args) {
        launch(args);
    }
}

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

public class FXMLform extends Application {

    // Stage stores the reference of Scene
    // Scene keeps track of children (Scengraph example, StackPane --> child node buttons)
    @Override
    public void start(Stage initialStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLForm.fxml"));

        Scene scene = new Scene(root, 300, 275);
        initialStage.setTitle("Beneventu FXML");
        initialStage.setScene(scene);
        initialStage.show();
    }

    public static void main(String... args) {
        launch(args);
    }
}

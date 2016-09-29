import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;

public class HelloFX extends Application {

    // Stage stores the reference of Scene
    // Scene keeps track of children (Scengraph example, StackPane --> child node buttons)
    @Override
    public void start(Stage initialStage) {
        Button button = new Button("Hello JavaFX8");
        button.setOnAction(e -> System.out.println("You have clicked Hello JavaFX8"));

        StackPane myPane = new StackPane();
        myPane.getChildren().add(button);

        Scene myScene = new Scene(myPane);

        initialStage.setScene(myScene);
        initialStage.setWidth(400);
        initialStage.setHeight(300);
        initialStage.show();
    }

    public static void main(String... args) {
        launch(args);
    }
}

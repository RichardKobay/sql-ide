package edu.upvictoria.sqlide;

import edu.upvictoria.sqlide.controllers.MainMenuController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.nio.file.Paths;
import java.util.Locale;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("hello");

/*        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/edu/upvictoria/sqlide/views/main-menu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        scene.getStylesheets().add(getClass().getResource("/edu/upvictoria/sqlide/style/main-menu-style.css").toExternalForm());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();*/


        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/edu/upvictoria/sqlide/views/main-menu/main-menu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        MainMenuController controller = fxmlLoader.getController();
        controller.setMainMenuStage(stage);
        scene.getStylesheets().add(getClass().getResource("/edu/upvictoria/sqlide/style/main-menu-style.css").toExternalForm());
        stage.setMinHeight(500);
        stage.setMinWidth(500);
        stage.setScene(scene);
        stage.show();

       /* try {
            String url = getClass().getResource("/edu/upvictoria/sqlide/views/main-menu-view.fxml").getPath();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/main-menu-view.fxml"));

            Scene scene = new Scene(loader.load(), 250, 230);
            scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
            scene.getStylesheets().add(getClass().getResource("/styles/main-menu-style.css").toExternalForm());

            stage.setTitle("IvanDB IDE");
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }

    public static void main(String[] args) {
        launch(args);
    }
}

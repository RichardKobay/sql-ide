package edu.upvictoria.sqlide.controllers;

import edu.upvictoria.sqlide.App;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;

public class MainMenuController {
    @FXML
    private Button codeEditorButton;

    @FXML
    private Button dataModelEditorButton;

    private Stage mainMenuStage;

    public void setMainMenuStage(Stage mainMenuStage) {
        this.mainMenuStage = mainMenuStage;
    }

    @FXML
    private void handleCodeEditorButtonAction() {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/edu/upvictoria/sqlide/views/code-editor/code-editor-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        scene.getStylesheets().add(getClass().getResource("/edu/upvictoria/sqlide/style/main-menu-style.css").toExternalForm());
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();

        mainMenuStage.close();
    }

    @FXML
    private void handleDataModelEditorButtonAction() {
        System.out.println("Data Model Editor button clicked!");
        // Add your logic to open the data model editor stage
    }
}

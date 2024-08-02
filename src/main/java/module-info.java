module edu.upvictoria.sqlide {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens edu.upvictoria.sqlide to javafx.fxml;
    opens edu.upvictoria.sqlide.controllers to javafx.fxml;
    exports edu.upvictoria.sqlide;
    opens edu.upvictoria.sqlide.controllers.codeeditor to javafx.fxml;
}
module projects {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires java.desktop;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;


    requires org.junit.jupiter.api; // JUnit API
    requires org.junit.jupiter.engine; // JUnit Engine для выполнения тестов
    requires org.junit.platform.commons; // Для платформы JUnit, если требуется

    opens com.example.demo2 to javafx.fxml; // Открываем пакет для FXML
    exports com.example.demo2; // Экспортируем основной пакет
    exports com.example.demo2.algorithms; // Экспортируем пакет алгоритмов
    opens com.example.demo2.algorithms to javafx.fxml; // Открываем алгоритмы для FXML
}

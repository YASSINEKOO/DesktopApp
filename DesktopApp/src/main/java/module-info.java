module com.example.packet_tracer {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.packet_tracer to javafx.fxml;
    exports com.example.packet_tracer;
}
package io.github.fortibbrine.painter.conroller;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import lombok.Getter;
import lombok.Setter;

@Getter
public class PainterController {

    @FXML
    private BorderPane rootLayout;

    @FXML
    private Canvas canvas;

    @Setter
    private int widthPencil = 50;

    @Setter
    private int heightPencil = 50;

    @FXML
    private void initialize() {
        this.canvas.heightProperty().bind(rootLayout.heightProperty());
        this.canvas.widthProperty().bind(rootLayout.widthProperty());
    }

    @FXML
    private void onDraw(MouseEvent event) {
        double x = event.getX();
        double y = event.getY();

        GraphicsContext gc = canvas.getGraphicsContext2D();

        int rectX = (int) x - (int) x % widthPencil;
        int rectY = (int) y - (int) y % heightPencil;

        gc.fillRect(rectX, rectY, widthPencil, heightPencil);
    }

}

package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Fence extends GraphicalObject {


    private final double x1;
    private final double x2;
    private final double startY;
    private final double distance;

    public Fence() {

        this.x1 = 0;
        this.x2 = 600;
        this.startY = 500;
        this.distance = 50;
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(Color.BLACK);


        drawTool.drawLine(x1, startY, x2, startY);
        drawTool.drawLine(x1, startY + distance, x2, startY + distance);
        drawTool.drawLine(x1, startY + 2 * distance, x2, startY + 2 * distance);
    }

    @Override
    public void update(double dt) {

    }
}
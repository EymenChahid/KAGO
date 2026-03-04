package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Sun extends GraphicalObject {


    private final double sunX;
    private final double sunY;
    private final double sunRadius;

    public Sun() {

        this.sunX = Math.random() * 800;
        this.sunY = 180;
        this.sunRadius = 80;
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(Color.YELLOW);
        drawTool.drawFilledCircle(sunX, sunY, sunRadius);
    }

    @Override
    public void update(double dt) {

    }
}

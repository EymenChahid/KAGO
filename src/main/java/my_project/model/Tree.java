package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Tree extends GraphicalObject {


    private final double treeX;
    private final double treeY;
    private final double treeWidth;
    private final double treeHeight;

    public Tree(double treeX) {
        this.treeX = treeX;
        this.treeY = 460;
        this.treeWidth = 40;
        this.treeHeight = 140;
    }

    @Override
    public void draw(DrawTool drawTool) {


        double crownX = treeX + (treeWidth * 0.5);
        double crownY = treeY;
        double crownRadius = 60;

        drawTool.setCurrentColor(139, 69, 19, 255);
        drawTool.drawFilledRectangle(treeX, treeY, treeWidth, treeHeight);

        drawTool.setCurrentColor(Color.GREEN);
        drawTool.drawFilledCircle(crownX, crownY, crownRadius);
    }

    @Override
    public void update(double dt) {

    }
}
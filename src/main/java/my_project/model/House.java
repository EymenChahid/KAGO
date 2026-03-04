package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class House extends GraphicalObject {


    private final double houseWidth;
    private final double houseHeight;
    private final double houseX;
    private final double houseY;



    public House(double houseX, double houseY, double houseWidth, double houseHeight) {
        this.houseX = houseX;
        this.houseY = houseY;
        this.houseWidth = houseWidth;
        this.houseHeight = houseHeight;
    }

    @Override
    public void draw(DrawTool drawTool) {



        double doorWidth = 0.17 * houseWidth;
        double doorHeight = 0.31 * houseHeight;
        double doorX = houseX + (houseWidth * 0.5) - (doorWidth * 0.5);
        double doorY = (houseY + houseHeight) - doorHeight;


        double windowY = houseY + (houseHeight * 0.4);
        double windowHeight = 0.15 * houseHeight;
        double windowWidth = 0.25 * houseWidth;

        double window1X = houseX + (houseWidth * 0.1);
        double window2X = houseX + (houseWidth * 0.6);



        double w1Vx = window1X + (0.5 * windowWidth);
        double w1Vy1 = windowY;
        double w1Vy2 = windowY + windowHeight;


        double w2Vx = window2X + (0.5 * windowWidth);
        double w2Vy1 = windowY;
        double w2Vy2 = windowY + windowHeight;


        double w1Hx1 = window1X;
        double w1Hy = windowY + (windowHeight * 0.5);
        double w1Hx2 = window1X + windowWidth;


        double w2Hx1 = window2X;
        double w2Hy = windowY + (windowHeight * 0.5);
        double w2Hx2 = window2X + windowWidth;


        double leftCornerX = houseX;
        double leftCornerY = houseY;

        double midPointX = houseX + (houseWidth * 0.5);
        double midPointY = houseY - (0.5 * houseHeight);

        double rightCornerX = houseX + houseWidth;
        double rightCornerY = houseY;


        double doorknobX = doorX + (doorWidth * 0.7);
        double doorknobY = doorY + (doorHeight * 0.7);
        double doorknobRadius = doorWidth * 0.09;


        double chimneyX = houseX + (houseWidth * 0.7);
        double chimneyY = midPointY;
        double chimneyWidth = houseWidth * 0.25;
        double chimneyHeight = houseHeight * 0.5;


        drawTool.setCurrentColor(Color.DARK_GRAY);
        drawTool.drawFilledRectangle(houseX, houseY, houseWidth, houseHeight);

        drawTool.setCurrentColor(Color.RED);
        drawTool.drawFilledRectangle(doorX, doorY, doorWidth, doorHeight);

        drawTool.setCurrentColor(Color.LIGHT_GRAY);
        drawTool.drawFilledRectangle(window1X, windowY, windowWidth, windowHeight);
        drawTool.drawFilledRectangle(window2X, windowY, windowWidth, windowHeight);

        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawRectangle(window1X, windowY, windowWidth, windowHeight);
        drawTool.drawRectangle(window2X, windowY, windowWidth, windowHeight);

        drawTool.drawLine(w1Vx, w1Vy1, w1Vx, w1Vy2);
        drawTool.drawLine(w2Vx, w2Vy1, w2Vx, w2Vy2);
        drawTool.drawLine(w1Hx1, w1Hy, w1Hx2, w1Hy);
        drawTool.drawLine(w2Hx1, w2Hy, w2Hx2, w2Hy);

        drawTool.drawTriangle(leftCornerX, leftCornerY, midPointX, midPointY, rightCornerX, rightCornerY);

        drawTool.setCurrentColor(Color.GRAY);
        drawTool.drawFilledRectangle(chimneyX, chimneyY, chimneyWidth, chimneyHeight);

        drawTool.setCurrentColor(Color.RED);
        drawTool.drawFilledTriangle(leftCornerX, leftCornerY, midPointX, midPointY, rightCornerX, rightCornerY);

        drawTool.setCurrentColor(Color.YELLOW);
        drawTool.drawFilledCircle(doorknobX, doorknobY, doorknobRadius);
    }

    @Override
    public void update(double dt) {






        // unverändert
    }
}
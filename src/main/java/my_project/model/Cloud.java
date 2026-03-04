package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Cloud extends GraphicalObject {

    private double CloudX ;
    private double CloudY ;
    private double CloudWidth ;
    private double CloudHeight ;


    public Cloud(double CloudX,double CloudY,double CloudWidth,double CloudHeight){

        this.CloudHeight = CloudHeight;
        this.CloudWidth = CloudWidth;
        this.CloudY = CloudY;
        this.CloudX = CloudX;


    }


    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(Color.LIGHT_GRAY);
        drawTool.drawFilledEllipse(CloudX,CloudY,CloudWidth,CloudHeight);


    }
}

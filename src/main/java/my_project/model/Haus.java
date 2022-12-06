package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Haus extends GraphicalObject {

    public Haus(double x, double y){
        this.x = x;
        this.y = y;

    }

    public void draw(DrawTool drawTool) {
        drawTool.drawRectangle(100,400,100,200);
        drawTool.setCurrentColor(Color.GREEN);
        drawTool.drawFilledTriangle(100,400,200,400,150,350);
        drawTool.setCurrentColor(new Color(0,0,0));
        drawTool.drawFilledRectangle(140,550,15,50);
        drawTool.setCurrentColor(new Color(118,116,116));
        drawTool.drawFilledRectangle(140,457,25,25);
        drawTool.drawFilledRectangle(140,425,25,25);
        drawTool.setCurrentColor(new Color(0,0,0));
        drawTool.drawRectangle(140,457,25,25);
        drawTool.drawRectangle(140,425,25,25);
        drawTool.setCurrentColor(new Color(255,212,0));
        drawTool.drawFilledCircle(144,575,2);
        drawTool.setCurrentColor(new Color(52,52,52));
        drawTool.drawRectangle(120,355,20,30);



    }
}

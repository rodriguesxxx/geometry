package services;


import models.Ponto2D;
import models.Square;
import models.Circle;
import models.Triangle;

import javax.swing.*;
import java.awt.*;


public class Drawing extends JPanel{
    
    public Drawing(int width, int height){
        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(Color.decode("#D4D4D4"));

    }

    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Square square = new Square(200, Color.BLUE, new Ponto2D(450, 30));
        square.drawing(g2d);
        Circle circle = new Circle(200, Color.PINK, new Ponto2D(200, 30));
        circle.drawing(g2d);
        Triangle triangle = new Triangle();
        triangle.drawing(g2d);
    }

}

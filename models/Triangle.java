package models;

import java.awt.*;

public class Triangle extends Figure implements IFigure{

    private int[] x = new int[3];
    private int[] y = new int[3];
    public Triangle(){
        super(Color.BLUE);
        setX(new int[]{50, 100, 0});
        setY(new int[]{0, 100, 100});
    }

    public int[] getX() {
        return x;
    }

    public void setX(int[] x) {
        this.x = x;
    }

    public int[] getY() {
        return y;
    }

    public void setY(int[] y) {
        this.y = y;
    }

    @Override
    public void drawing(Graphics2D graphics2D) {
        graphics2D.setColor(super.getColor());
        graphics2D.drawPolygon(this.getX(), this.getY(), 3);
    }

}

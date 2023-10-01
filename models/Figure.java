package models;
import java.awt.*;

public class Figure {
    Color color;
    Ponto2D ponto2D;
    public Figure(Color color, Ponto2D ponto2D) {
        setColor(color);
        setPonto2D(ponto2D);
    }
    public Figure(Color color){
        setColor(color);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Ponto2D getPonto2D() {
        return ponto2D;
    }

    public void setPonto2D(Ponto2D ponto2D) {
        this.ponto2D = ponto2D;
    }
}

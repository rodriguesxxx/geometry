package models;

import java.awt.*;

public class Square extends Figure implements IFigure{

    private int side;

    public Square(){
        super(Color.CYAN, new Ponto2D(100, 30));
        setSide(100);
    }

    public Square(int side, Color color, Ponto2D ponto2D){
        super(color, ponto2D);
        setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void drawing(Graphics2D graphics2D) {
        graphics2D.setColor(super.getColor());
        graphics2D.fillRect(
                this.getPonto2D().getX(),
                this.getPonto2D().getY(),
                this.side,
                this.side
        );
    }
}

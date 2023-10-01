package models;

import java.awt.*;

public class Circle extends Figure implements IFigure{

        private int side;

        public Circle(){
            super(Color.LIGHT_GRAY, new Ponto2D(20, 30));
            setSide(200);
        }

        public Circle(int side, Color color, Ponto2D ponto2D){
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
            graphics2D.fillOval(
                    this.getPonto2D().getX(),
                    this.getPonto2D().getY(),
                    this.side,
                    this.side
            );
        }
}

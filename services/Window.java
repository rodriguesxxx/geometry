package services;
// import javax.swing.JFrame;
import javax.swing.*;

public class Window extends JFrame{

    private int width = 1080;
    private int height = 720;

    public Window(){ init(); }

    public Window(int width, int height){
        this.setWidth(width);
        this.setHeight(height);
        init();
    }

    private void init(){
        this.setSize(getWidth(), getHeight());
        this.setTitle("NULL");
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.add(new Drawing(this.getWidth(), this.getHeight()));
        this.pack();
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    
}

package Heranca_Polimorfismo.srcAbstractMethods.entities;
import Heranca_Polimorfismo.srcAbstractMethods.entities_enum.Color;

public class Rectangle extends Shape {

    private Double width;
    private Double height;

    public Rectangle(){
        super();
    }
    public Rectangle(Color color, Double width, Double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth(){return width;}
    public Double getHeight(){return height;}

    public void setWidth(Double width){this.width = width;}
    public void setHeight(Double height){this.height = height;}

    @Override
    public double area(){
        return width * height;}
    
}

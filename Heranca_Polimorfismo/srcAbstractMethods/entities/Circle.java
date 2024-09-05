package Heranca_Polimorfismo.srcAbstractMethods.entities;

import Heranca_Polimorfismo.srcAbstractMethods.entities_enum.Color;

public class Circle extends Shape {
    
    private Double radius;

    public Circle(){
        super();
    }

    public Circle(Color color, Double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    };

}

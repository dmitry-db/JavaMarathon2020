package day9.Task2;

public class Rectangle extends Figure {
    private int width;
    private int heigth;

    public Rectangle(int width, int heigth, String color){
        super(color);
        this.width = width;
        this.heigth = heigth;
    }
    @Override
    public double area(){
        return width * heigth;
    }
    @Override
    public double perimeter(){
        return 2 * width + 2 * heigth;
    }
}

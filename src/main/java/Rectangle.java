public class Rectangle{

    private double length;
    private double width;


public Rectangle(double l, double w){
    this.length = l;
    this.width = w;
}

public double getLength(){
    return this.length;
}

public double getWidth(){
    return this.width;
}

public double area(){
    return this.length*this.width;
}

public double perimeter(){
    if (this.width == 0||this.length==0){
        return 0;
    }
    return this.length*2 + this.width*2;
}
}
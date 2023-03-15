package Java_OOP_DZ3;

public abstract class Figure implements Comparable<Figure>{
    public abstract double area();

    @Override
    public int compareTo(Figure obj) {
        if (this.area() > obj.area()) return 1;
        else if (this.area() < obj.area()) return -1;
        else return 0;
    }
}

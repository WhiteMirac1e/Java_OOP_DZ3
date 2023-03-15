package Java_OOP_DZ3;

import Java_OOP_DZ3.IncorrectTriangleException;
import Java_OOP_DZ3.NegativeValueException;

public class Square extends Rectangle{
    
    public Square(int side) throws NegativeValueException, IncorrectTriangleException{
        super(side, side);
    }

    public Square() throws NegativeValueException, IncorrectTriangleException{
        this(6);
    }

    @Override
    public String toString() {
        return String.format("Квадрат\nСторона: %d", sides[0]);
    }
}

package Java_OOP_DZ3;

import Java_OOP_DZ3.IncorrectTriangleException;
import Java_OOP_DZ3.NegativeValueException;

public abstract class Polygonal extends Figure implements Perimetrable {
    protected int[] sides;

    protected Polygonal(int[] sides) throws NegativeValueException, IncorrectTriangleException {
        if (hasNegative(sides))
            throw new NegativeValueException("Value must be more than zero");
        if (sides.length == 3 && !isTriangle(sides))
            throw new IncorrectTriangleException("Triangle is incorrect");
        this.sides = sides;
    }

    @Override
    public double perimeter() {
        double result = 0;
        for (int side : sides) {
            result += side;
        }
        return result;
    }

    private boolean hasNegative(int[] sides) {
        boolean result = false;
        for (int side : sides) {
            if (side < 0) {
                result = true;
                break;
            }
        }
        return result;
    }

    private boolean isTriangle(int[] sides) {
        if (sides[0] + sides[1] <= sides[2]
                || sides[0] + sides[2] <= sides[1]
                || sides[2] + sides[1] <= sides[0])
            return false;
        else
            return true;
    }
}

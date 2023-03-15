package Java_OOP_DZ3;


import Java_OOP_DZ3.IncorrectTriangleException;
import Java_OOP_DZ3.NegativeValueException;
import Java_OOP_DZ3.Circle;
import Java_OOP_DZ3.Rectangle;
import Java_OOP_DZ3.Square;
import Java_OOP_DZ3.Triangle;
import Java_OOP_DZ3.Figure;
import Java_OOP_DZ3.FigArray;

public class Program {
    public static void main(String[] args)
            throws NegativeValueException, IncorrectTriangleException, NumberFormatException {

        // Инициализация класса, хранящего фигуры в списке
        FigArray<Figure> storage = new FigArray<>();

        // Создание фигур
        Figure square = new Square(5);
        Figure rectangle = new Rectangle(5, 7);
        Figure triangle = new Triangle(3, 4, 5);
        Figure circle = new Circle(7);
        Figure sq = new Square();

        // Добавление фигур в список
        storage.add(square);
        storage.add(rectangle);
        storage.add(triangle);
        storage.add(circle);
        storage.add(sq);

        // Удаление фигуры по индексу
        storage.delete(4);

        // сортировка по площади фигур
        storage.sort();

        // Показать все фигуры и их параметры(длины)
        storage.showFigures();

        // Показать всю информацию о фигурах, включая площадь, периметр/длину
        storage.showAll();

    }

}

package WEEK3;

class Rectangle {
    double width;
    double height;

    // Constructor
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate the area
    double calculateArea() {
        return width * height;
    }

    // Method to calculate the perimeter
    double calculatePerimeter() {
        return 2 * (width + height);
    }
}
// hi
public class Rain {
    public static void main(String[] args) {
        // Creating a Rectangle object
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Calculating and printing the area and perimeter
        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}


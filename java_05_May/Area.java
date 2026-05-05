
class Area {

    public double area(double radius) {
        final double pi = 3.14;
        return pi * (radius * radius);
    }

    public double area(double length, double width, String shapeType) {

        if (shapeType.equalsIgnoreCase("rectangle")) {
            return length * width;
        } else if (shapeType.equalsIgnoreCase("triangle")) {
            return 0.5 * length * width;
        } else {
            throw new IllegalArgumentException("Invalid shape type: " + shapeType);
        }
    }

    public static void main(String[] args) {
        Area area = new Area();
        System.out.println("Area of circle with radius 5: " + area.area(5));
        System.out.println("Area of rectangle with length 5 and width 10: " + area.area(5, 10, "rectangle"));
        System.out.println("Area of triangle with base 5 and height 10: " + area.area(5, 10, "triangle"));
    }
}

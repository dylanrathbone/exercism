class Triangle {

    private double side1;
    private double side2;
    private double side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        if(sidesAreLessThanOrEqualToZero(side1, side2, side3)) {
            throw new TriangleException();
        }
        if (triangleEqualityIsNotMet(side1, side2, side3)) {
            throw new TriangleException();
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private boolean sidesAreLessThanOrEqualToZero(double side1, double side2, double side3) {
        return side1 <= 0 && side2 <= 0 && side3 <= 0;
    }

    private boolean triangleEqualityIsNotMet(double side1, double side2, double side3) {
       return side1 >= side2 + side3 || side2 >= side1 + side3 || side3 >= side1 + side2;
    }

    TriangleKind getKind() {
        if ((side1 + side2 + side3) / 3 == side1){
            return TriangleKind.EQUILATERAL;
        } else if (side1 == side2 || side2 == side3 || side3 == side1){
            return TriangleKind.ISOSCELES;
        } else {
            return TriangleKind.SCALENE;
        }
    }

}

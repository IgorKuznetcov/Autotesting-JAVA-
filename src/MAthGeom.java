package src;
public interface MAthGeom {
    default int getSquareTriangle(int a, int b, int c){
        return a + b + c;
    }

    default int getSquareRectangle(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    default double getSquareCircle(double r) {
        return 2 * Math.PI * r;
    }
}

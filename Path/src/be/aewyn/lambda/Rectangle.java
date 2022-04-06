package be.aewyn.lambda;

public class Rectangle {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    int getSurface(){
        return width*height;
    }
}

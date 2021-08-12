package RectanglePack;

public class Rectangle {

    private float length;
    private float width;

    Rectangle()
    {
        length = 1.2f;
        width = 1.2f;
    }

    Rectangle(float length, float width)
    {
        this.length = length;
        this.width = width;
    }

    public float getLength()
    {
        return length;
    }

    public void setLength(float length)
    {
        this.length = length;
    }

    public float getWidth()
    {
        return width;
    }

    public void setWidth(float width)
    {
        this.width = width;
    }

    public float getArea()
    {
        return length*width;
    }

    public float getPerimeter()
    {
        return length+width;
    }

    public String toString()
    {
        return "Rectangle's length: " + length + " and width: " + width;
    }


}


class Rectangle {

    int length,breadth;

    Rectangle(int l,int b){
        length = l;
        breadth = b;
    }
    Rectangle(int l){
        length = l;
        breadth = l;
    }
    public int getArea() {
        return length * breadth;
    }
    public int  getPerimeter() {
        return 2 * (length + breadth);
    }
}
class RectangleArea {
    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle(20, 27);
        System.out.println("Area of rect is: "+ rect.getArea());
        System.out.println("Perimeter of rect is: "+ rect.getPerimeter());
        Rectangle sqr = new Rectangle(42);
        System.out.println("Area of sqr is: "+ sqr.getArea());
        System.out.println("Perimeter of sqr is: "+ sqr.getPerimeter());
        
    }
}

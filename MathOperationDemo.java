import java.util.Scanner;

class MathOperation {

    int x,y;
    double r;
    String op;
    Scanner in = new Scanner(System.in);
    
    MathOperation(){
        System.out.println("Enter x and y:");
        x = in.nextInt();
        y = in.nextInt();
    }
    
    public void add() {
        r = x + y;
        op = "Addition";
    }

    public void multiply() {
        r = x * y;
        op = "Product";
    }

    public void power() {
        r = Math.pow(x, y);
        op = "Power";
    }

    public void display() {
        System.out.println(op +" of "+ x +" & "+ y +" is:"+ r);
    }
}
public class MathOperationDemo {

    public static void main(String[] args) {
        
        MathOperation mo1 = new MathOperation();
        mo1.add();
        mo1.display();
        MathOperation mo2 = new MathOperation();
        mo2.multiply();
        mo2.display();
        MathOperation mo3 = new MathOperation();
        mo3.power();
        mo3.display();

    }
}
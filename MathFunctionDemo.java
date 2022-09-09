class MathFunction{

    public int multiply(int a,int b) {
        System.out.println("Two Integer");
        return a*b;
    }
    public float multiply(float a,float b) {
        System.out.println("Two float");
        return a*b;
    }
    public float multiply(float a, int b) {
        System.out.println("A float and a integer");
        return a*b;
    }
}
class MathFunctionDemo {
    public static void main(String[] args) {
        
        MathFunction mf = new MathFunction();
        
        System.out.println(mf.multiply(8,5));
        System.out.println(mf.multiply((float)5.24, (float)13));
        System.out.println(mf.multiply((float)9.5, 17));
    }
}

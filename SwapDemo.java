class Swap{
    int value;
    Swap(int v){
        value = v;
    }
}
class SwapDemo {
    
    static void swapByValue(int x,int y){

        System.out.println("...............Call by Value............");
        System.out.println("Before swapping a = "+ x +" b = "+y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping a = "+ x +" b = "+y);
    }
    static void swapByReference(Swap x,Swap y){

        System.out.println("...............Call by Refernce............");
        System.out.println("Before swapping a = "+ x.value +" b = "+y.value);
        Swap temp = new Swap(x.value);
        x.value = y.value;
        y.value = temp.value;
        System.out.println("After swapping a = "+ x.value +" b = "+y.value);
    }
    public static void main(String[] args) {
        
        int a = 5, b = 7;
        swapByValue(a, b);
        Swap p = new Swap(20);
        Swap q = new Swap(30);
        swapByReference(p,q);
        
    }
}

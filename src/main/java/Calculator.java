import java.util.Random;

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b) throws Exception {
       if(b == 0) {
           throw new Exception("Нельзя делить на ноль!");
       }
       return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver() throws Exception {

        return times(div(add(119, 52), 45), 4);
    }
}

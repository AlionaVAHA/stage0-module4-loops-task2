package school.mjc.stage0.loops.task2;
import java.lang.Math;

public class PowerOfTwo {
    public void printPower(int power) {
        int number =2;
        if (power<0){
            System.out.println("too much power");
        }
        else{
            int counter = 0;
            while (counter<=power){
               int newNumber = (int) Math.pow(number,counter);
               System.out.println(newNumber);
                counter++;
            }
        }

    }
}

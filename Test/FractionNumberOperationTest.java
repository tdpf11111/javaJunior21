import Lesson10.FractionNumber;
import Lesson10.FractionNumberImpl;
import Lesson10.FractionNumberOperationImpl;
import org.junit.Assert;


public class FractionNumberOperationTest {

    @org.junit.Test

    public void add1(){
       FractionNumberImpl  num1 = new FractionNumberImpl(3,4);
       FractionNumberImpl  num2 = new FractionNumberImpl(2,3);


        FractionNumberOperationImpl calcul = new FractionNumberOperationImpl();
        FractionNumberImpl resultWant = new  FractionNumberImpl(17,12);
        FractionNumber resultFact = calcul.add(num1,num2);


    }

}


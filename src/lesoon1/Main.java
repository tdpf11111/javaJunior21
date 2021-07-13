package lesoon1;


import Lesson10.FractionNumber;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class stingClass = FractionNumber.class;
        Method[] methods = stingClass.getMethods();
    for (Method method:methods){
        System.out.println(method.getName());

    }
    }


}

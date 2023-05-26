package org.example.thirdHomework.tranport;

import java.lang.reflect.*;

final public class Test {
    public <T> void test(T machine){
        try {
            Class<?> clazz = Class.forName(machine.getClass().getName());
            Method[] methods = clazz.getDeclaredMethods();

            for (Method method : methods) {
                    method.setAccessible(true);
                    method.invoke(machine);
            }
        } catch (IllegalAccessException | InvocationTargetException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}

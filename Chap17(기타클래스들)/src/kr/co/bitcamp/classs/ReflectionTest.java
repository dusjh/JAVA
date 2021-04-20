package kr.co.bitcamp.classs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 *  reflection
 *  클래스의 생성자, 필드, 메서드 정보를 알아내는 것.
 *  getDeclaredConstrutors(): 생성자
 *  getDeclaredFields(): 필드
 *  getDeclaredMethods(): 메서드
 */

public class ReflectionTest {
    public static void main(String[] args) throws Exception {
        
        Class class1 = Class.forName("java.lang.String");
        
        System.out.println("[생성자 정보]");
        Constructor[] constructors = class1.getDeclaredConstructors();
        
        // 향상된 for문
        for(Constructor constructor : constructors) {
            System.out.print(constructor.getName() + "(");
            
            // 생성자 매개변수의 타입정보 얻기
            Class[] param = constructor.getParameterTypes();
            
            for(int i = 0; i < param.length; i++) {
                System.out.print(param[i].getSimpleName());
                if(i < (param.length -1)) {
                    System.out.print(", ");
                }
            }           
            System.out.println(")");         
        }
        System.out.println();
        
        
        // 필드들 표시
        Field[] fields = class1.getDeclaredFields();
        System.out.println("[필드 정보]");
 
        for(Field field : fields) {
            System.out.println(field.getType().getSimpleName()+" "+field.getName());
            
        }
        System.out.println();
        
        // 메서드 정보
        System.out.println("[메서드 정보]");
        Method[] methods = class1.getDeclaredMethods();
        
        for(Method method : methods) {
            System.out.print(method.getReturnType().getSimpleName()+" ");
            System.out.print(method.getName()+"(");
            
            // 메서드의 매개변수 타입 정보 얻기
            Class[] class2 = method.getParameterTypes();
            for(int i = 0; i < class2.length; i++) {
                System.out.print(class2[i].getSimpleName());
                if(i <(class2.length-1)) {
                    System.out.print(", ");
                }
            }
            System.out.println(")");
        }
    }
}

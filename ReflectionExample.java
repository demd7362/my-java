import lombok.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class User {
    private String name;
    private String id;
    private String password;

    public static User of(String name, String id, String password) {
        return new User(name, id, password);
    }
}

public class ReflectionExample {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class<?> clazz = User.class;
        System.out.println("Class name : " + clazz.getName()); // 클래스명 반환
        System.out.println("Class name : " + Class.forName(clazz.getName())); // 클래스명으로 찾는다
        // declared가 붙으면 객체 본연의 요소만을 반환, 붙지 않는다면 상위 클래스까지 검색하지만 private메소드와 필드는 제외된다.

        for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
            System.out.println("constructor : " + constructor.getParameterTypes().length);
        }
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println("method : " + method.getName());
        }
        System.out.println("not declared fields length : " + clazz.getFields().length); // 0
        System.out.println("declared fields length : " + clazz.getDeclaredFields().length); // 3
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println("field : " + field.getName());
        }
    }
}

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)                 /** 런타임 시 까지 넘어가도록 **/
@Target({ElementType.TYPE, ElementType.FIELD})      /** 붙일 수 있는 곳 지정 **/
@Inherited                                          /** 애노테이션 붙일 때 상위 클래스의 정보까지 가져올 수 있다. **/
public @interface MyAnnotation {

    String name() default "geonui";     /** 기본적으로 어떤 값들을 가질 수 있다. **/

    String number() default "2022";


    /** value() 라고 하나만 있을 경우, 어노테이션 사용 시 필드명 주지 않고 그냥 쓸 수 있다.
     * 하지만, 10, 12 라인 처럼 필드가 하나라도 더 있으면 value = "" 반드시 주어야 한다.
     * **/
    String value() default "default_value";

}


/**
 * 이 어노테이션을 붙이면 리플렉션 기능을 이용해, 붙은 필드의 타입, 값 등을 가져올 수 있다.
 *
 *
 */






















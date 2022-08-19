package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解--@interface
 * - @Target 是内置的注解，用于标注当前注解可以被应用的位置
 * @author sytsnb@gmail.com
 * @Date 2022 2022/8/19 9:06
 */
//@Target({ElementType.TYPE,ElementType.FIELD})//注释能被用在类和属性上
@Target(ElementType.TYPE)//注释仅能被用在类上
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoRunClass {

}

package com.example.springbootmybatisgeneratortest.common.excel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;

@Target({FIELD})
@Retention(RetentionPolicy.RUNTIME)//指定注解在运行时有效
public @interface EntiName {

    /**
     * 是否为序列号
     *
     * @return
     */
    boolean id() default false;

    /**
     * 字段名称
     *
     * @return
     */
    String RName() default "";

    /**
     * 排序字段
     *
     * @return
     */
    Class clazz() default String.class;


}

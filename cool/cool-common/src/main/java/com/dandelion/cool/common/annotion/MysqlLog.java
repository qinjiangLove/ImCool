package com.dandelion.cool.common.annotion;

import java.lang.annotation.*;
/**
 * 数据库持久化日志注解
 * @author Mr.QinJiang
 * @create 2019/3/11
 * @modify 2019/3/11 by Mr.QinJiang
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MysqlLog {

}

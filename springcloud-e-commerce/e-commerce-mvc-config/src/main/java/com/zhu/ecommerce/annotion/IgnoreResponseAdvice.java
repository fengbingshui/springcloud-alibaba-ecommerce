package com.zhu.ecommerce.annotion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <h1>忽略统一响应注解</h1>
 * Target 描述注解的使用范围
 * Retention(保留) 生命周期长度 SOURCE < CLASS < RUNTIME ，
 * 前者能作用的地方后者一定也能作用。如果需要在运行时去动态获取注解信息，
 * 那只能用 RUNTIME 注解；如果要在编译时进行一些预处理操作，
 * 比如生成一些辅助代码（如 ButterKnife），就用 CLASS注解；
 * 如果只是做一些检查性的操作，比如 @Override 和 @SuppressWarnings，则可选用 SOURCE 注解。
 *
 */

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IgnoreResponseAdvice {
}

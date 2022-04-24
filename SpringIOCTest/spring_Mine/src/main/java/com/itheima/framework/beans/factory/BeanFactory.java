package com.itheima.framework.beans.factory;

/**
 * @version v1.0
 * @ClassName: BeanFactory
 * @Description: IOC容器父接口
 */
public interface BeanFactory {

    Object getBean(String name) throws Exception;

    <T> T getBean(String name, Class<? extends T> clazz) throws Exception;
}

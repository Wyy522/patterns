package com.mine.pattern.factory.abstract_factory;

/**
 * @version v1.0
 * @ClassName: DessertFactory
 * @Description: TODO(一句话描述该类的功能)
 */
public interface DessertFactory {

    //生产咖啡的功能
    Coffee createCoffee();

    //生产甜品的功能
    Dessert createDessert();
}

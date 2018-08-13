package com.qfedu.Day11.DesignMode.AbstractFactory;
import com.qfedu.Day11.DesignMode.SimpleFactory.Person;

//提供了一个创建人的方法
public interface INvWaFactory {
     Person CreatePerson();
}

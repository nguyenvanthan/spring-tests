package fr.javageek.spring;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: Kris
 * Date: 20/03/13
 * Time: 20:21
 * To change this template use File | Settings | File Templates.
 */
public class MultipleConstructors {

    private CommonBean v;

    public MultipleConstructors() {
        System.out.println("Default");
    }

    @Autowired
    public MultipleConstructors(CommonBean value) {
        v = value;
        System.out.println("Multiple");
    }

    public CommonBean getValue() {
        return v;
    }
}

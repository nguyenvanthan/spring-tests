package fr.javageek.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User: Kris
 * Date: 20/03/13
 * Time: 20:26
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class MultipleConstructorsTest {

    @Autowired
    ApplicationContext ctx;

    @Test
    public void testInit() {
        MultipleConstructors mc = ctx.getBean(MultipleConstructors.class);
        Object o = mc.getValue();
        System.out.println("At the end, nb definitions = "+ ctx.getBeanDefinitionCount());
    }
}

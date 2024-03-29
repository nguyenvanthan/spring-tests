package fr.javageek.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:placeholder1-config.xml","classpath:placeholder2-config.xml"})
public class CommonBean1Test {

    @Autowired @Qualifier("commonBean")
    CommonBean c;

    @Autowired @Qualifier("commonBean2")
    CommonBean c2;

    @Test
    public void testValues(){
        System.out.println(c.getFirstname());
        System.out.println(c.getName());
        System.out.println(c2.getFirstname());
        System.out.println(c2.getName());
    }
}

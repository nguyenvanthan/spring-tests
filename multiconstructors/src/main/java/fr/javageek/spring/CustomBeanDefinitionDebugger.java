package fr.javageek.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;

/**
 * Created with IntelliJ IDEA.
 * User: Kris
 * Date: 20/03/13
 * Time: 20:31
 * To change this template use File | Settings | File Templates.
 */
public class CustomBeanDefinitionDebugger implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

        System.out.println("Before instantiation, number of beanDefinitions = " + configurableListableBeanFactory.getBeanDefinitionCount());
        for (String beanName : configurableListableBeanFactory.getBeanDefinitionNames()) {

            System.out.println( "Bean name : "+ beanName + ", factory name : " + configurableListableBeanFactory.getBeanDefinition(beanName).getClass().getName() );

            if (beanName.contains("#")) {
                ((BeanDefinitionRegistry)configurableListableBeanFactory).removeBeanDefinition(beanName);
            }
        }
    }
}

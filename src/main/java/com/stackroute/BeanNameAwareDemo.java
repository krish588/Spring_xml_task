package com.stackroute;

import org.springframework.beans.factory.BeanNameAware;

public class BeanNameAwareDemo implements BeanNameAware {

    @Override
    public void setBeanName(String str) {

        System.out.println(str);
    }
}

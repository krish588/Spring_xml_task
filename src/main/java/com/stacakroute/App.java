package com.stacakroute;

import com.stacakroute.domain.Actor;
import com.stacakroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Actor actor = applicationContext.getBean("actor", Actor.class);
        System.out.println(actor);
        Movie movie = applicationContext.getBean("movie", Movie.class);
        System.out.println(movie);
    }
}

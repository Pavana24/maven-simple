package com.github.jitpack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        System.out.println(new App().greet("world"));
        System.out.println("welcome to mindtree");
    }

    public String greet(String name) {
        return "Hello " + name;
    }
}

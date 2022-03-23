package com.main;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {

    @Autowired
    private Engine engine;

   public Car()
   {

   }

   public void  getEngine()
   {
       engine.printSound();
   }

}

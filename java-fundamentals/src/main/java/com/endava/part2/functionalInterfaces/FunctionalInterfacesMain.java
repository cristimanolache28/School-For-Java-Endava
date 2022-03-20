package com.endava.part2.functionalInterfaces;

import com.endava.part2.datasource.UserDataSource;

import java.time.Instant;
import java.util.function.Consumer;

public class FunctionalInterfacesMain {

    public static void main( String[] args )
    {
        // Consumer
        Consumer<String> consumer = s -> {
            String trimmed = s.trim();
            System.out.println(trimmed);
        };

        consumer.accept("   test    ");

        // Runnable
        Runnable toDo = () -> {
            while(true){
                System.out.println(Instant.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t = new Thread(toDo);
        t.start();
    }
}

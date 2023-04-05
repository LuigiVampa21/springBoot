package com.luigivampa.spring.luigispring.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

    public void up() {
        System.out.println("Mario up");
    }

    public void down() {
        System.out.println("Mario down");
    }

    public void right() {
        System.out.println("Mario right");
    }

    public void left() {
        System.out.println("Mario left");
    }
}

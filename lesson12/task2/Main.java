package com.hillel.paschenko.lesson12.task2;

public class Main {
    public static void main(String[] args) {
        MusicStyles slipknot = new RockMusic();
        MusicStyles beethoven = new ClassicMusic();
        MusicStyles jackson = new PopMusic();

        MusicStyles[] musicStyles = {
                slipknot, beethoven, jackson
        };
        for (MusicStyles musicStyle: musicStyles) {
            musicStyle.playMusic();
        }
    }
}

package com.doria.byui.teach06;

public class OddCount implements Runnable {
    OddCount(){

    };

    @Override
    public void run() {
        for(int i = 1; i < 100; i = i+2){
            System.out.println(i);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

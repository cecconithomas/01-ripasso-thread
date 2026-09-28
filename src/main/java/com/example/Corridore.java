package com.example;

class Corridore extends Thread {
    private String nome;

    public Corridore(String nome) {
        this.nome = nome;
    }

     @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(nome + " ha fatto il passo " + i);
            try {
                int pausa = 200 + (int)(Math.random() * 601);
                Thread.sleep(pausa);
            } catch (InterruptedException e) {
                return;
            }
        }
        System.out.println(nome + " HA TAGLIATO IL TRAGUARDO!");
    }
}

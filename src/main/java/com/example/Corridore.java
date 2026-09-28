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
                long pausa = 200 + (long)(Math.random() * 600);
                Thread.sleep(pausa);
            } catch (InterruptedException e) {
                return;
            }
        }
        System.out.println(nome + " ha tagliato il traguardo");
    }
}

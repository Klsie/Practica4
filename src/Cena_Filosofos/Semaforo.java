/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cena_Filosofos;

import java.util.concurrent.Semaphore;

public class Semaforo {
    private Semaphore semaphore;

    public Semaforo(int initialPermits) {
        if (initialPermits < 0) {
            throw new IllegalArgumentException("Initial permits cannot be negative");
        }
        this.semaphore = new Semaphore(initialPermits);
    }

    public void tener() throws InterruptedException {
        semaphore.acquire(); // Adquirir un permiso
    }

    public void dejar() {
        semaphore.release(); // Liberar un permiso
    }
}

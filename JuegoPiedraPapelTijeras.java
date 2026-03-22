package com.mycompany.juegopiedrapapeltijeras;

import java.util.Scanner;
import java.util.Random;

public class JuegoPiedraPapelTijeras {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            String[] opciones = {"Piedra", "Papel", "Tijera"};
            
            System.out.println("--- JUEGO INICIADO ---");
            
            while (true) {
                System.out.println("\n0: Piedra | 1: Papel | 2: Tijera | 3: Salir");
                System.out.print("Tu elección: ");
                
                if (!scanner.hasNextInt()) {
                    System.out.println("Error: Ingresa un número.");
                    scanner.next();
                    continue;
                }
                
                int usuario = scanner.nextInt();
                if (usuario == 3) break;
                if (usuario < 0 || usuario > 2) {
                    System.out.println("Opción no válida.");
                    continue;
                }
                
                int pc = random.nextInt(3);
                System.out.println("PC eligió: " + opciones[pc]);
                
                if (usuario == pc) {
                    System.out.println("¡Empate!");
                } else if ((usuario == 0 && pc == 2) || (usuario == 1 && pc == 0) || (usuario == 2 && pc == 1)) {
                    System.out.println("¡GANASTE!");
                } else {
                    System.out.println("Perdiste.");
                }
            }
            System.out.println("Fin del juego.");
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_pokemon_g5;

/**
 *
 * @author tebit
 */
public class Inter {
    public void intercambiarPaneles(JFrame frameDestino, JPanel panelNuevo) {
    frameDestino.getContentPane().removeAll(); // Elimina el panel actual
    frameDestino.getContentPane().add(panelNuevo); // Agrega el nuevo panel
    frameDestino.revalidate();
    frameDestino.repaint(); // Esto asegura que la UI se actualice correctamente
}
}

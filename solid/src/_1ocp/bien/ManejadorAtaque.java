/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1ocp.bien;

/**
 *
 * @author Danie
 */
public class ManejadorAtaque {
    private Pokemon pokemon;

    public ManejadorAtaque(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    
    public void manejarAtaque(Ataque ataque){
        this.pokemon.setPorcentajeVida(this.pokemon.getPorcentajeVida()*ataque.getDaño());
    }
}

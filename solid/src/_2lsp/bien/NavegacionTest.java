/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2lsp.bien;

import _2lsp.mal.*;

/**
 *
 * @author Palacios
 */
public class NavegacionTest {
    
    
    public void navegacion(VehiculoAcuatico... vehiculosAcuaticos) {
		for (VehiculoAcuatico vehiculo : vehiculosAcuaticos) {
			vehiculo.navegar();
		}
	}
    
}

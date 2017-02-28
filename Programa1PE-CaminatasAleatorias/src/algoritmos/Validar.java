/*
 * Copyright (C) 2017 SPQR14
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package algoritmos;

/**
 *
 * @author SPQR14
 */
public class Validar {
    
    private static boolean correcto;
    private static double [] vector;
    
    /**
     * 
     * @param vector 
     */
    public Validar(double [] vector){
        
        this.vector = vector;
        
    }
    
    public static boolean validar(){
        int flag = 0;
        int sum = 0;
        correcto = false;
        for(int i = 0; i < vector.length; i++){
            if(vector[i] > 1){
                flag = i;
            }
            sum += vector[i];
        }
        if(sum == 1){
            correcto = true;
        }else{
            //alerta
        }
        return correcto;
    }
    
}

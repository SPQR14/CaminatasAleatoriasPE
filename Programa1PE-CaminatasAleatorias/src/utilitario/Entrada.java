/*
 * Copyright (C) 2017 spqr14
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
package utilitario;
import java.util.*;

/**
 *
 * @author spqr14
 */
public class Entrada {
    
    private double [] vectorPi; 
    private double [][] matrizT;
    private int espacioT;
    private int espacioS;
    Scanner in;    
    /**
     * 
     * @param n
     * @param espacioT
     * @param espacioS 
     */
    public Entrada(int n, int espacioT, int espacioS){
        
        vectorPi = new double [n];
        matrizT = new double [n][n];
        this.espacioS = espacioS;
        this.espacioT = espacioT;
        in = new Scanner(System.in);
    }
    
    public Entrada(){

    }
    
    public void input(){
        
        System.out.println("Ingrese vector Pi");
        for(int i = 0; i < vectorPi.length; i++){
            System.out.printf("Estado %i: ", i);
            vectorPi[i] = in.nextDouble();
        }
        
    }
    
    public double [][] getMatriz(){
        return matrizT;
    }
    
    public double [] getVectorPi(){
        return vectorPi;
    }
    
    public int  getEspacioT(){
        return espacioT;
    }
    
    public int getEspacioS(){
        return espacioS;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Pacote para o arquivo da classe Hospital
 */
package coronaproject.HospitalPkg;

import java.util.ArrayList;

/**
 *  Classe refente ao hospital
 * @author mathe
 */
public class Hospital {
    /**
     * Valor inteiro para referencia da cor do hospital
     */
    private int color;
    
    /**
     * Construtor para a classe referente ao Hospital
     * @param color Variável para valor da cor do Hospital
     */
    public Hospital(int color) {
        this.color = color;
    }

    /**
     * Método para retorno do valor da cor do Hospital
     * @return Valor int referente a cor do Hospital
     */
    public int getColor() {
        return color;
    }
    
    /**
     * Determina o valor da cor do Hospital
     * @param color Variável para a cor do Hospital
     */
    public void setColor(int color) {
        this.color = color;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Pacote para o arquivo de classe do Vírus
 */
package coronaproject.VirusPkg;

/**
 *  Classe referente ao vírus COVID-19
 * @author mathe
 */
public class Virus {
    private boolean infected;

    /**
     * Método para verificação se algum objeto possuí (está infectado) a infecção
     * @return Valor booleano para a infecção (true = infectado / false = não infectado)
     */
    public boolean isInfected() {
        return infected;
    }

    /**
     * Método para determinar o valor para a infecção
     * @param infected  Valor booleano para a infecção (true = infectado / false = não infectado)
     */
    public void setInfected(boolean infected) {
        this.infected = infected;
    }
    
    
}

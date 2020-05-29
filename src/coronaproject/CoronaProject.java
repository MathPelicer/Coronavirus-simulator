/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Pacote para o arquivo "Main" do projeto
 */
package coronaproject;


import coronaproject.WorldPkg.World;

/**
 *  Programa de simulação de contágio do vírus COVID-19
 * @author mathe
 */
public class CoronaProject {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
                
        Thread.sleep(1000);
        for(int i = 0; i < 1; i++){
            System.out.println("");
        }
        
        World mapa = new World();
        
        while(true){
            System.out.println("");
            Thread.sleep(200);
            mapa.clearMap();
            mapa.PeoplePositioning();
            mapa.collisionSickHealth();
            mapa.DeathCountdown();
            mapa.isInHospital();
            mapa.PrintMap();
            
            System.out.println("");        
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Pacote referente a classe Mundo (mapa da simulação) e seus respectivos métodos.
 */
package coronaproject.WorldPkg;

import coronaproject.HealthPeoplePkg.HealthPeople;
import coronaproject.HospitalPkg.Hospital;
import coronaproject.SickPeoplePkg.SickPeople;
import java.util.ArrayList;
import java.util.Random;



/**
 *  Classe referente ao Mundo (mapa da simulação)
 * @author mathe
 */
public class World{
    
    /**
     * Valor em segundos para cada update
     */
    private final double updateRate = 0.2;
    
    /**
     * Tempo em segundos para a morte de uma pessoa doente
     */
    private final int maxTimetoDeath = 29;
    
    /**
     * Variável de tempo
     */
    private double time = 0;
    
    /**
     * Variável do número de mortos
     */
    private int deadCounter = 0;
    
    /**
     * Número de pessoas saudáveis no inicio da simulação
     */
    private final int health = 99;
    
    /**
     * ArrayList de cores dos hospitais
     */
    private ArrayList <Hospital> hospitalColorList = new ArrayList<>();
    
    /**
     * ArrayList de pessoas saudáveis
     */
    private ArrayList <HealthPeople> healthPeople = new ArrayList<>();
    
    /**
     * ArrayList de pessoas doentes
     */
    private ArrayList <SickPeople> sickPeople = new ArrayList<>();
    
    /**
     * Matriz para cópia do mapa original
     */
    private int MapCopy[][];
    
    Random rand = new Random();
    
    /**
     * Contrutor para a classe Mundo (Mapa da simulação)
     */
    public World(){
        hospitalColorList.add(new Hospital(41));
        hospitalColorList.add(new Hospital(42));
        hospitalColorList.add(new Hospital(43));
        
        this.MapCopy = new int[WorldInitialMap.length][];
        
        for(int i = 0; i <= health; i++){
            int randX = rand.nextInt(29);
            int randY = rand.nextInt(59);
            healthPeople.add(new HealthPeople(randX, randY, 0));
        }
        
        for(int i = 0; i < 1; i++){
            int randX = rand.nextInt(29);
            int randY = rand.nextInt(59);
            sickPeople.add(new SickPeople(randX, randY, 0));
        }
    }    
    
    /**
     * Valor para cor branca das "paredes" do mapa
     */
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    
    /**
     * Valo para cor preta do fundo do mapa
     */
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    
    /**
     * Valor para reset das cores
     */
    public static final String ANSI_RESET = "\u001B[0m";
    
    private final int WorldInitialMap[][] = 
    {
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 0, 0, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 0, 0, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 0, 0, 0, 0, 0, 0, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 0, 0, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 0, 0, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 4, 4, 0, 0, 4, 4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 0, 0, 0, 0, 0, 0, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 4, 4, 0, 0, 4, 4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},        
    };
    
    /**
     * Função para a contagem dos segundos para cada Objeto Pessoa doente (SickPeople) para a morte
     */
    public void DeathCountdown(){
        for(int i = 0; i < sickPeople.size(); i++){
            int deathCounter = sickPeople.get(i).getDeathCounter();
            
            if((deathCounter * updateRate) == maxTimetoDeath){
                sickPeople.remove(i);
                deadCounter += 1;
            }
            else{
                sickPeople.get(i).setDeathCounter(deathCounter + 1);
            }
        }
    }
    
    /**
     * Função que verifica se um Objeto Pessoa Doente (SickPeople) está dentro de um hospital
     */
    public void isInHospital(){
        for(int j = 2; j <= 4; j++){
            for(int i = 0; i < sickPeople.size(); i++){
                int posXSick = sickPeople.get(i).getPosX();
                int posYSick = sickPeople.get(i).getPosY();
            
                if(posXSick + 1 < 30 && posYSick + 1 < 60 && posXSick - 1 > 0 && posYSick - 1 > 0){
                    if(WorldInitialMap[posXSick + 1][posYSick] == j && WorldInitialMap[posXSick - 1][posYSick] == j ||
                       WorldInitialMap[posXSick + 1][posYSick] == j && WorldInitialMap[posXSick][posYSick + 1] == j ||
                       WorldInitialMap[posXSick + 1][posYSick] == j && WorldInitialMap[posXSick][posYSick - 1] == j ||
                       WorldInitialMap[posXSick - 1][posYSick] == j && WorldInitialMap[posXSick][posYSick + 1] == j ||
                       WorldInitialMap[posXSick - 1][posYSick] == j && WorldInitialMap[posXSick][posYSick - 1] == j){

                        sickPeople.remove(i);
                        
                        healthPeople.add(new HealthPeople(posXSick, posYSick, 0));
                    }
                }
            }        
        }
    }
    
    /**
     * Função que verifica se um Objeto Pessoa Doente (SickPeople)
     * está na mesma posição de um Objeto Pessoa Saudável (HealthPeople), caso sim, esta Pessoa Saudável é infectada
     * Apagando o objeto pessoa do ArrayList das pessoas saudáveis e adicionando um Objeto Pessoa doente ao ArrayList de 
     * pessoas doentes
     */
    public void collisionSickHealth(){
        for(int j = 0; j < sickPeople.size(); j++){
            for(int i = 0; i < healthPeople.size(); i++){
                int posXHealth = healthPeople.get(i).getPosX();
                int posYHealth = healthPeople.get(i).getPosY();
                
                int posXSick = sickPeople.get(j).getPosX();
                int posYSick = sickPeople.get(j).getPosY();
                
                if(posXHealth == posXSick && posYHealth == posYSick){
                    healthPeople.remove(i);
                    
                    sickPeople.add(new SickPeople(posXSick, posYSick, 0));
                }
            }
        }
    }
    
    /**
     * Função para o preenchemento da matriz que representa o mapa com as posições de cada Objeto
     * Pessoa Doente (SickPeople), Pessoa Saudável(HealthPeople) e executando o método de movimento
     * para cada um
     */
    public void PeoplePositioning(){
        for(int i = 0; i < healthPeople.size(); i++){
            int posX = healthPeople.get(i).getPosX();
            int posY = healthPeople.get(i).getPosY();
            
            MapCopy[posX][posY] = 5;
            
            healthPeople.get(i).Mover();  
        }
        
        for(int j = 0; j < sickPeople.size(); j++){
            int posX = sickPeople.get(j).getPosX();
            int posY = sickPeople.get(j).getPosY();
            
            MapCopy[posX][posY] = 6;
            
            sickPeople.get(j).Mover();
        }
    }
    
    /**
     * Função para realizar uma cópia da matriz original para futuro preenchimento com os objetos
     */
    public void clearMap(){
        for(int i = 0; i < WorldInitialMap.length; i++){
            MapCopy[i] = WorldInitialMap[i].clone();
        }
    }
    
    /**
     * Função para a impressão dos contadores de pessoas saudáveis, doentes, mortos e do tempo de execução da simulação
     */
    public void PrintCounters(){
        time += updateRate;
        System.out.printf("\u001B[44m" + " " + ANSI_RESET + " Saudáveis: %d ", healthPeople.size());
        System.out.printf("\u001B[45m" + " " + ANSI_RESET + " Doentes: %d ", sickPeople.size());
        System.out.printf(" Mortos: %d ", deadCounter );
        System.out.printf(" Tempo: %.0f \n", time);
    }
    
    /**
     * Função para impressão do mapa com todos os objetos dentro do mesmo
     */
    public void PrintMap(){
        PrintCounters();
        
        for (int[] WorldMap : MapCopy) {
            System.out.println("");
            for (int j = 0; j < WorldMap.length; j++) {
                switch (WorldMap[j]) {
                    case 1:
                        System.out.print(ANSI_WHITE_BACKGROUND + " " + ANSI_RESET);
                        break;
                    case 0:
                        System.out.print(ANSI_BLACK_BACKGROUND + " " + ANSI_RESET);
                        break;
                    case 2:
                        System.out.printf("\u001B[%dm" + " " + ANSI_RESET, hospitalColorList.get(0).getColor());
                        break;
                    case 3:
                        System.out.printf("\u001B[%dm" + " " + ANSI_RESET, hospitalColorList.get(1).getColor());
                        break;
                    case 4:
                        System.out.printf("\u001B[%dm" + " " + ANSI_RESET, hospitalColorList.get(2).getColor());
                        break;
                    case 5:
                        System.out.printf("\u001B[44m" + " " + ANSI_RESET);
                        break;
                    case 6:
                        System.out.printf("\u001B[45m" + " " + ANSI_RESET);
                        break;
                    default:
                        break;
                }                
            }
        }
    }
}

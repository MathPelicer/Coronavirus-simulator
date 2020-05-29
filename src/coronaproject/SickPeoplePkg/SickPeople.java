/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Pacote para arquivo da classe de pessoas Doentes (SickPeople)
 */
package coronaproject.SickPeoplePkg;

import coronaproject.PeoplePkg.People;
import coronaproject.VirusPkg.Virus;
import java.util.Random;

/**
 *  Classe referente às pessoas doentes
 * @author mathe
 */
public class SickPeople extends People{
    
    /**
     * Variável referente ao valor da velocidade de movimento da pessoa Saudável no eixo X
     */
    protected int speedX = 1;
    
    /**
     * Variável referente ao valor da velocidade de movimento da pessoa Saudável no eixo Y
     */
    protected int speedY = 1;
    
    /**
     * Contador de tempo para a morte da pessoa doente
     */
    protected int deathCounter = 0;

    Virus v;

    /**
     * Construtor referente a Classe SickPeople (Pessoa doente)
     * @param posX  Valor referente a posição no eixo X no mapa (0 - 29)
     * @param posY  Valor referente a posição no eixo Y no mapa (0 - 59)
     * @param color Valor referente a cor do Objeto
     */
    public SickPeople(int posX, int posY, int color) {
        super(posX, posY, color);
        this.v = new Virus();
        v.setInfected(true);
    }

    int posX = getPosX();
    int posY = getPosY();
    int color = getColor();
    
    Random rand = new Random();
        
    /**
     * Método para realização de movimentos aleatórios do Objeto
     */
    @Override
    public void Mover(){
        int randInt = rand.nextInt(4);
        
        switch (randInt) {
            case 0:
                MoveUp();
                break;
            case 1:
                MoveDown();
                break;
            case 2:
                MoveLeft();
                break;
            case 3:
                MoveRight();
                break;
            default:
                break;
        }    
    }
    
    /**
     * Método para movimento para cima
     */
    private void MoveUp(){
        if(getPosY() - speedY == -1){
            setPosY(59);
        }
        else{
            setPosY(getPosY() - 1);
        }
    }
    
    /**
     * Método para movimento para baixo
     */
    private void MoveDown(){
        if(getPosY() + speedY == 60){
            setPosY(0);
        }
        else{
            setPosY(getPosY() + 1);
        }
    }
    
    /**
     * Método para movimento para a esquerda
     */
    private void MoveLeft(){
        if(getPosX() - speedX == -1){
            setPosX(30);
        }
        else{
            setPosX(getPosX() - 1);
        }
    }
    
    /**
     * Método para movimento para a direita
     */
    private void MoveRight(){
        if(getPosX() + speedX == 31){
            setPosX(0);
        }
        else{
            setPosX(getPosX() + 1);                                                                                                                                                                                                                                                                                                                                                                                                             
        }
    }
    
    /**
     * Método para obtenção do valor do contador de tempo para morte da pessoa doente
     * @return   Valor int de tempo que a pessoa está doente
     */
    public int getDeathCounter() {
        return deathCounter;
    }

    /**
     * Método para determinação do valor do contador de tempo para a morte da pessoa doente
     * @param deathCounter Valor de tempo percorrido da pessoa com a doença
     */
    public void setDeathCounter(int deathCounter) {
        this.deathCounter = deathCounter;
    }
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Pacote para arquivo da classe de pessoas saudáveis
 */
package coronaproject.HealthPeoplePkg;

import coronaproject.PeoplePkg.People;
import java.util.Random;

/**
 *  Classe referente às pessoas saudáveis
 * @author mathe
 */
public class HealthPeople extends People{
    
    /**
     * Variável referente ao valor da velocidade de movimento da pessoa Saudável no eixo X
     */
    protected int speedX = 1;
    
    /**
     * Variável referente ao valor da velocidade de movimento da pessoa Saudável no eixo X
     */
    protected int speedY = 1;
    
    /**
     * Construtor referente a Pessoas Saudáveis (HealthPeople)
     * @param posX  Variavél de posição no eixo X (0 - 29)
     * @param posY  Variavél de posição no eixo Y (0 - 59)
     * @param color Variável referente a cor
     */
    public HealthPeople(int posX, int posY, int color) {
        super(posX, posY, color);  
        this.color = 5;
    }
    
    int posX = getPosX();
    int posY = getPosY();
    int color = getColor();
    
    Random rand = new Random();
        
    /**
     * Método para realização de movimentos aleatórios do Objeto no mapa
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
     * Método para movimento para direita
     */
    private void MoveRight(){
        if(getPosX() + speedX == 31){
            setPosX(0);
        }
        else{
            setPosX(getPosX() + 1);                                                                                                                                                                                                                                                                                                                                                                                                             
        }
    }
    
}

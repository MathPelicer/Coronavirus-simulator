/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Pacote para arquivo da classe People (Pessoa)
 */
package coronaproject.PeoplePkg;

/**
 *  Classe abstrata referente à pessoas
 * @author mathe
 */
public abstract class People {
    private int posX;
    private int posY;
    private int color;

    /**
     * Construtor referente a classe Abstrata People (pessoa)
     * @param posX  Valor referente a posição no eixo X no mapa
     * @param posY  Valor referente a posição no eixo Y no mapa
     * @param color Valor referente a cor do Objeto
     */
    public People(int posX, int posY, int color) {
        this.posX = posX;
        this.posY = posY;
        this.color = color;
    }

    /**
     * Método para obtenção da posição no eixo X do Objeto
     * @return Valor int para a posição no eixo X
     */
    public int getPosX() {
        return posX;
    }

    /**
     * Método para determinação do valor da posição do Objeto no eixo X
     * @param posX Valor int para posição do Objeto no mapa
     */
    public void setPosX(int posX) {
        this.posX = posX;
    }

    /**
     * Método para obtenção da posição no eixo X do Objeto
     * @return Valor int para a posição no eixo Y
     */
    public int getPosY() {
        return posY;
    }

    /**
     * Método para determinação do valor da posição do Objeto no eixo X
     * @param posY Valor int para posição do Objeto no mapa
     */
    public void setPosY(int posY) {
        this.posY = posY;
    }

    /**
     * Método para obtenção do valor da cor do Objeto
     * @return Valor int da cor do Objeto
     */
    public int getColor() {
        return color;
    }

    /**
     * Método para determinação do valor da cor do Objeto
     * @param color Valor int para a cor do Objeto
     */
    public void setColor(int color) {
        this.color = color;
    }
    
    /**
     * Método abstrato para a Movimentação do Objeto
     */
    public abstract void Mover();      
}

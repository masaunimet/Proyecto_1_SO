/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 * Puede identificar a un Worker de forma inequivoca con su rol de trabajo
 * @author Masa500
 */
public enum WorkerTypeEnum {
    /**El que realiza los guiones*/
    Narrative(0),
    /**El que realiza los niveles*/
    Level(1),
    /**El que realiza los sprites*/
    Sprite(2),
    /**El que realiza los sistemas de juego*/
    Sistem(3),
    /**El que realiza los DLCs*/
    DLC(4),
    /**El que agarra todos los elemntos y genera un juego*/
    Integrator(5),
    /**Es el que registra el paso de los días*/
    Manager(6),
    /**Vende los juegos y revisa la DEADLINE*/
    Director(7);
	
    private final int id;

    /**
     * Constructor oculto para no crear sino solo ver tipos de trabajos
     * @param id int - identificador unico del tipo de trabajo
     */
    private WorkerTypeEnum(int id) {
	this.id = id;
    }

    //Getter
    public int getId() {
	return id;
    }
}

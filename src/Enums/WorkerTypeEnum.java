/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author Masa500
 */
public enum WorkerTypeEnum {
    
    Narrative(0),
    Level(1),
    Sprite(2),
    Sistem(3),
    DLC(4),
    Integracion(5),
    Manager(6),
    Director(7);
	
    private final int id;
	
    private WorkerTypeEnum(int id) {
	this.id = id;
    }

    public int getId() {
	return id;
    }
}

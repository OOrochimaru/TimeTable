/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generator.timetable;


public class Room {
    private String name;
    private int roomId;
    
    public Room(int id,String name){
        this.roomId = id;
        this.name = name;
    }

	public String getName() {
		return name;
	}

	public int getId() {
		return roomId;
	}
    
}

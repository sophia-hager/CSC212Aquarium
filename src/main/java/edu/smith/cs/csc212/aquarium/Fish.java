package edu.smith.cs.csc212.aquarium;

import java.awt.Color;

public class Fish {
	int x;
	int y;
	Color color;
	boolean FacingLeft;
	boolean isLittle;
	
	public Fish(int x, int y, Color color, boolean FacingLeft, boolean isLittle) {
	this.x = x;
	this.y = y;
	this.color = color;
	this.FacingLeft = FacingLeft;
	this.isLittle = isLittle;
	}
}

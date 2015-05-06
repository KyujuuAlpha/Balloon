package com.troi.balloon.panelsystem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;

public class Button {
	
	private boolean requestedRepaint = false;
	private Dimension bounds;
	
	public Button() {
		bounds = new Dimension(100, 50);
	}

	public void paint(Graphics2D render) {
		render.setColor(Color.WHITE);
		render.fillRect(0, 0, (int)bounds.getWidth(), (int)bounds.getHeight());
	}
	
	public void update() {
		
	}
	
	public void requestRepaint() {
		requestedRepaint = true;
	}
	
	public boolean needsRepaint() {
		return requestedRepaint;
	}
	
	public Dimension getDimension() {
		return bounds;
	}
}
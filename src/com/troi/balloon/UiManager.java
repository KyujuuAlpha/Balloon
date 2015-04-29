package com.troi.balloon;

import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JFrame;

import DragAndDrop.DragAndDrop;
import util.panelDimension;


public class UiManager{
	public final panelDimension mainDimension, sideDimension, toolDimension;
	JFrame frame;
	Graphics2D paint;
	TextEditer textEditor;
	DragAndDrop guiEditor;
	GraphicsComponent gComponent;
	boolean textInUse;
	
	public UiManager(JFrame frame)
	{
		sideDimension = new panelDimension(0,0,(frame.getWidth() / 5),frame.getHeight());
		toolDimension = new panelDimension(sideDimension.getWidth(),0,(frame.getWidth() / 5),frame.getHeight());
		mainDimension = new panelDimension((sideDimension.getWidth() * 2),1000,(frame.getWidth() - (sideDimension.getWidth() * 2)), frame.getHeight());
		gComponent = new GraphicsComponent(); 
		textEditor = new TextEditer();
		guiEditor = new DragAndDrop(frame,this);
		frame.setContentPane(gComponent);
		Panel panel = new Panel(mainDimension);
		gComponent.newPanel(panel);
	}
	public void resetEnviroment()
	{
		
	}
	
	public void setCurrentEnviroment(Object panel)
	{
		if (panel instanceof TextEditer)
		{
			textInUse = true;
		}
		else if (panel instanceof DragAndDrop)
		{
			textInUse = false;
		}
	}

}

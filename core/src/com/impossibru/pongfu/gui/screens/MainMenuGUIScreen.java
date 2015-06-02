package com.impossibru.pongfu.gui.screens;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.impossibru.pongfu.gui.GUI;

import shared.gui.MyGUIScreen;

/**
 * Created by Faust on 02.06.2015.
 *
 */
public class MainMenuGUIScreen extends MyGUIScreen
{
	@Override
	public void setScreen()
	{
		GUI.instance().getStack().clear();

		GUI.instance().getStack().setDebug(true, true);

		final Table root = new Table();
		root.setFillParent(true);
		GUI.instance().getStack().add(root);

		final Label label = new Label("Test", GUI.instance().getSkin(), "72", Color.MAROON);
		root.add(label).center();
	}
}

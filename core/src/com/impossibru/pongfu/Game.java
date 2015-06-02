package com.impossibru.pongfu;

import com.impossibru.pongfu.gui.GUI;
import com.impossibru.pongfu.screens.MainMenuScreen;

import shared.MyGame;

public class Game extends MyGame
{
	/*
		Settings
	 */

	@Override
	protected void setGameWidth()
	{
		gameWidth = 1080;
	}

	@Override
	public void create()
	{
		super.create();

		// Init different things

		new GUI();

		// Go

		setScreen(new MainMenuScreen());
	}
}

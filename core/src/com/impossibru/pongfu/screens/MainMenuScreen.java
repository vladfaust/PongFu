package com.impossibru.pongfu.screens;

import com.impossibru.pongfu.gui.GUI;
import com.impossibru.pongfu.gui.screens.MainMenuGUIScreen;

import shared.screens.MyCommonScreen;

/**
 * Created by Faust on 02.06.2015.
 *
 */
public class MainMenuScreen extends MyCommonScreen
{
	@Override
	public void show()
	{
		GUI.setScreen(new MainMenuGUIScreen());
	}

	@Override
	public void hide()
	{

	}

	@Override
	public void onBackButtonPressed()
	{

	}
}

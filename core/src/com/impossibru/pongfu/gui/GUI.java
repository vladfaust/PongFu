package com.impossibru.pongfu.gui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

import shared.gui.MyGUI;

/**
 * Created by Faust on 02.06.2015.
 *
 */
public class GUI extends MyGUI
{
	@Override
	public void initFonts()
	{
		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("fonts/bebas-regular.otf"));
		FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();

		parameter.borderWidth = 0.5f;
		parameter.borderColor = Color.CLEAR;
		parameter.characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

		parameter.size = 72;
		BitmapFont font72 = generator.generateFont(parameter);
		getSkin().add("72", font72);
	}
}

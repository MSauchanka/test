package com.gdx.tstgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;


public class TstGdxGame extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture grassTexture;
	private Texture chickenTexture;
	private Stage stage;
	private Viewport viewport;
		
	public void create () {
		viewport = new StretchViewport(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		batch = new SpriteBatch();
		stage = new Stage(viewport, batch);
		grassTexture = new Texture("data/grass_32_32.png");
		chickenTexture = new Texture("data/Chicken_180_160.png");
		Gdx.input.setInputProcessor(stage);
		
		ActorGrass grassActor = new ActorGrass(grassTexture);
		ActorChicken chickenActor = new ActorChicken(chickenTexture);
		grassActor.initGrass(stage);
		chickenActor.initChicken(stage);
				
	}

	public void resize (int width, int height) {
	    // See below for what true means.
	    stage.getViewport().update(width, height, true);
	}

	public void render () {
		//Read about method below
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	    stage.act(Gdx.graphics.getDeltaTime());
	    stage.draw();
	}

	public void dispose() {
	    stage.dispose();
	}
		
}
		

package com.gdx.tstgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class ActorChicken extends Actor {
	private TextureRegion chickenRegion;
	private final int CHICKEN_TEXTURE_WIDTH = 32;
	private final int CHICKEN_TEXTURE_HEIGHT = 32;
	
	public ActorChicken(Texture texture) {
		chickenRegion = new TextureRegion(texture, 0, 0, 180, 160);
	}
	
	private ActorChicken(TextureRegion textureRegion) {
		this.chickenRegion = textureRegion;
	}

	@Override
	public void draw(Batch batch, float parentAlpha) {
		batch.draw(chickenRegion, getX(), getY(), getWidth(), getHeight());
	}
	
	public void initChicken(Stage stage) {
		ActorChicken chicken = new ActorChicken(chickenRegion);
		chicken.setSize(CHICKEN_TEXTURE_WIDTH, CHICKEN_TEXTURE_HEIGHT);
		chicken.setPosition(16, 16);
		stage.addActor(chicken);
	}
}

package com.gdx.tstgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;


public class ActorGrass extends Actor {
	private TextureRegion grassRegion;
	private Group grassGroup;
	private final int GRASS_TEXTURE_WIDTH = 16;
	private final int GRASS_TEXTURE_HEIGHT = 16;
	
	public ActorGrass(Texture texture) {
		grassRegion = new TextureRegion(texture, 0, 0, 32, 32);
	}
	
	private ActorGrass(TextureRegion textureRegion) {
		this.grassRegion = textureRegion;
	}
		
	@Override
	public void draw(Batch batch, float parentAlpha) {
		batch.draw(grassRegion, getX(), getY(), getWidth(), getHeight());
	}
	
	public void initGrass(Stage stage) {
		setGrassGroup(stage);
		for (int i = 0; i < stage.getWidth(); i+=GRASS_TEXTURE_WIDTH) {
			ActorGrass grass = new ActorGrass(grassRegion);
			grass.setSize(GRASS_TEXTURE_WIDTH, GRASS_TEXTURE_HEIGHT);
			grass.setPosition(i, 0);
			grassGroup.addActor(grass);
		}
		stage.addActor(grassGroup);
	}

	private void setGrassGroup(Stage stage) {
		grassGroup = new Group();
		grassGroup.setSize(stage.getWidth(), stage.getHeight());
	}
	
	
	

}

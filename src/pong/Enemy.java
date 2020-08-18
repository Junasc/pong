package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Enemy {
	
	public double x , y ; //DOUBLE PARA QUE A VELOCIDADE DO INIMIGO ALTERNE. 
	public int width , height ;
	
	public Enemy (int x, int y) {
		this.x = x;
		this.y = y ;
		this.width = 40;
		this.height = 5;
	}
	
	
	public void tick() {
		
		//FAZ O INIMIGO ACOMPANHAR A BOLA.
		x += (Game.ball.x - x - 6) * 0.09 ;
	}
	
	
	
	public void render(Graphics g ) {
		
		g.setColor(Color.white);
		g.fillRect((int) x ,(int) y , width , height);
		
	}


}

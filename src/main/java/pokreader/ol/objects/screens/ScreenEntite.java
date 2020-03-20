package pokreader.ol.objects.screens;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pokreader.ol.utils.Utils;


@Data
@NoArgsConstructor
public class ScreenEntite {
	
	
	private Point pointOrigine;
	private Rectangle rectangle;
	
	
	public ScreenEntite(Point pointOrigine, Rectangle rectangle) {
		super();
		this.pointOrigine = pointOrigine;
		this.rectangle = rectangle;
	}
	
	
	public BufferedImage getBufferedImage() throws AWTException, IOException {
		return Utils.getBufferedImage(this.rectangle);
	}


	public ScreenEntite(Point pointHautGauche, Point pointBasDroite) {
		this.pointOrigine = pointHautGauche;
		this.rectangle = new Rectangle(this.pointOrigine.x, this.pointOrigine.y,
				pointBasDroite.x - pointHautGauche.x, pointBasDroite.y - pointHautGauche.y);
		
	}
}

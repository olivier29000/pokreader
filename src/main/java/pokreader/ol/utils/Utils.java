package pokreader.ol.utils;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import pokreader.ol.objects.autre.Couleur;
import pokreader.ol.objects.screens.ScreenEntite;

public abstract class Utils {
	
	static int n = 0;
	static String url = "C:\\Users\\lasbleiso\\Travail\\DIGINAMIC\\POKER\\ScreenShot\\ok\\enAction\\";
	
	public static Couleur getColor(Point point) throws AWTException {
				
		Rectangle rectangle = new Rectangle(point.x,point.y,2,2);
		Robot robot = new Robot();
		BufferedImage screenShot = robot.createScreenCapture(rectangle);
		Color mycolor = new Color(screenShot.getRGB(1, 1));
		if (mycolor.getRed() > 200 && mycolor.getBlue() > 200 && mycolor.getGreen() > 200) {
			return Couleur.BLANC;
		}else if (mycolor.getRed() > 200 && mycolor.getBlue() < 100 && mycolor.getGreen() < 100) {
			return Couleur.ROUGE;
		}else if (mycolor.getRed() > 200 && mycolor.getBlue() < 100 && mycolor.getGreen() > 200) {
			return Couleur.JAUNE;
		}else {
			return Couleur.INDETERMINE;
		}
	}
	
	public static String getStringEntite(ScreenEntite entite) throws TesseractException, AWTException, IOException {
		
		final Tesseract tesseract = new Tesseract();
        BufferedImage screenShot = entite.getBufferedImage();
        //File outputfile = new File(url + "image.jpg");
        //ImageIO.write(screenShot, "jpg", outputfile);
        tesseract.setTessVariable("tessedit_char_whitelist",
				"/.abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789,€:");
		String result = tesseract.doOCR(screenShot);
		return result.trim();
		
	}
	
	public static Couleur getColorCenterEntite(ScreenEntite entite) throws AWTException {
		Point point = new Point(entite.getPointOrigine().x + entite.getRectangle().width/2,
				entite.getPointOrigine().y + entite.getRectangle().height/2);
				
		return getColor(point) ;
		
	}

	public static double getDoubleEntite(ScreenEntite screenDouble) throws TesseractException, AWTException, IOException {
		final Tesseract tesseract = new Tesseract();
        BufferedImage screenShot = screenDouble.getBufferedImage();
        //File outputfile = new File(url + "image.jpg");
        //ImageIO.write(screenShot, "jpg", outputfile);
        tesseract.setTessVariable("tessedit_char_whitelist",
				"/.abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789,€:");
		String result = tesseract.doOCR(screenShot);
		return Double.parseDouble(result.trim());
	}

	public static BufferedImage getBufferedImage(Rectangle rectangle) throws AWTException, IOException {
		
		
		Robot robot = new Robot();
        BufferedImage screenShot = robot.createScreenCapture(rectangle);
        File outputfile = new File(url + n++ + ".jpg");
        ImageIO.write(screenShot, "jpg", outputfile);
		return screenShot;
	}

}

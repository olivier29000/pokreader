package pokreader.ol;

import java.awt.AWTException;
import java.awt.Point;
import java.io.IOException;

import pokreader.ol.manager.ConfigScreenController;
import pokreader.ol.objects.screens.ScreenCarte;
import pokreader.ol.objects.screens.ScreenJoueur;
import pokreader.ol.objects.screens.ScreenPartie;
import pokreader.ol.utils.Utils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws AWTException, IOException
    {
        Point[] lesDeuxPointsDeDepart = ConfigScreenController.configScreenController();
        
        ScreenPartie screenPartie = new ScreenPartie(lesDeuxPointsDeDepart[0],lesDeuxPointsDeDepart[1]);
        
        screenPartie.getBufferedImage();
        
        for (ScreenCarte screenCarte : screenPartie.getListeDeScreenCartes()) {
        	screenCarte.getBufferedImage();
		}
        
        for (ScreenJoueur screenJoueur : screenPartie.getListeDeScreenJoueur()) {
        	screenJoueur.getBufferedImage();
        	screenJoueur.getScreenAction().getBufferedImage();
        	screenJoueur.getScreenName().getBufferedImage();
        	screenJoueur.getScreenStack().getBufferedImage();
		}
    }
}

package pokreader.ol.objects.screens;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.var;
import net.sourceforge.tess4j.TesseractException;
import pokreader.ol.objects.autre.PositionJoueur;
import pokreader.ol.objects.game.Joueur;
import pokreader.ol.utils.Utils;
import pokreader.ol.utils.VariablesGlobales;


@Data

@NoArgsConstructor
public class ScreenJoueur extends ScreenEntite {

	private ScreenEntite screenName ;
	private ScreenEntite screenStack ;
	private ScreenEntite screenAction ;
	private Point pointPresenceCarte;
	private Point pointPresenceBouton;
	private List<ScreenCarte> cartesJoueur;
	
	
	
	public ScreenJoueur(ScreenEntite screenEntite, String sensDuJoueur) {
		
		super(screenEntite.getPointOrigine(),screenEntite.getRectangle());
		
		int xNomJoueur=0;
		int yNomJoueur=0;
		int xStackJoueur=0;
		int yStackJoueur=0;
		int xActionJoueur=0;
		int yActionJoueur=0;
		int xPresenceJoueur=0;
		int yPresenceJoueur=0;
		
		if (sensDuJoueur.equals("sens droite")) {
			xNomJoueur = VariablesGlobales.xNomJoueurSensDroite;
			yNomJoueur = VariablesGlobales.yNomJoueurSensDroite;
			xStackJoueur = VariablesGlobales.xNomJoueurSensDroite;
			yStackJoueur = VariablesGlobales.yNomJoueurSensDroite;
			xActionJoueur = VariablesGlobales.xActionJoueurSensGauche;
			yActionJoueur = VariablesGlobales.yActionJoueurSensGauche;
			xPresenceJoueur = VariablesGlobales.xPresenceJoueurSensDroite;
			yPresenceJoueur = VariablesGlobales.yPresenceJoueurSensDroite;
		}else if (sensDuJoueur.equals("sens gauche")) {
			xNomJoueur = VariablesGlobales.xNomJoueurSensGauche;
			yNomJoueur = VariablesGlobales.yNomJoueurSensGauche;
			xStackJoueur = VariablesGlobales.xStackJoueurSensGauche;
			yStackJoueur = VariablesGlobales.yStackJoueurSensGauche;
			xActionJoueur = VariablesGlobales.xActionJoueurSensGauche;
			yActionJoueur = VariablesGlobales.yActionJoueurSensGauche;
			xPresenceJoueur = VariablesGlobales.xPresenceJoueurSensGauche;
			yPresenceJoueur = VariablesGlobales.yPresenceJoueurSensGauche;
			
		}
		
		
		Point pointOrigine = new Point(screenEntite.getPointOrigine().x + xNomJoueur,
				screenEntite.getPointOrigine().y + yNomJoueur);
		Rectangle rectangle = new Rectangle(pointOrigine.x, pointOrigine.y,
				VariablesGlobales.widthNomJoueur,
				VariablesGlobales.heightNomJoueur);
		
		this.screenName = new ScreenEntite(
				pointOrigine,
				rectangle
				);
		
		pointOrigine = new Point(screenEntite.getPointOrigine().x + xStackJoueur,
				screenEntite.getPointOrigine().y + yStackJoueur);
		rectangle = new Rectangle(pointOrigine.x, pointOrigine.y,
				VariablesGlobales.widthStackJoueur,
				VariablesGlobales.heightStackJoueur);
		
		this.screenStack = new ScreenEntite(
				pointOrigine,
				rectangle
				);
		
		pointOrigine = new Point(screenEntite.getPointOrigine().x + xActionJoueur,
				screenEntite.getPointOrigine().y + yActionJoueur);
		rectangle = new Rectangle(pointOrigine.x, pointOrigine.y,
				VariablesGlobales.widthActionJoueur,
				VariablesGlobales.heightActionJoueur);
		
		this.screenAction = new ScreenEntite(
				pointOrigine,
				rectangle
				);
		
		this.pointPresenceCarte = new Point(screenEntite.getPointOrigine().x + xPresenceJoueur,
				screenEntite.getPointOrigine().y + yPresenceJoueur);
		
		
		
	}
	
	public Joueur instancierJoueur() throws TesseractException, AWTException, IOException {
		
		String nomJoueur = Utils.getStringEntite(this.screenName);
		double stackJoueur = Utils.getDoubleEntite(this.screenName);
		return new Joueur(nomJoueur , stackJoueur);
		
	}
	
}

package pokreader.ol.utils;

import java.awt.Point;
import java.awt.Rectangle;

import pokreader.ol.objects.screens.ScreenEntite;
import pokreader.ol.objects.screens.ScreenJoueur;

public class VariablesJoueurs {
	
	public static  ScreenJoueur screenJoueur0 ;
	public static ScreenJoueur screenJoueur1 ;
	public static  ScreenJoueur screenJoueur2 ;
	public static  ScreenJoueur screenJoueur3 ;
	public static  ScreenJoueur screenJoueur4 ;
	public static  ScreenJoueur screenJoueur5 ;

	public static  Point pointPresenceJoueur0 ;
	public static  Point pointPresenceJoueur1 ;
	public static  Point pointPresenceJoueur2 ;
	public static  Point pointPresenceJoueur3 ;
	public static  Point pointPresenceJoueur4 ;
	public static  Point pointPresenceJoueur5 ;
	
	
	public VariablesJoueurs() {
		

	this.screenJoueur0 = new ScreenJoueur(
			new ScreenEntite(
					new Point(VariablesGlobales.xJoueur0,
							VariablesGlobales.yJoueur0),
					new Rectangle(VariablesGlobales.xJoueur0,
							VariablesGlobales.yJoueur0,
							VariablesGlobales.widthJoueur,
							VariablesGlobales.heightJoueur
							)),"sens droite");
	pointPresenceJoueur0 = this.screenJoueur0.getPointPresenceCarte();
	
	this.screenJoueur1 = new ScreenJoueur(
			new ScreenEntite(
					new Point(VariablesGlobales.xJoueur1,
							VariablesGlobales.yJoueur1),
					new Rectangle(VariablesGlobales.xJoueur1,
							VariablesGlobales.yJoueur1,
							VariablesGlobales.widthJoueur,
							VariablesGlobales.heightJoueur
							)),"sens droite");
	pointPresenceJoueur1 = this.screenJoueur1.getPointPresenceCarte();
	
	this.screenJoueur2 = new ScreenJoueur(
			new ScreenEntite(
					new Point(VariablesGlobales.xJoueur2,
							VariablesGlobales.yJoueur2),
					new Rectangle(VariablesGlobales.xJoueur2,
							VariablesGlobales.yJoueur2,
							VariablesGlobales.widthJoueur,
							VariablesGlobales.heightJoueur
							)),"sens gauche");
	pointPresenceJoueur2 = this.screenJoueur2.getPointPresenceCarte();
	
	this.screenJoueur3 = new ScreenJoueur(
			new ScreenEntite(
					new Point(VariablesGlobales.xJoueur3,
							VariablesGlobales.yJoueur3),
					new Rectangle(VariablesGlobales.xJoueur3,
							VariablesGlobales.yJoueur3,
							VariablesGlobales.widthJoueur,
							VariablesGlobales.heightJoueur
							)),"sens gauche");
	pointPresenceJoueur3 = this.screenJoueur3.getPointPresenceCarte();
	
	this.screenJoueur4 = new ScreenJoueur(
			new ScreenEntite(
					new Point(VariablesGlobales.xJoueur4,
							VariablesGlobales.yJoueur4),
					new Rectangle(VariablesGlobales.xJoueur4,
							VariablesGlobales.yJoueur4,
							VariablesGlobales.widthJoueur,
							VariablesGlobales.heightJoueur
							)),"sens gauche");
	pointPresenceJoueur4 = this.screenJoueur4.getPointPresenceCarte();
	
	this.screenJoueur5 = new ScreenJoueur(
			new ScreenEntite(
					new Point(VariablesGlobales.xJoueur5,
							VariablesGlobales.yJoueur5),
					new Rectangle(VariablesGlobales.xJoueur5,
							VariablesGlobales.yJoueur5,
							VariablesGlobales.widthJoueur,
							VariablesGlobales.heightJoueur
							)),"sens gauche");
	pointPresenceJoueur5 = this.screenJoueur5.getPointPresenceCarte();
	}
}

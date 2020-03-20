package pokreader.ol.utils;

import java.awt.Point;

public class VariablesGlobales {


	public static int xJoueur0 = 69;
	public static int yJoueur0 = 572;
	public static int xPresenceBoutonJoueur0 = 332;
	public static int yPresenceBoutonJoueur0 = 560;
	
	public static int xJoueur1 = 69;
	public static int yJoueur1 = 225;
	public static int xPresenceBoutonJoueur1 = 309;
	public static int yPresenceBoutonJoueur1 = 329;
	
	public static int xJoueur2 = 524;
	public static int yJoueur2 = 125;
	public static int xPresenceBoutonJoueur2 = 488;
	public static int yPresenceBoutonJoueur2 = 243;
	
	public static int xJoueur3 = 969;
	public static int yJoueur3 = 225;
	public static int xPresenceBoutonJoueur3 = 952;
	public static int yPresenceBoutonJoueur3 = 329;
	
	public static int xJoueur4 = 969;
	public static int yJoueur4 = 565;
	public static int xPresenceBoutonJoueur4 = 926;
	public static int yPresenceBoutonJoueur4 = 557;
	
	public static int xJoueur5 = 524;
	public static int yJoueur5 = 670;
	public static int xPresenceBoutonJoueur5 = 557;
	public static int yPresenceBoutonJoueur5 = 631;
	

	public static int widthCarte = 80;
	public static int heightCarte = 105;
	
	public static int xCarte1JoueurSensDroite = 18;
	public static int xCarte1JoueurSensGauche = 112;
	public static int yCarte1Joueur = - heightCarte;
	public static int xCarte2JoueurSensDroite = xCarte1JoueurSensDroite + widthCarte + 2;
	public static int xCarte2JoueurSensGauche = xCarte1JoueurSensGauche + widthCarte + 2;
	public static int yCarte2Joueur = heightCarte;
	public static int widthJoueur = 250;
	public static int heightJoueur = 90;
	
	
	public static int widthNomJoueur = 160;
	public static int heightNomJoueur = 45;
	public static int widthActionJoueur = 95;
	public static int heightActionJoueur = 95;
	
	public static int xNomJoueurSensDroite = 0;
	public static int yNomJoueurSensDroite = 0;
	public static int xNomJoueurSensGauche = widthActionJoueur + 3;
	public static int yNomJoueurSensGauche = 0;
	
	
	public static int xStackJoueurSensDroite = 0;
	public static int yStackJoueurSensDroite = heightJoueur/2;
	public static int xStackJoueurSensGauche = widthActionJoueur + 3;
	public static int yStackJoueurSensGauche = yStackJoueurSensDroite;
	public static int widthStackJoueur = widthNomJoueur;
	public static int heightStackJoueur = heightNomJoueur;
	
	public static int xActionJoueurSensDroite = widthNomJoueur + 3;
	public static int yActionJoueurSensDroite = 0;
	public static int xActionJoueurSensGauche = 0;
	public static int yActionJoueurSensGauche = 0;
	
	
	public static int xPresenceJoueurSensDroite = xCarte1JoueurSensDroite + widthCarte/2;
	public static int yPresenceJoueurSensDroite = 30;
	public static int xPresenceJoueurSensGauche =  xCarte1JoueurSensGauche + widthCarte/2;
	public static int yPresenceJoueurSensGauche = yPresenceJoueurSensDroite;
	
	public static int xCarteFlop0 = 413;
	public static int yCarteFlop0 = 326;
	public static int xCarteFlop1 = xCarteFlop0 + widthCarte + 12;
	public static int yCarteFlop1 = yCarteFlop0;
	public static int xCarteFlop2 = xCarteFlop1 + widthCarte + 12;
	public static int yCarteFlop2 = yCarteFlop1;
	public static int xCarteFlop3 = xCarteFlop2 + widthCarte + 12;
	public static int yCarteFlop3  = yCarteFlop2;
	public static int xCarteFlop4 = xCarteFlop3 + widthCarte + 12;
	public static int yCarteFlop4  = yCarteFlop3;
	
	
	
	
	public VariablesGlobales(double proportion, Point pointOrigine) {

		int xpointOrigine = pointOrigine.x;
		int ypointOrigine = pointOrigine.y;
		
		this.xJoueur0 =  (int) (xJoueur0 * proportion) + xpointOrigine;
		this.yJoueur0 =  (int) (yJoueur0 * proportion) + ypointOrigine;
		this.xPresenceBoutonJoueur0 =  (int) (xPresenceBoutonJoueur0 * proportion) + xpointOrigine;
		this.yPresenceBoutonJoueur0 = (int) (yPresenceBoutonJoueur0 * proportion) + ypointOrigine;
		
		this.xJoueur1 = (int) (xJoueur1 * proportion)  + xpointOrigine;
		this.yJoueur1 =  (int) (yJoueur1 * proportion) + ypointOrigine;
		this.xPresenceBoutonJoueur1 =  (int) (xPresenceBoutonJoueur1 * proportion)  + xpointOrigine;
		this.yPresenceBoutonJoueur1 =  (int) (yPresenceBoutonJoueur1 * proportion) + ypointOrigine;
		
		this.xJoueur2 =  (int) (xJoueur2 * proportion)  + xpointOrigine;
		this.yJoueur2 =  (int) (yJoueur2 * proportion) + ypointOrigine;
		this.xPresenceBoutonJoueur2 =  (int) (xPresenceBoutonJoueur2 * proportion) + xpointOrigine;
		this.yPresenceBoutonJoueur2 =  (int) (yPresenceBoutonJoueur2 * proportion) + ypointOrigine;
		
		this.xJoueur3 =  (int) (xJoueur3 * proportion) + xpointOrigine;
		this.yJoueur3 =  (int) (yJoueur3 * proportion) + ypointOrigine;
		this.xPresenceBoutonJoueur3 =  (int) (xPresenceBoutonJoueur3 * proportion) + xpointOrigine;
		this.yPresenceBoutonJoueur3 =  (int) (yPresenceBoutonJoueur3 * proportion) + ypointOrigine;
		
		this.xJoueur4 =  (int) (xJoueur4 * proportion) + xpointOrigine;
		this.yJoueur4 =  (int) (yJoueur4 * proportion) + ypointOrigine;
		this.xPresenceBoutonJoueur4 =  (int) (xPresenceBoutonJoueur4 * proportion) + xpointOrigine;
		this.yPresenceBoutonJoueur4 =  (int) (yPresenceBoutonJoueur4 * proportion) + ypointOrigine;
		
		this.xJoueur5 =  (int) (xJoueur5 * proportion) + xpointOrigine;
		this.yJoueur5 =  (int) (yJoueur5 * proportion) + ypointOrigine;
		this.xPresenceBoutonJoueur5 = (int) (xPresenceBoutonJoueur5 * proportion) + xpointOrigine;
		this.yPresenceBoutonJoueur5 =  (int) (yPresenceBoutonJoueur5 * proportion) + ypointOrigine;
		

		this.widthCarte =  (int) (widthCarte * proportion);
		this.heightCarte =  (int) (heightCarte * proportion);
		
		this.xCarte1JoueurSensDroite =  (int) (xCarte1JoueurSensDroite * proportion) + xpointOrigine;
		this.xCarte1JoueurSensGauche =  (int) (xCarte1JoueurSensGauche * proportion) + xpointOrigine;
		this.yCarte1Joueur =  (int) (yCarte1Joueur * proportion) + ypointOrigine;
		this.xCarte2JoueurSensDroite =  (int) (xCarte2JoueurSensDroite * proportion) + xpointOrigine;
		this.xCarte2JoueurSensGauche =  (int) (xCarte2JoueurSensGauche * proportion) + xpointOrigine;
		this.yCarte2Joueur =  (int) (yCarte2Joueur * proportion) + ypointOrigine;
		this.widthJoueur =  (int) (widthJoueur * proportion);
		this.heightJoueur =  (int) (heightJoueur * proportion);
		
		
		this.widthNomJoueur =  (int) (widthNomJoueur * proportion);
		this.heightNomJoueur =  (int) (heightNomJoueur * proportion);
		this.widthActionJoueur =  (int) (widthActionJoueur * proportion);
		this.heightActionJoueur =  (int) (heightActionJoueur * proportion);
		
		this.xNomJoueurSensDroite =  (int) (xNomJoueurSensDroite * proportion)  + xpointOrigine;
		this.yNomJoueurSensDroite =  (int) (yNomJoueurSensDroite * proportion)  + ypointOrigine ;
		this.xNomJoueurSensGauche =  (int) (xNomJoueurSensGauche * proportion) + xpointOrigine;
		this.yNomJoueurSensGauche =  (int) (yNomJoueurSensGauche * proportion) + ypointOrigine;
		
		
		this.xStackJoueurSensDroite =  (int) (xStackJoueurSensDroite * proportion) + xpointOrigine;
		this.yStackJoueurSensDroite =  (int) (yStackJoueurSensDroite * proportion) + ypointOrigine;
		this.xStackJoueurSensGauche =  (int) (xStackJoueurSensGauche * proportion) + xpointOrigine;
		this.yStackJoueurSensGauche =  (int) (yStackJoueurSensGauche * proportion) + ypointOrigine;
		this.widthStackJoueur =  (int) (widthStackJoueur * proportion);
		this.heightStackJoueur =  (int) (heightStackJoueur * proportion);
		
		this.xActionJoueurSensDroite =  (int) (xActionJoueurSensDroite * proportion) + xpointOrigine;
		this.yActionJoueurSensDroite =  (int) (yActionJoueurSensDroite * proportion) + ypointOrigine;
		this.xActionJoueurSensGauche =  (int) (xActionJoueurSensGauche * proportion) + xpointOrigine;
		this.yActionJoueurSensGauche =  (int) (yActionJoueurSensGauche * proportion) + ypointOrigine;
		
		
		this.xPresenceJoueurSensDroite =  (int) (xPresenceJoueurSensDroite * proportion) + xpointOrigine;
		this.yPresenceJoueurSensDroite =  (int) (yPresenceJoueurSensDroite * proportion) + ypointOrigine;
		this.xPresenceJoueurSensGauche =   (int) (xPresenceJoueurSensGauche * proportion) + xpointOrigine;
		this.yPresenceJoueurSensGauche =  (int) (yPresenceJoueurSensGauche * proportion) + ypointOrigine;
		
		this.xCarteFlop0 =  (int) (xCarteFlop0 * proportion) + xpointOrigine;
		this.yCarteFlop0 =  (int) (yCarteFlop0 * proportion) + ypointOrigine;
		this.xCarteFlop1 =  (int) (xCarteFlop1 * proportion) + xpointOrigine;
		this.yCarteFlop1 =  (int) (yCarteFlop1 * proportion) + ypointOrigine;
		this.xCarteFlop2 =  (int) (xCarteFlop2 * proportion) + xpointOrigine;
		this.yCarteFlop2 =  (int) (yCarteFlop2 * proportion) + ypointOrigine;
		this.xCarteFlop3 =  (int) (xCarteFlop3 * proportion) + xpointOrigine;
		this.yCarteFlop3  =  (int) (yCarteFlop3 * proportion) + ypointOrigine;
		this.xCarteFlop4 =  (int) (xCarteFlop4 * proportion) + xpointOrigine;
		this.yCarteFlop4  =  (int) (yCarteFlop4 * proportion) + ypointOrigine;
		
		
		
		VariablesJoueurs variablesJoueurs = new VariablesJoueurs();
		VariablesCartes variablesCartes = new VariablesCartes();
	}
	
	

}

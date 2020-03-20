package pokreader.ol.objects.screens;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import pokreader.ol.utils.VariablesCartes;
import pokreader.ol.utils.VariablesGlobales;
import pokreader.ol.utils.VariablesJoueurs;


@Data
@NoArgsConstructor
public class ScreenPartie extends ScreenEntite{
	
	
	List<ScreenJoueur> listeDeScreenJoueur ;
	List<ScreenCarte> listeDeScreenCartes ;
	List<Point> listeDePointPresenceJoueur;
	Point pointPresenceFlop;
	Point pointPresenceTurn;
	Point pointPresenceRiver;
	double proportion;
	
	public ScreenPartie(Point pointHautGauche, Point pointBasDroite) {
		super(pointHautGauche,pointBasDroite);
		this.proportion = (double)(pointBasDroite.x - pointHautGauche.x)/1280;

		VariablesGlobales variablesGlobales = new VariablesGlobales(this.proportion,pointHautGauche);
		
		this.listeDeScreenJoueur = new ArrayList<ScreenJoueur>();
		this.listeDeScreenJoueur.add(VariablesJoueurs.screenJoueur0);
		this.listeDeScreenJoueur.add(VariablesJoueurs.screenJoueur1);
		this.listeDeScreenJoueur.add(VariablesJoueurs.screenJoueur2);
		this.listeDeScreenJoueur.add(VariablesJoueurs.screenJoueur3);
		this.listeDeScreenJoueur.add(VariablesJoueurs.screenJoueur4);
		this.listeDeScreenJoueur.add(VariablesJoueurs.screenJoueur5);
		
		this.listeDeScreenCartes = new ArrayList<ScreenCarte>();
		this.listeDeScreenCartes.add(VariablesCartes.screenCarteFlop0);
		this.listeDeScreenCartes.add(VariablesCartes.screenCarteFlop1);
		this.listeDeScreenCartes.add(VariablesCartes.screenCarteFlop2);
		this.listeDeScreenCartes.add(VariablesCartes.screenCarteFlop3);
		this.listeDeScreenCartes.add(VariablesCartes.screenCarteFlop4);
		
		this.listeDePointPresenceJoueur = new ArrayList<Point>();
		this.listeDePointPresenceJoueur.add(VariablesJoueurs.pointPresenceJoueur0);
		this.listeDePointPresenceJoueur.add(VariablesJoueurs.pointPresenceJoueur1);
		this.listeDePointPresenceJoueur.add(VariablesJoueurs.pointPresenceJoueur2);
		this.listeDePointPresenceJoueur.add(VariablesJoueurs.pointPresenceJoueur3);
		this.listeDePointPresenceJoueur.add(VariablesJoueurs.pointPresenceJoueur4);
		this.listeDePointPresenceJoueur.add(VariablesJoueurs.pointPresenceJoueur5);
		
		this.pointPresenceFlop = VariablesCartes.pointPresenceFlop; 
		this.pointPresenceFlop = VariablesCartes.pointPresenceTurn;
		this.pointPresenceFlop = VariablesCartes.pointPresenceRiver;
		
		
	}
	
	
}

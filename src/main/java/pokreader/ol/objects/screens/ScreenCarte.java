package pokreader.ol.objects.screens;

import java.awt.Point;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class ScreenCarte extends ScreenEntite{
	
	
	public ScreenCarte(ScreenEntite screenEntite) {
		super(screenEntite.getPointOrigine(),screenEntite.getRectangle());
	}
	ScreenEntite numeroCarte;
	ScreenEntite signeCarte ;
	
	
}

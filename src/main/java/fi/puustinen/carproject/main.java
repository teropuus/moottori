package fi.puustinen.carproject;

import fi.puustinen.carproject.domain.*;
import fi.puustinen.carproject.domain.Ajaja.Ajotapa;

public class main  
{
    public static void main( String[] args )
    {
    	Ajaja ajaja1 = new Ajaja(null, "keke", Ajotapa.TAVALLINEN);
    	Ajaja ajaja2 = new Ajaja(null, "Petri", Ajotapa.AGGRESSIIVINEN);
    	Ajaja ajaja3 = new Ajaja(null, "Tero", Ajotapa.RAUHALLINEN);
    	
    	Moottori moottori1 = new Moottori(10,0,3);
    	Moottori moottori2 = new Moottori(200,4,3);
    	Moottori moottori3 = new Moottori(300,2,1);
    	
    	Auto auto1 = new Auto("Lada","Samara",60,moottori1,ajaja1);
    	Auto auto2 = new Auto("Opel","Corsa",120,moottori2,ajaja2);
    	Auto auto3 = new Auto("Dodge","Nitro",50,moottori3,ajaja3);
    }
}

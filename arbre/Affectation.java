package plic.arbre;

import plic.arbre.expression.Expression;
import plic.tds.TDS;
import plic.tds.entrees.EntreeVar;

public class Affectation extends ArbreAbstrait{
	private Expression droite;
	private String gauche;
	
	public Affectation(Expression droite,String gauche){
		super();
		this.droite = droite;
		this.gauche = gauche;
	}
	
	public String toMips(){
		StringBuilder sb = new StringBuilder();
		sb.append("# Affectation de " + gauche + "\n");
		sb.append(droite.toMips());
		int decalage = TDS.getInstance().identifier(new EntreeVar(gauche)).getDep();
		sb.append("sw $v0, " + decalage + "($s7)\n\n");
		return sb.toString();	
	}
	
	public boolean verify(){
		//String type = tds.identifier(gauche).getType();
		String type = "entier";
		return droite.estEntier() == (type.equals("entier"));
	}

	@Override
	public String toString() {
		return "Affectation [droite=" + droite + ", gauche=" + gauche + "]";
	}

}

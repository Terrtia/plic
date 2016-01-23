package plic.arbre.expression;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public class Moins extends BinaireArithmetique {

    public Moins(Expression gauche, Expression droite) {
        super(gauche, droite);
    }

    @Override
    public String operateur() {
        return " - ";
    }

	@Override
	public String toMips() {
		StringBuilder sb = new StringBuilder();
		sb.append(gauche.toMips());
		return null;
	}

	@Override
	public boolean verify() {
		return false;
	}
    
}

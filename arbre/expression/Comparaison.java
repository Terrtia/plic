package plic.arbre.expression;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public abstract class Comparaison extends Binaire {
     
    protected Comparaison(Expression gauche, Expression droite,int ligne) {
        super(gauche, droite,ligne);
        type = "boolean";
    }
    
    public boolean verify(){
    	return (gauche.estBoolean() == droite.estBoolean());
    }

    public boolean estBoolean(){
    	return true;
    }

}

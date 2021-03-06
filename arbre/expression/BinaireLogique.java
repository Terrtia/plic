package plic.arbre.expression;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public abstract class BinaireLogique extends Binaire {

    protected BinaireLogique(Expression gauche, Expression droite,int ligne) {
        super(gauche, droite,ligne) ;
        type = "boolean";
    }
    
    public boolean estBoolean(){
    	return true;
    }
    
    public boolean verify(){
    	return (gauche.estBoolean() == droite.estBoolean()) && gauche.verify() && droite.verify();
    }
    
}

package plic.arbre.expression;

import plic.arbre.ArbreAbstrait;
import plic.exceptions.AnalyseSemantiqueException;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public class MoinsUnaire extends Unaire {
    
    public MoinsUnaire(Expression expr,int ligne) {
        super(expr,ligne);
        type = "entier";
    }

    @Override
    public String operateur() {
        return "- " ;
    }

	public String toMips() {
		StringBuilder s = toMipsUnaire();
		if(!verify())
			throw new AnalyseSemantiqueException("ligne 1, entier requis apres l'operateur unaire - \n");
		s.append("# MoinsUnaire\n");
		s.append("add $sp, $sp, 4\n");
		s.append("lw $v0, ($sp)\n");
		
		s.append("move $t8, $v0\n"); // t8 = v0
		s.append("sub $v0, $v0, $t8\n"); // v0 = v0 - t8*2
		s.append("sub $v0, $v0, $t8\n"); 
		
		s.append("sw $v0, ($sp)\n");
		s.append("addi $sp, $sp, -4\n");
		s.append("\n");
		return s.toString();
	}

	@Override
	public boolean verify() {
		return expression.estEntier();
	}


}

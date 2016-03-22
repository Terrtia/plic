package plic.arbre.expression;

import plic.arbre.ArbreAbstrait;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public class Plus extends BinaireArithmetique {

    public Plus(Expression gauche, Expression droite,int ligne) {
        super(gauche, droite,ligne);
    }
    
    @Override
    public String operateur() {
        return " + " ;
    }

	@Override
	public String toMips() {
		StringBuilder s = toMipsBinaireArithmetique();
		s.append("# Plus\n");
		//Right
		s.append("add $sp, $sp, 4\n");
		s.append("lw $t8, ($sp)\n");
		
		//Left
		s.append("add $sp, $sp, 4\n");
		s.append("lw $v0, ($sp)\n");
		
		s.append("add $v0, $v0, $t8\n");
		s.append("sw $v0, ($sp)\n");
		s.append("addi $sp, $sp, -4\n");
		s.append("\n");
		return s.toString();
	}

}

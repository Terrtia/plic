package plic.arbre;

import java.util.ArrayList;

import plic.VariablesGlobales;
import plic.tds.TDS;


/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public class BlocDInstructions extends ArbreAbstrait {
    
	protected ArrayList<ArbreAbstrait> lesArbres;
    protected ArbreAbstrait expr ;
    
    
    public BlocDInstructions() {
        super();
        lesArbres = new ArrayList<ArbreAbstrait>();
    }
    
    public void ajouter(ArbreAbstrait a) {
        //expr = a ;
        this.lesArbres.add(a);
    }
    
    public String toMips() {
        //return expr.toString() ;
        StringBuilder str = new StringBuilder();
       
		for(ArbreAbstrait a : lesArbres) {
			if(a != null)
				str.append(a.toMips());
		}
		return str.toString();
    }

	/*public String data(){
    	StringBuilder sb = new StringBuilder();
    	sb.append(".data\n");
    	VariablesGlobales vg = VariablesGlobales.getInstance();
    	for(int i = 0;i < vg.getDataSize();i++){
    		sb.append("str"+i+" : .asciiz ");
    		sb.append(vg.getData(i) + "\n");
    	}
 
    	
    	return sb.toString();
    }
    
    public String entete() {
    	StringBuilder s = new StringBuilder();
    	s.append(".text\n");
    	s.append("main :\n\n");
    	s.append("# Declarations\n");
		s.append("move $s7,$sp\n");
		s.append("addi $sp,$sp,-" + TDS.getInstance().getTailleZoneVar() + "\n\n");
    	return s.toString();
    }
    
    public String fin() {
    	StringBuilder s = new StringBuilder();
    	s.append("\nend :\n");
    	s.append("  move $v1, $v0\n");
    	s.append("  li $v0, 10\n");
    	s.append("  syscall\n");
    	return s.toString();
    }*/
    
   

}

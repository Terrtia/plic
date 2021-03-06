package plic.arbre;

import plic.tds.TDS;
import plic.tds.entrees.EntreeVar;

public class EcrireVar extends ArbreAbstrait{
	private String var; 

	public EcrireVar(String var,int ligne){
		super(ligne);
		this.var = var;
	}
	
	public String toMips(){
		StringBuilder sb = new StringBuilder();
		int decalage = TDS.getInstance().identifier(new EntreeVar(var)).getDeplacement();
		sb.append("lw $a0, "+decalage+"(s7)\n");
		sb.append("li $v0 1\n");
		sb.append("syscall\n");
		return sb.toString();
	}

	@Override
	public String toString() {
		return "EcrireVar [var=" + var + "]";
	}


}

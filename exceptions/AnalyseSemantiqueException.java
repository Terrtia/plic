package plic.exceptions;

@SuppressWarnings("serial")
public class AnalyseSemantiqueException extends AnalyseException {

	public AnalyseSemantiqueException(String m) {
		super("ERREUR SEMANTIQUE :\n\t" + m);
	}

}

package plic.exceptions;

/**
 * 10 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

@SuppressWarnings("serial")
public class AnalyseLexicaleException extends AnalyseException {
 
    public AnalyseLexicaleException(int ligne, int colonne, String m) {
        super("ERREUR LEXICALE :\n\tligne " + ligne + " colonne " + colonne + "\n\t" + m + " : caractère non reconnu") ;
    }

}

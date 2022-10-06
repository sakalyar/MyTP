package serie03.cmd;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import serie03.Text;

/**
 * @inv <pre>
 *     getBackup() != null
 *     isRelevantForText() </pre>
 */
class Clear extends AbstractCommand {
    
    // ATTRIBUTS
	private final List<String> oldLines;
    // ...
    
    // CONSTRUCTEURS
    
	Text text;
	
    /**
     * Une commande de vidage du texte.
     * @pre <pre>
     *     text != null </pre>
     * @post <pre>
     *     getText() == text
     *     !done()
     *     |getBackup()| == 0 </pre>
     */
    Clear(Text text) {
    	if (text != null) {
    		for (int i = 0; i < text.getLinesNb(); ++i)
        		oldLines.add(text.getLine(i));
    		// implement clearing
    		
    	}
        // ...
    }
    
    // REQUETES
    
    /**
     * La liste des lignes composant le texte juste avant d'exécuter undoIt.
     */
    List<String> getBackup() {
    	return oldLines;
    }
    
    @Override
    public boolean isRelevantForText() {
        // ...
    }
    
    // COMMANDES

    /**
     * Efface la totalité du texte.
     * @post <pre>
     *     |getBackup()| == old getText().getLinesNb()
     *     forall i in [0..|getBackup()| - 1] :
     *         getBackup().get(i).equals(old getText().getLine(i + 1))
     *     getText().getLinesNb() == 0 </pre>
     */
    @Override
    protected void doIt() {
        // ...
    }
    
    /**
     * Régénère la totalité du texte.
     * @post <pre>
     *     getText().getLinesNb() == old |getBackup()|
     *     forall i in [1..getText().getLinesNb()] :
     *         getText().getLine(i).equals(old getBackup().get(i - 1)) </pre>
     */
    @Override
    protected void undoIt() {
        // ...
    }
}

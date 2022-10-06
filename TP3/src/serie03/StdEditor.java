package serie03;

public class StdEditor implements Editor {

	StdText text;
	StdHistory<Object> history;
	int historySize;
	
	public StdEditor(int m) {
		history = new StdHistory<>(m);
	}
	
	
	@Override
	public int getTextLinesNb() {
		return text.getLinesNb();
	}

	@Override
	public String getTextContent() {
		return text.getContent();
	}

	@Override
	public int getHistorySize() {
		//?
		return history.getEndPosition();
	}

	@Override
	public int nbOfPossibleUndo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int nbOfPossibleRedo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		text = new StdText();
		
	}

	@Override
	public void insertLine(int numLine, String s) {
		this.text.insertLine(numLine, s);
	}

	@Override
	public void deleteLine(int numLine) {
		this.text.deleteLine(numLine);
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}

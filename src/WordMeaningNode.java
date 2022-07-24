
public class WordMeaningNode {
	WordMeaning meaning;
	WordMeaningNode next;
	
	public WordMeaningNode(WordMeaning meaning) {
		this.meaning = meaning;
		this.next = null;
	}
	
	public WordMeaningNode() {
		this.meaning = null;
		this.next = null;
	}
	
	public void addMeaning(WordMeaning m) {
		WordMeaningNode temp = new WordMeaningNode(m);
		temp.next = this.next;
		this.next = temp;
	}
}

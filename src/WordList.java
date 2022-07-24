
public class WordList {
	
	String word;
	WordMeaningNode word_meanings;
	WordList next;
	
	public WordList() {
		this.word = "";
		this.word_meanings = null;
		this.next = null;
	}
	
	public WordList(String word) {
		this.word = word;
		this.word_meanings = new WordMeaningNode();
		this.next = null;
	}
	
//	public void addMeaningToWord(String word, String meaning) {
//		while (this.next != null) {
//			if (this.word.equals(word)){
//				this.word_meanings.addMeaning(new WordMeaning(word, meaning));
//				return;
//			}
//		}
//		
//		WordList temp = new WordList(word);
//		temp.word_meanings.addMeaning(new WordMeaning(word, meaning));
//		temp.next = this.next;
//		this.next = temp;
//		return;
//	}
	static void addMeaningToWord(WordList head, String word, String meaning) {
		while (head.next != null) {
			head = head.next;
			if (head.word.equals(word)){
				head.word_meanings.addMeaning(new WordMeaning(word, meaning));
				return;
			} else {
				continue;
			}
		}
		
		WordList temp = new WordList(word);
		temp.word_meanings.addMeaning(new WordMeaning(word, meaning));
		temp.next = head.next;
		head.next = temp;
		return;
	}
}

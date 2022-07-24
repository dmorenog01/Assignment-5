import javax.swing.JOptionPane;

public class Dictionary {
	public static void printDictionary(WordList wl) {
		while (wl.next != null) {
			wl = wl.next;

			printWordMeaningNode(wl.word_meanings);
			System.out.println("END OF WORD");
		}
	}
	public static void printWordMeaningNode(WordMeaningNode h) {
		
		boolean firstRun = true;
		String output = "";
		while (h.next != null) {
			h = h.next;
			if (firstRun) {
				output += h.meaning.word;
				firstRun = false;
			}
			output += " - " + h.meaning.meaning;
		}
		System.out.println(output);
	}
	
	public static void addWordMeaning(WordList head) {
		String word = JOptionPane.showInputDialog("Input a word: ");
		String meaning = JOptionPane.showInputDialog("Input a word meaning: ");
		WordList.addMeaningToWord(head, word, meaning);
	}
	
	public static void main(String[] args) {
		
		boolean done = false;
		WordList head = new WordList();
		
		String menu = "Enter option\n1. Add a meaning\n2. Show dictionary\n3. Exit.";
	    while (!done) {
	      String s = JOptionPane.showInputDialog(menu);
	      try {
	        int i = Integer.parseInt(s);
	        switch (i) {
	          case 1:
	        	  addWordMeaning(head);
	            break;
	          case 2:
	        	  printDictionary(head);
				  System.out.println("End of print dictionary.");
				  System.out.println();
	            break;
	          case 3:
		            done = true;
		            break;
	          default:
	        	  done = true;
	            break;
	        }
	      } catch (NumberFormatException | NullPointerException e) {
	        done = true;
	        //display(e.toString(), "Error");
	      }
	    }
	    
	    
	    

		
		

		
		
		
		

	}

}

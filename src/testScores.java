import javax.swing.JOptionPane;

public class testScores {

	public static void main(String[] args) {
		int score =Integer.parseInt( JOptionPane.showInputDialog("What score did you get on your last test?"));
			if (score > 90) {
				JOptionPane.showMessageDialog(null, "Great Job! you must have been up real late last night studdying for the test!");
			}
			else if (score > 80) {
				JOptionPane.showMessageDialog(null, "Hey! Nice job on the test, I am sure if you try harder next time you can get an even better score");
			}
			else if (score > 75) {
				JOptionPane.showMessageDialog(null, "Ok... c'mon buddy, I know you can do better than that.");
			}
			else if (score < 75) {
				JOptionPane.showMessageDialog(null, "MY GOD! HOW COULD YOU BLOW THIS OFF VERY IMPORTANT TEST, THIS IS HALF OF YOUR FLORPIN GRADE!");
			}
	}

}

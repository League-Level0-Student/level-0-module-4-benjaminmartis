import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What pet would you like?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		for (int happinessLevel = 0; happinessLevel < 3;) {
			
			
		int task = JOptionPane.showOptionDialog(null, "What would you like to do with your " +pet+ "?", "Pets happiness "+happinessLevel, 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Snuggle with "+pet+"?", "Poop with your "+pet+ "?", "Eat with your " +pet+"?"}, null);

			// 5. Use user input to call the appropriate method created in step 4.
              
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	
	
	 if (task==0) {
	 JOptionPane.showMessageDialog(null, "Your "+pet+ " really enjoyed that peaceful time with you!*"+pet+ " made cute noise*");
	 happinessLevel+=1;
	 }
	 if (task==1) {
		 JOptionPane.showMessageDialog(null, "Your "+pet+" Did not particularly enjoy that incident. *"+pet+" made a not so cute snarling noise*");
		 happinessLevel-=1;
	 }
	 if (task==2) {
		 JOptionPane.showMessageDialog(null, "Your "+pet+ "enjoyed your company quite so! *"+pet+" made a relatively mediocre noise*");
		 happinessLevel+=1;
	 }
	 
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}
}
	}
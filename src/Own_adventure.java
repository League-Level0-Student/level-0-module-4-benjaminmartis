import javax.swing.JOptionPane;

public class Own_adventure {

	public static void main(String[] args) {	
		int grab = JOptionPane.showOptionDialog(null, "You are about to go to the grocery store, what do you do first?", "At home", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Grab phone", "Grab keys", "Grab and put your pants on"}, null);
		if (grab==0) {
			JOptionPane.showMessageDialog(null, "Your phone starts growing legs and arms and starts punching you until you go unconscious into a coma, then later in the hospital you died... :C");
		}
		if (grab==1) {
			JOptionPane.showMessageDialog(null, "You git into your car and after driving for about 3 miles you realize that you forgot your phone and your pants!");
			int drive = JOptionPane.showConfirmDialog(null, "Do you turn around and get your forgotten items?");
			if(drive==0) {
				JOptionPane.showMessageDialog(null, "You turned to fast in embarassment so you flipped over and crashed. AKA you died fam");
			}
			if(drive==1) {
				JOptionPane.showMessageDialog(null, "After drving around in the parking lot of your local grocery store for about a total of 30 minutes you finaly get a parking spot.");
				int plotdo = JOptionPane.showOptionDialog(null, "once you go out of your car many eyes turned to your unclothed buttox.","At parking lot", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Jump back into car after the ambarresing incident.", "Run to the nearest open pair of clothes"}, null);
			}
		}
		if(grab==2) {
			JOptionPane.showMessageDialog(null, "You made the sensible thing and put some clothes on");
			int afterpants = JOptionPane.showOptionDialog(null, "Now do you get your phone or get your keys?","At home still", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Go and get your phone", "Go and get your keys"}, null);
			if(afterpants == 0) {
				JOptionPane.showMessageDialog(null, "Your phone starts growing legs and arms and starts punching you until you go unconscious");
			}
			if(afterpants == 1) {
				JOptionPane.showMessageDialog(null, "You grabbed your keys and got into the car");
				JOptionPane.showMessageDialog(null, "You git into your car and after driving for about 3 miles you realize that you forgot your phone and your pants!");
				int driveafterpants = JOptionPane.showConfirmDialog(null, "Do you turn around and get your forgotten phone? Plus your special someone might have called or got home before you did and started looking through your phone.");
				if (driveafterpants == 0) {
					JOptionPane.showMessageDialog(null, "After your sudden realization you tried to turn around so fast that you flipped over and crashed. AKA you died fam");
				}
			}
		}
		 
		 }
	}

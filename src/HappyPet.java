import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	static int happylevel= 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet= JOptionPane.showInputDialog("What type of pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Take care of your pet!", "Care for Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Walk", "Feed", "Cuddle" }, null);

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void Walk(String pet) {
		if (pet.equals("cat")) {JOptionPane.showMessageDialog(null, ""+pet+" is only a little entertained.");
		happylevel+=1;
		
		}
		if (pet.equals("dog")) {
			JOptionPane.showMessageDialog(null, pet+" is very satified!");
			happylevel+=5;
			
			
		}
		if (pet.equals("bird")) {
			JOptionPane.showMessageDialog(null, pet+" is uneffected");
			
		}
		if (pet.equals("snek")) {
			JOptionPane.showMessageDialog(null, pet+" is offended");
			happylevel-=3;
			
		}
	}
	

static void feed(String pet) {
	if (pet.equals("cat")) {
		JOptionPane.showMessageDialog(null, pet+" is uneffected");
		
	}
}
}
	

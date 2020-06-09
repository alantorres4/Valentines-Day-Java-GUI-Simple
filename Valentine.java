import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Valentine {
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////BELOW IS WHAT YOU CHANGE//////////////////////////////////////////////////////////////////////////////////

    String PaneTitleHere = "Name of title. Example: My Valentine";
    String YesImage = "Name of image you want to display when the user chooses Yes. Example: OurFirstDate.jpg";
    String YesMessage = "Message you want to display when the user chooses Yes. Example: Cool!";
    
    String NoImage = "Name of image you want to display when the user chooses No. Example: OhOkay.jpg";
    String NoMessage = "Message you want to display when the user chooses No. Example: That's okay. Have a good day :)";
    
    String MaybeImage = "Name of image you want to display when the user chooses Maybe. Example: Hmm.jpg";
    String MaybeMessage = "Message you want to display when the user chooses Maybe. Example: Okay! No pressure :)";
    
    /////////////////////////////////////////////////////////////////ABOVE IS WHAT YOU CHANGE////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    
    public static void main(String[] args) {
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////CHANGE COLORS IF YOU WANT/////////////////////////////
        
        UIManager.put("OptionPane.background", Color.pink);          // DEFAULT: Color.pink
        UIManager.put("Panel.background", Color.PINK);                  // DEFAULT: Color.PINK
        UIManager.put("Button.background", Color.DARK_GRAY);   //DEFAULT: Color.DARK_GRAY
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////


        JDialog.setDefaultLookAndFeelDecorated(true);
    
        ImageIcon heart = new ImageIcon("heartIcon.png"); // CHANGE IF YOU WANT, I just thought this was a nice, cute icon.
        Object[] selectionValues = { "Yes", "No", "Maybe" };
        String initialSelection = "Maybe";
        Object selection = JOptionPane.showInputDialog(null, "Will you be my Valentine?", PaneTitleHere, JOptionPane.INFORMATION_MESSAGE, heart, selectionValues, initialSelection);
    
        if (selection.equals("Yes")) {
            ImageIcon Yes = new ImageIcon(YesImage);
            JOptionPane.showMessageDialog(null, YesMessage, JOptionPane.INFORMATION_MESSAGE, Yes);
        }
        else if(selection.equals("No")) {
            ImageIcon No = new ImageIcon(NoImage);
            JOptionPane.showMessageDialog(null, NoMessage, JOptionPane.INFORMATION_MESSAGE, No);
        }
        else {
            ImageIcon Maybe = new ImageIcon(MaybeImage);
            JOptionPane.showMessageDialog(null, MaybeMessage, JOptionPane.INFORMATION_MESSAGE, Maybe);
        }
    
        System.out.println("You choose: "+selection+"!");
    }

}


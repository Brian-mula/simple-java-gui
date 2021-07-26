import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args){
        String name=JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Helloe "+ name);
        int age=Integer.parseInt( JOptionPane.showInputDialog("Enter your age"));
       JOptionPane.showMessageDialog(null, "You are " + age +"years old");
    }
}

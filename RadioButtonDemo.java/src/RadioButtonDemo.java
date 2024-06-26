import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author j
 */
public class RadioButtonDemo extends JFrame
implements ActionListener{
    private static RadioButtonDemo RadioButtonDemo;
    
    JRadioButton birdButton,catButton,dogButton,pigButton,rabbitButton;
    ButtonGroup group;
    JLabel imageLabel;
    private Object JOptionpane;
    
    @SuppressWarnings("LeakingThisInConstructor")
    public RadioButtonDemo(){
        setTitle("RadioButtonDemo");
        birdButton= new JRadioButtton("Bird");
        catButton= new JRadioButtton("cat");
        dogButton= new JRadioButtton("dog");
        pigButton= new JRadioButtton("pig");
        rabbitButton= new JRadioButtton("rabbit");
        
        group= new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(pigButton);
        group.add(rabbitButton);
        
        birdButton.addActionListener(this);
        catButton.addActionListener(this);
        dogButton.addActionListener(this);
        pigButton.addActionListener(this);
        rabbitButton.addActionListener(this);
        
        imageLabel= new JLabel();
        JPanel panel = new JPanel();
         add(panel, "North");
         add(imageLabel,"Center");
         setSize(300, 300);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
       JRadioButton source =(JRadioButton)e.getSource(); 
         String pet = source.getText();
         JOptionpane.showMessageDialog(this,"You selected: " + pet);
         switch(pet){
             case "Bird":
                 imageLabel.setIcon(new ImageIcon("images/bird.jpg"));
                 break;
                 case "Cat":
                 imageLabel.setIcon(new ImageIcon("images/cat.jpg"));
                 break;
                  case "Dog":
                 imageLabel.setIcon(new ImageIcon("images/dog.jpg"));
                 break; 
                    case "Pig":
                 imageLabel.setIcon(new ImageIcon("images/pig.jpg"));
                 break;  
                case "Rabbit":
                 imageLabel.setIcon(new ImageIcon("images/rabbit.jpg"));
                 break;        
         }
    }
    public static void main(String[] args){
        RadioButtonDemo = new RadioButtonDemo();
    }

        }
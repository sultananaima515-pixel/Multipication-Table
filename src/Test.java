//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Test extends JFrame {

    private Container c;
    private JLabel imglabel,textLable;
    private JTextArea ta;
    private JTextField tf;
    private JButton clearButton;
    private ImageIcon img;
    private Font f;
    private Cursor cursor;


    Test()
    {

        c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        f = new Font("Tahona",Font.BOLD,20);

        img = new ImageIcon(getClass().getResource("images.jpeg"));

        imglabel = new JLabel(img);
        imglabel = new JLabel(img);
        imglabel.setBounds(0,10,img.getIconWidth(),img.getIconHeight());
        c.add(imglabel);

        textLable = new JLabel("Enter Any Number : ");
        textLable.setBounds(20,200,250,50);
        textLable.setForeground(Color.BLUE);
        textLable.setFont(f);
        c.add(textLable);

        tf = new JTextField();
        tf.setBounds(230,200,90,50);
        tf.setFont(f);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setBackground(Color.blue);
        c.add(tf);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        clearButton = new JButton("Clear");
        clearButton.setBounds(230,260,90,50);
        clearButton.setCursor(cursor);
        clearButton.setFont(f);
        c.add(clearButton);

        ta = new JTextArea();
        ta.setBounds(20,350,300,300);
        ta.setBackground(Color.blue);
        ta.setFont(f);
        c.add(ta);

        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String value = tf.getText();
                if(value.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "You didnot put any Number");
                }

                else {
                    ta.setText(" ");
                    int num = Integer.parseInt(tf.getText());

                    for(int i=1;i<=10;i++)
                    {
                        int result =num * i;

                        String r = String.valueOf(result);
                        String n = String.valueOf(num);
                        String incr = String.valueOf(i);

                        ta.append(n+"X" +incr + " = " +r+ "\n");
                    }
                }
            }

        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText(" ");
                tf.setText(" ");
            }
        });

    }
    public static void main(String[] args) {

        Test frame =new Test();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,20,360,700);
        frame.setTitle("Multipication Table");

    }
}
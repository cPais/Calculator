import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyCalculator
{
	public static int total = 0;
	public static String lastOperator = "";
	public static boolean NewOp = true;
	public static String numbers = "";
   
      

   public static void main(String[] args)
   {
      SimpleFrame frame = new SimpleFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}

class SimpleFrame extends JFrame
{
   public SimpleFrame()
   {
		System.out.println("After clicking the equals button, remember the calculator resets.");
		final int SIZE1 = 300;
		final int SIZE2 = 350;
      setSize(SIZE1, SIZE2);
		
      JPanel panel = new JPanel();
      panel.setBackground(Color.gray);
      add(panel);
		panel.setLayout(new GridLayout(5,3));
		this.setResizable(false);
		
		JTextField numberField = new JTextField();
		numberField.setHorizontalAlignment(JTextField.RIGHT);
		numberField.setEditable(false);
		add(numberField, BorderLayout.NORTH);
		Font f = new Font("Courier", Font.BOLD, 15);
		  
      JButton button1 = new JButton("1");
 		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
 		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
 		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
 		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
 		JButton button0 = new JButton("0");
 		JButton buttonpl = new JButton("+");
		JButton buttonmi = new JButton("-");
 		JButton buttoneq = new JButton("=");
		JButton buttonc = new JButton("Clear");
		
		buttonc.setBackground(Color.RED);
		buttonc.setFont(f);
		buttonpl.setBackground(Color.ORANGE);
		buttonpl.setFont(f);
		buttonmi.setBackground(Color.ORANGE);
		buttonmi.setFont(f);
		buttoneq.setBackground(Color.YELLOW);
		buttoneq.setFont(f);
		
		
		button1.addActionListener(new SimpleListener(button1, panel, numberField));
 		button2.addActionListener(new SimpleListener(button2, panel, numberField));
		button3.addActionListener(new SimpleListener(button3, panel, numberField));
		button4.addActionListener(new SimpleListener(button4, panel, numberField));
		button5.addActionListener(new SimpleListener(button5, panel, numberField));
		button6.addActionListener(new SimpleListener(button6, panel, numberField));
		button7.addActionListener(new SimpleListener(button7, panel, numberField));
		button8.addActionListener(new SimpleListener(button8, panel, numberField));
		button9.addActionListener(new SimpleListener(button9, panel, numberField));
		button0.addActionListener(new SimpleListener(button0, panel, numberField));
 		buttonpl.addActionListener(new SimpleListener(buttonpl, panel, numberField));
		buttonmi.addActionListener(new SimpleListener(buttonmi, panel, numberField));
 		buttoneq.addActionListener(new SimpleListener(buttoneq, panel, numberField));
		buttonc.addActionListener(new SimpleListener(buttonc, panel, numberField));
 		
      panel.add(button1);
 		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button0);
 		panel.add(buttonpl);
		panel.add(buttonmi);
 		panel.add(buttoneq);
		panel.add(buttonc);
       
   }
}

class SimpleListener implements ActionListener
{
   private JButton button;
   private JPanel panel;
	private JTextField numberField;
   
   public SimpleListener(JButton b, JPanel p, JTextField nF)
   {
      button = b;
      panel = p;
		numberField = nF;
   }
   
   public void actionPerformed(ActionEvent e)
   {
		if(button.getText().equals("1"))
		{
			MyCalculator.numbers += "1";
			numberField.setText(MyCalculator.numbers);
		}
		else{}
		if(button.getText().equals("2"))
		{
			MyCalculator.numbers += "2";
			numberField.setText(MyCalculator.numbers);
		}
		else{}
		if(button.getText().equals("3"))
		{
			MyCalculator.numbers += "3";
			numberField.setText(MyCalculator.numbers);
		}
		else{}
		if(button.getText().equals("4"))
		{
			MyCalculator.numbers += "4";
			numberField.setText(MyCalculator.numbers);
		}
		else{}
		if(button.getText().equals("5"))
		{
			MyCalculator.numbers += "5";
			numberField.setText(MyCalculator.numbers);
		}
		else{}
		if(button.getText().equals("6"))
		{
			MyCalculator.numbers += "6";
			numberField.setText(MyCalculator.numbers);
		}
		else{}
		if(button.getText().equals("7"))
		{
			MyCalculator.numbers += "7";
			numberField.setText(MyCalculator.numbers);
		}
		else{}
		if(button.getText().equals("8"))
		{
			MyCalculator.numbers += "8";
			numberField.setText(MyCalculator.numbers);;
		}
		else{}
		if(button.getText().equals("9"))
		{
			MyCalculator.numbers += "9";
			numberField.setText(MyCalculator.numbers);
		}
		else{}
		if(button.getText().equals("0"))
		{
			MyCalculator.numbers += "0";
			numberField.setText(MyCalculator.numbers);
		}
		else{}
		if(button.getText().equals("+"))
		{	
			if(MyCalculator.lastOperator.equals("-"))
			{
				MyCalculator.total -= Integer.parseInt(numberField.getText());
				numberField.setText("+");
				MyCalculator.lastOperator = "+";
				MyCalculator.NewOp = false;
			}
			else
			{
				MyCalculator.lastOperator = "+";
				MyCalculator.total += Integer.parseInt(numberField.getText());
				numberField.setText("+");
				MyCalculator.NewOp = false;

			}
			MyCalculator.numbers = "";
		}
		if(button.getText().equals("-"))
		{
			if(MyCalculator.lastOperator.equals("+"))
			{
				MyCalculator.total += Integer.parseInt(numberField.getText());
				MyCalculator.lastOperator = "-";
				MyCalculator.NewOp = false;
			}
			else
			{
				MyCalculator.lastOperator = "-";
				if(MyCalculator.total == 0 && MyCalculator.NewOp == true)
					MyCalculator.total = Integer.parseInt(numberField.getText());
				else
					MyCalculator.total -= Integer.parseInt(numberField.getText());
				
				numberField.setText("-");
				MyCalculator.NewOp = false;
			}
			MyCalculator.numbers = "";
		}
		else{}
		if(button.getText().equals("="))
		{
				if(MyCalculator.lastOperator.equals("+"))
				{
				MyCalculator.total += Integer.parseInt(numberField.getText());
				}
				else
				{
				MyCalculator.total -= Integer.parseInt(numberField.getText());
				}
			numberField.setText(String.valueOf(MyCalculator.total));
			MyCalculator.total = 0;
			MyCalculator.NewOp = true;
			MyCalculator.numbers = "";
		}
		else{}
		if(button.getText().equals("Clear"))
		{
			
			numberField.setText("");
			MyCalculator.total = 0;
			MyCalculator.lastOperator = "";
			MyCalculator.NewOp = true;
			MyCalculator.numbers = "";
		}
		else{}
   }
}

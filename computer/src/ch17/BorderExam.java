package ch17;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderExam extends JFrame{
	public BorderExam() {
		//보더 레이아웃
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		JButton button4 = new JButton("Button 4");
		JButton button5 = new JButton("Button 5");
		JButton button6 = new JButton("Button 6");
		add(button1);
		add(button2, "North");
		add(button3, "South");
		add(button4, "East");
		JPanel p = new JPanel();
		p.add(button5);
		p.add(button6);
		add(p,"West");
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	public static void main(String[] args) {
		new BorderExam();
	}

}

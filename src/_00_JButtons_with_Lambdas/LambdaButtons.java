
package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");

	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);

		// 1. Call the addActionListener methods for each button. Use lambdas
		// to define to functionality of the buttons.
		addNumbers.addActionListener((ActionEvent e) -> {
			String one = JOptionPane.showInputDialog("Give one number");
			String two = JOptionPane.showInputDialog("Give a second number");
			int one1 = Integer.parseInt(one);
			int two2 = Integer.parseInt(two);
			int result = one1 + two2;
			JOptionPane.showMessageDialog(null, "The answer is " + result);
		});
		randNumber.addActionListener((ActionEvent e) -> {
			Random rand = new Random();
			int r = rand.nextInt(10000000);
			JOptionPane.showMessageDialog(null, r);
		});
		tellAJoke.addActionListener((ActionEvent e)->{
			JOptionPane.showMessageDialog(null, "How do you know when a joke is a dad joke?");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "When it becomes APARENT");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("( ͡° ͜ʖ ͡°)");
		});
		window.setVisible(true);
		window.pack();
	}

	public static void main(String[] args) {
		new LambdaButtons();
	}

}

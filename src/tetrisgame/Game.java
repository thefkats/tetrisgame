package tetrisgame;

import java.awt.BorderLayout;

public class Game {

	private static Display d = new Display();

	public static void main(String[] args) {
		Board b = new Board();
		run(b);
	}

	public static void run(Board b) {
		Display d = new Display();
		d.add(b, BorderLayout.CENTER);

		d.setDefaultCloseOperation(d.EXIT_ON_CLOSE);

		d.pack();
		d.setLocationRelativeTo(null);
		d.setVisible(true);
	}
}

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TicTacToe {

	private JFrame frame;
	private String m_previousMove = null;
	private JButton[][] m_allButtons = new JButton[3][3];
	private static String s_x = "x";
	private static String s_o = "o";
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TicTacToe() {

		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JButton Button1 = new JButton("");
		Button1.setBounds(0, 0, 144, 86);
		panel.add(Button1);
		m_allButtons[0][0]=Button1;

		JButton Button2 = new JButton("");
		Button2.setBounds(146, 0, 144, 86);
		panel.add(Button2);
		m_allButtons[0][1]=Button2;

		JButton Button3 = new JButton("");
		Button3.setBounds(290, 0, 144, 86);
		panel.add(Button3);
		m_allButtons[0][2]=Button3;

		JButton Button4 = new JButton("");
		Button4.setBounds(0, 85, 144, 86);
		panel.add(Button4);
		m_allButtons[1][0]=Button4;

		JButton Button5 = new JButton("");
		Button5.setBounds(146, 85, 144, 86);
		panel.add(Button5);
		m_allButtons[1][1]=Button5;

		JButton Button6 = new JButton("");
		Button6.setBounds(290, 85, 144, 86);
		panel.add(Button6);
		m_allButtons[1][2]=Button6;

		JButton Button7 = new JButton("");
		Button7.setBounds(0, 170, 144, 91);
		panel.add(Button7);
		m_allButtons[2][0]=Button7;

		JButton Button8 = new JButton("");
		Button8.setBounds(146, 172, 144, 89);
		panel.add(Button8);
		m_allButtons[2][1]=Button8;

		JButton Button9 = new JButton("");
		Button9.setBounds(290, 172, 144, 89);
		panel.add(Button9);
		m_allButtons[2][2]=Button9;
		AddAllEventHandlers();

	}

	private void ChangeButtonText(JButton button)
	{
		if (m_previousMove !=null)
		{
			if (m_previousMove.equals(s_o))
			{
				button.setText(s_x);
				m_previousMove = s_x;
			}
			else if (m_previousMove.equals(s_x))
			{
				button.setText(s_o);
				m_previousMove = s_o;
			}
		}
		else
		{
			button.setText(s_x);
			button.setEnabled(false);
			m_previousMove = s_x;
		}
	}
	private void DisableAllButtons()
	{
		if (m_allButtons  !=null)
		{
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					m_allButtons[i][j].setEnabled(false);

				}
			}
		}
	}



	private void CheckGameWinner()
	{
		if(m_allButtons !=null)
		{
			for (int i =0; i< 3; i++)
			{
				String one = m_allButtons[i][0].getText();
				String two = m_allButtons[i][1].getText();
				String three = m_allButtons[2][i].getText();

				boolean empty = one.isEmpty() || two.isEmpty() || three.isEmpty();

				if(! empty)
				{
					boolean same = (one == two) && (two == three);

					if (same)
					{
						m_allButtons[i][0].setBackground(Color.WHITE);
						m_allButtons[i][1].setBackground(Color.WHITE);
						m_allButtons[i][2].setBackground(Color.WHITE);
						DisableAllButtons();

					}
				}
			}

			for (int i = 0; i< 3; i++)
			{
				String one = m_allButtons[0][i].getText();
				String two = m_allButtons[1][i].getText();
				String three = m_allButtons[2][i].getText();

				boolean empty = one.isEmpty() || two.isEmpty() || three.isEmpty();

				if(! empty)
				{
					boolean same = (one == two) && (two == three);

					if (same)
					{
						m_allButtons[0][i].setBackground(Color.WHITE);
						m_allButtons[1][i].setBackground(Color.WHITE);
						m_allButtons[2][i].setBackground(Color.WHITE);
						DisableAllButtons();
					}
				}
			}
			String one = m_allButtons[0][0].getText();
			String two = m_allButtons[1][1].getText();
			String three = m_allButtons[2][2].getText();

			boolean diagonalOneSame = (one == two) && (two == three);

			if (diagonalOneSame)
			{
				m_allButtons[0][0].setBackground(Color.WHITE);
				m_allButtons[1][1].setBackground(Color.WHITE);
				m_allButtons[2][2].setBackground(Color.WHITE);
				DisableAllButtons();
			}


			String four = m_allButtons[0][2].getText();
			String five = m_allButtons[1][1].getText();
			String six = m_allButtons[2][0].getText();

			boolean diagonalTwoEmpty = four.isEmpty() || five.isEmpty() ||  six.isEmpty();

			if (! diagonalTwoEmpty)
			{
				boolean diagonalTwoSame = (four == five) && (five == six);

				if (diagonalTwoSame)
				{
					m_allButtons[2][0].setBackground(Color.WHITE);
					m_allButtons[1][1].setBackground(Color.WHITE);
					m_allButtons[0][2].setBackground(Color.WHITE);
					DisableAllButtons();

				}
			}
		}

	}


	private void AddAllEventHandlers()
	{
		if (m_allButtons != null)
		{
			for (int i = 0; i < 3; i++)
			{
				for (int j =0;j < 3; j++)
				{
					JButton button = m_allButtons[i][j];
					button.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent arg0)
						{
							ChangeButtonText(button);
							button.setEnabled(false);
							CheckGameWinner();
						}
					}); 
				}
			}
		}
	}
}
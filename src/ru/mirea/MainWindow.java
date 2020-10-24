package ru.mirea;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    JLabel score, lastScorer, winner;
    JButton acmButton, rmButton;

    int acmScore, rmScore;

    MainWindow() {
        super("Таблица результатов");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setLayout(null);
        setSize(300, 120);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(screenSize.width / 2 - getSize().width / 2, screenSize.height / 2 - getSize().height / 2);

        score = new JLabel("Result: 0 X 0");
        score.setBounds(100, 0, 300, 14);

        lastScorer = new JLabel("Last Scorer: N/A");
        lastScorer.setBounds(100, 14, 300, 14);

        winner = new JLabel("Winner: DRAW");
        winner.setBounds(100, 28, 300, 14);


        acmButton = new JButton("AC Milan");
        acmButton.setBounds(15, 46, 120, 30);
        acmButton.addActionListener(press -> increaseAcmScore());

        rmButton = new JButton("Real Madrid");
        rmButton.setBounds(150, 46, 120, 30);
        rmButton.addActionListener(press -> increaseRmScore());


        add(score);
        add(lastScorer);
        add(winner);

        add(acmButton);
        add(rmButton);
    }

    private void increaseAcmScore() {
        ++acmScore;
        score.setText("Result: " + acmScore + " X " + rmScore);
        lastScorer.setText("Last Scorer: AC Milan");
        defineWinner();
    }

    private void increaseRmScore() {
        ++rmScore;
        score.setText("Result: " + acmScore + " X " + rmScore);
        lastScorer.setText("Last Scorer: Real Madrid");
        defineWinner();
    }

    private void defineWinner() {
        if (acmScore > rmScore) {
            winner.setText("Winner: AC Milan");
        } else if (acmScore == rmScore) {
            winner.setText("Winner: DRAW");
        } else {
            winner.setText("Winner: Real Madrid");
        }
    }

    public void run() {
        setVisible(true);
    }
}

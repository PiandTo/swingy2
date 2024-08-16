package edu.school21.view;

import javax.swing.*;
import java.awt.*;

public class IntroductionGui extends JFrame {
    private final JButton buttonStart = new JButton("START");
    private final JButton buttonTutorial = new JButton("TUTORIAL");
    private final JButton buttonExit = new JButton("EXIT");

    public JButton getButtonStart() {
        return buttonStart;
    }

    public JButton getButtonTutorial() {
        return buttonTutorial;
    }

    public JButton getButtonExit() {
        return buttonExit;
    }

    public IntroductionGui(){
        super();
        setTitle("SWINGY GAME!");
        setSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        GridLayout grid = new GridLayout(3, 1);
        grid.setHgap(10);
        grid.setVgap(10);
        setLayout(grid);

        getButtonStart().setFocusable(false);
        getButtonTutorial().setFocusable(false);
        getButtonExit().setFocusable(false);

        getButtonStart().setFont(new Font(null, Font.BOLD,25));
        getButtonTutorial().setFont(new Font(null, Font.BOLD,25));
        getButtonExit().setFont(new Font(null, Font.BOLD,25));

        getButtonStart().setAlignmentX(Component.CENTER_ALIGNMENT);
        getButtonTutorial().setAlignmentX(Component.CENTER_ALIGNMENT);
        getButtonExit().setAlignmentX(Component.CENTER_ALIGNMENT);

        getButtonStart().setMargin(new Insets(10, 10, 5, 10));
        getButtonTutorial().setMargin(new Insets(5, 10, 5, 10));
        getButtonExit().setMargin(new Insets(5, 10, 10, 10));

        getButtonStart().setBackground(Color.YELLOW);
        getButtonTutorial().setBackground(Color.YELLOW);
        getButtonExit().setBackground(Color.YELLOW);

        getButtonStart().setOpaque(true);
        getButtonTutorial().setOpaque(true);
        getButtonExit().setOpaque(true);

        getButtonStart().setBorderPainted(false);
        getButtonTutorial().setBorderPainted(false);
        getButtonExit().setBorderPainted(false);

        add(this.buttonStart);
        add(this.buttonTutorial);
        add(this.buttonExit);
        setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

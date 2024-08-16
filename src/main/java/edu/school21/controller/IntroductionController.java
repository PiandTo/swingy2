package edu.school21.controller;

import edu.school21.view.IntroductionGui;
//import edu.school21.view.StartPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class IntroductionController implements ActionListener , MouseListener {
//    private IntroductionGui intro;

    public IntroductionController(IntroductionGui intro) {
//        this.intro = intro;
//
//        this.intro.getButtonStart().addActionListener(this);
//        this.intro.getButtonTutorial().addActionListener(this);
//        this.intro.getButtonExit().addActionListener(this);
//        this.intro.getButtonStart().addMouseListener(this);
//        this.intro.getButtonTutorial().addMouseListener(this);
//        this.intro.getButtonExit().addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == this.intro.getButtonStart()) {
//            this.intro.dispose();
////            new StartPageListener(new StartPage());
//        } else if (e.getSource() == this.intro.getButtonTutorial()) {
//
//        } else {
//            this.intro.dispose();
//            System.exit(0);
//        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        if (e.getSource() == this.intro.getButtonStart()) {
//            this.intro.getButtonStart().setBackground(Color.ORANGE);
//        } else if (e.getSource() == this.intro.getButtonTutorial()) {
//            this.intro.getButtonTutorial().setBackground(Color.ORANGE);
//        } else if (e.getSource() == this.intro.getButtonExit()){
//            this.intro.getButtonExit().setBackground(Color.ORANGE);
//        }
    }
//
    @Override
    public void mouseExited(MouseEvent e) {
//        if (e.getSource() == this.intro.getButtonStart()) {
//            this.intro.getButtonStart().setBackground(Color.YELLOW);
//        } else if (e.getSource() == this.intro.getButtonTutorial()) {
//            this.intro.getButtonTutorial().setBackground(Color.YELLOW);
//        } else if (e.getSource() == this.intro.getButtonExit()){
//            this.intro.getButtonExit().setBackground(Color.YELLOW);
//        }
    }
}

package com.mycompany.app;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MainPoszuk {

    JButton button = new JButton("Poszuk");
    JTextField findText = new JTextField(10);
    JTextArea textArea = new JTextArea(5, 20);
    JLabel label = new JLabel("Ilość: ");

    public static void main(String[] args) {
        List<String> zapisy = new ArrayList<>();

        String poszuk = "użyć";
        int amountPoszuk = 0;

        MainPoszuk mainPoszuk = new MainPoszuk();
            zapisy = mainPoszuk.readFile(args[0]);

        // pobierać plik lub przez swing przecytamy dane
        amountPoszuk = mainPoszuk.poszuk(zapisy, poszuk);
        //amountPoszuk -> jframe swing
        System.out.println("ilość : "+ amountPoszuk);
//        mainPoszuk.createWindow();
    }

    public int poszukSlowka(String zapisy, String zmianPoszuk) {
        int amount = 0;
        String[] tablica = zapisy.split(" ");
        for (int i = 0; i< tablica.length; i++) {
            if (tablica[i].equalsIgnoreCase(zmianPoszuk)) {
                amount ++;
            }
        }
        return amount;
    }

    public int poszuk(List<String> zapisy, String zmianPoszuk) {
        int amount = 0;
        if (zmianPoszuk == null || zmianPoszuk.isEmpty()) {
            throw new RuntimeException("tekst dla poszukiwania jest pusty");
        }
        if (zapisy == null || zapisy.isEmpty())  {
            throw new RuntimeException("tekst jest pusty");
        }
        for (Iterator<String> it = zapisy.iterator(); it.hasNext();) {
            amount += poszukSlowka(it.next(), zmianPoszuk);
        }
        return amount;
    }

    public void createWindow() {
        JFrame frame = new JFrame();
        frame.setBounds(10, 10, 300, 200);
        frame.setLayout(new FlowLayout());
        frame.add(panelLeft());
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public JPanel panelLeft() {
        JPanel panel = new JPanel();
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxlayout);
        panel.add(textArea);
        panel.add(findText);
        panel.add(label);
        return panel;
    }

    public List<String> readFile(String name) {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(name))) {
            list = bufferedReader.lines().collect(Collectors.toList());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return list;
    }
}

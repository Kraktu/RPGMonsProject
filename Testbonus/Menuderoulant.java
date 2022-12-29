import javax.swing.*;

public class DropDown {
    public static void main(String[] args) {
        String[] optionsToChoose = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};

        String getFavFruit = (String) JOptionPane.showInputDialog(
                null,
                "What fruit do you like the most?",
                "Choose Fruit",
                JOptionPane.QUESTION_MESSAGE,
                null,
                optionsToChoose,
                optionsToChoose[3]);

        System.out.println("Your chosen fruit: " + getFavFruit);
    }
}



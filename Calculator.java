import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Calculator {
    private double Result;
    private double num1 = 0.0;
    private double num2;
    private JLabel mainDisplay;
    private JPanel Standard_Calculator;
    private JButton Seven_Button;
    private JButton Four_Button;
    private JButton One_Button;
    private JButton button5;
    private JButton One_By_X_Button;
    private JButton x2_Button;
    private JButton Eight_Button;
    private JButton Five_Button;
    private JButton Two_Button;
    private JButton Zero_Button;
    private JButton a2sqrtXButton;
    private JButton Nine_Button;
    private JButton Six_Button;
    private JButton Three_Button;
    private JButton Point_Button;
    private JButton Divide_Button;
    private JButton Multiply_Button;
    private JButton Subtract_Button;
    private JButton Plus_Button;
    private JButton Equals_Button;
    private JButton PieButton;
    private JButton e_Button;
    private JButton CEButton;
    private JButton clear_By_One;

    DecimalFormat format = new DecimalFormat("0.#");

    Boolean dotFlag = false;
    Boolean addFlag = false;
    Boolean subFlag = false;
    Boolean mulFlag = false;
    Boolean divFlag = false;
    Boolean resultFlag = false;

    public Calculator() {
        PieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainDisplay.setText("3.1415926535897932384626433832795");
            }
        });
        e_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainDisplay.setText("2.7182818284590452353602874713527");
            }
        });
        CEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainDisplay.setText("");
            }
        });

        clear_By_One.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resultFlag == true) {
                    mainDisplay.setText("");
                    resultFlag = false;
                } else if (mainDisplay.getText().length() == 0) {
                    mainDisplay.setText("");
                } else {
                    String mainString = mainDisplay.getText();
                    mainDisplay.setText(mainString.substring(0, mainString.length() - 1));
                }
            }
        });

        One_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resultFlag == true) {
                    mainDisplay.setText(One_Button.getText());
                    resultFlag = false;
                } else {
                    String Current_Text = mainDisplay.getText() + One_Button.getText();
                    mainDisplay.setText(Current_Text);
                }
            }
        });
        Two_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resultFlag == true) {
                    mainDisplay.setText(Two_Button.getText());
                    resultFlag = false;
                } else {
                    String Current_Text = mainDisplay.getText() + Two_Button.getText();
                    mainDisplay.setText(Current_Text);
                }
            }
        });
        Three_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resultFlag == true) {
                    mainDisplay.setText(Three_Button.getText());
                    resultFlag = false;
                } else {
                    String Current_Text = mainDisplay.getText() + Three_Button.getText();
                    mainDisplay.setText(Current_Text);
                }
            }
        });
        Four_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resultFlag == true) {
                    mainDisplay.setText(Four_Button.getText());
                    resultFlag = false;
                } else {
                    String Current_Text = mainDisplay.getText() + Four_Button.getText();
                    mainDisplay.setText(Current_Text);
                }
            }
        });
        Five_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resultFlag == true) {
                    mainDisplay.setText(Five_Button.getText());
                    resultFlag = false;
                } else {
                    String Current_Text = mainDisplay.getText() + Five_Button.getText();
                    mainDisplay.setText(Current_Text);
                }
            }
        });
        Six_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resultFlag == true) {
                    mainDisplay.setText(Six_Button.getText());
                    resultFlag = false;
                } else {
                    String Current_Text = mainDisplay.getText() + Six_Button.getText();
                    mainDisplay.setText(Current_Text);
                }
            }
        });
        Seven_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resultFlag == true) {
                    mainDisplay.setText(Seven_Button.getText());
                    resultFlag = false;
                } else {
                    String Current_Text = mainDisplay.getText() + Seven_Button.getText();
                    mainDisplay.setText(Current_Text);
                }
            }
        });
        Eight_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resultFlag == true) {
                    mainDisplay.setText(Eight_Button.getText());
                    resultFlag = false;
                } else {
                    String Current_Text = mainDisplay.getText() + Eight_Button.getText();
                    mainDisplay.setText(Current_Text);
                }
            }
        });
        Nine_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resultFlag == true) {
                    mainDisplay.setText(Nine_Button.getText());
                    resultFlag = true;
                } else {
                    String Current_Text = mainDisplay.getText() + Nine_Button.getText();
                    mainDisplay.setText(Current_Text);
                }
            }
        });
        Zero_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resultFlag == true) {
                    mainDisplay.setText(Zero_Button.getText());
                } else {
                    String Current_Text = mainDisplay.getText() + Zero_Button.getText();
                    mainDisplay.setText(Current_Text);
                }
            }
        });
        Point_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (mainDisplay.getText() == "") {
                    mainDisplay.setText("0.");
                } else if (resultFlag == true) {
                    mainDisplay.setText("0.");
                } else if (mainDisplay.getText().contains(".")) {
                } else {
                    String Current_Text = mainDisplay.getText() + Point_Button.getText();
                    mainDisplay.setText(Current_Text);
                }

            }
        });


        Plus_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                num1 = num1 + Double.parseDouble(mainDisplay.getText());
                mainDisplay.setText("");
                addFlag = true;

            }
        });
        Subtract_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = num1 - Double.parseDouble(mainDisplay.getText());
                mainDisplay.setText("");
                subFlag = true;
            }
        });
        Multiply_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(mainDisplay.getText());
                mainDisplay.setText("");
                mulFlag = true;
            }
        });
        Divide_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(mainDisplay.getText());
                mainDisplay.setText("");
                mulFlag = true;
            }
        });
        Equals_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(mainDisplay.getText());
                if (addFlag == true) {
                    Result = num1 + num2;
                } else if (subFlag == true) {
                    Result = num1 - num2;
                } else if (mulFlag == true) {
                    Result = num1 * num2;
                } else if (divFlag == true) {
                    Result = num1 / num2;
                }


                mainDisplay.setText(format.format(Result));
                addFlag = false;
                subFlag = false;
                mulFlag = false;
                divFlag = false;
                resultFlag = true;
            }
        });


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame(" Simple Calculator");
        frame.setContentPane(new Calculator().Standard_Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}



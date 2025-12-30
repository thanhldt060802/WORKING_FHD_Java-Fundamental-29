import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {
    private JTextField display;
    private JPanel buttonPanel;
    private double firstNumber = 0;
    private String operator = "";
    private boolean startNewNumber = true;

    public SimpleCalculator() {
        setTitle("Máy Tính Đơn Giản");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout(10, 10));

        // Màn hình hiển thị
        display = new JTextField("0");
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        // Panel chứa các nút
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));
        
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        // Tạo các nút và gán Listener (thể hiện tính trừu tượng)
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            
            // Sử dụng Anonymous Inner Class - một cách implement interface trừu tượng
            // button.addActionListener(new ActionListener() {
            //     @Override
            //     public void actionPerformed(ActionEvent e) {
            //         // handleButtonClick(text);
            //         System.out.println("Hello world");
            //     }
            // });
            MyActionListener myActionListener = new MyActionListener();
            button.addActionListener(myActionListener);
            
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
        setLocationRelativeTo(null);
    }

    // Xử lý sự kiện click nút
    private void handleButtonClick(String buttonText) {
        if (buttonText.matches("[0-9]")) {
            // Nút số
            if (startNewNumber) {
                display.setText(buttonText);
                startNewNumber = false;
            } else {
                display.setText(display.getText() + buttonText);
            }
        } else if (buttonText.equals("C")) {
            // Nút Clear
            display.setText("0");
            firstNumber = 0;
            operator = "";
            startNewNumber = true;
        } else if (buttonText.equals("=")) {
            // Nút bằng
            calculateResult();
        } else {
            // Các nút phép tính
            if (!operator.isEmpty()) {
                calculateResult();
            }
            firstNumber = Double.parseDouble(display.getText());
            operator = buttonText;
            startNewNumber = true;
        }
    }

    // Tính toán kết quả
    private void calculateResult() {
        if (operator.isEmpty()) return;
        
        double secondNumber = Double.parseDouble(display.getText());
        double result = 0;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    display.setText("Lỗi");
                    startNewNumber = true;
                    return;
                }
                break;
        }

        display.setText(String.valueOf(result));
        operator = "";
        startNewNumber = true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleCalculator calc = new SimpleCalculator();
            calc.setVisible(true);
        });
    }
}
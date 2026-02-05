import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleWindow {
    public static void main(String[] args) {
        // Tạo cửa sổ (JFrame)
        JFrame frame = new JFrame("Màn hình đơn giản");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Tạo nút (JButton)
        JButton button = new JButton("Click Me!");
        button.setFont(new Font("Arial", Font.BOLD, 16));
        
        // Xử lý sự kiện khi click nút
        // button.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         JOptionPane.showMessageDialog(frame, "Bạn đã click nút!");
        //     }
        // });

        // AnnouncementAction announcementAction = new AnnouncementAction();
        // button.addActionListener(announcementAction);

        ActionListener announcementAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Goodbye world");
            }
        };
        button.addActionListener(announcementAction);
        
        // Sử dụng BorderLayout để đặt nút ở giữa
        frame.setLayout(new FlowLayout());
        frame.add(button);
        
        // Hiển thị cửa sổ ở giữa màn hình
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

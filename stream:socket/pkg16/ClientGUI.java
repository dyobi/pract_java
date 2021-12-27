package pkg16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ClientGUI extends JFrame implements Runnable, ActionListener {

    // 3 args from console mode
    DataOutputStream outputStream;
    DataInputStream inputStream;
    String nickname;

    // GUI components
    JLabel jLabel = new JLabel("우리반 채팅~~~");
    JTextArea jTextArea = new JTextArea();
    JTextField jTextField = new JTextField();
    JScrollPane jScrollPane = new JScrollPane(jTextArea);

    Toolkit toolkit = Toolkit.getDefaultToolkit();

    public ClientGUI(DataOutputStream outputStream, DataInputStream inputStream, String nickname) {
        this.outputStream = outputStream;
        this.inputStream = inputStream;
        this.nickname = nickname;

        setLayout(new BorderLayout());
        jLabel.setFont(new Font("굴림", Font.BOLD, 22));
        add("North", jLabel); // 우리반 채팅

        // chat  문자열이 출력되는 곳
        jTextArea.setBackground(Color.yellow);
        jTextArea.setForeground(Color.blue); // 노랑 배경위에 파랑 글씨
        jTextArea.setFont(new Font("굴림", Font.BOLD, 22));
        jTextArea.setEditable(false); // 편집 x
        add("Center", jScrollPane);

        // chat 입력
        jTextField.setBackground(Color.white);
        jTextField.setForeground(Color.BLACK);
        jTextField.setFont(new Font("굴림", Font.BOLD, 25));
        add("South", jTextField);
        jTextField.addActionListener(this);

        setSize(800, 800);
        setVisible(true);

        // 창문 닫기
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0); // 이걸 해주어야 퇴장~~이라는 메시지가 나옴 // 2명 이상일때
                setVisible(false);
            }
        });

        Thread thread = new Thread(this);
        thread.start();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jTextField) {
            try {
                outputStream.writeUTF(nickname + " ---> " + jTextField.getText());
                // nickname 과 client 의 chat 을 서버로
            } catch (IOException eee) {
                eee.printStackTrace();
            }
            jTextField.setText("");
        }
    }

    public void run() {
        try {
            while (true) {
                String str = inputStream.readUTF();
                if (str == null) {
                    jTextArea.append("\n" + "종료");
                    return;
                } else {
                    jTextArea.append("\n" + str); // 서버에서 온것 textarea 에 추가
                    int end = jTextArea.getText().length();
                    jTextArea.setCaretPosition(end); //커서를 맨 뒤로
                    // jTextArea.setCaretPosition(0) -> 커서를 맨 첨에
                    toolkit.beep();
                }
            }
        } catch (Exception eee) {
            jTextArea.append("\n" + eee);
        }
    }

}

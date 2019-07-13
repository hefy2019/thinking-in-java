package com.hefy.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import net.mindview.util.Countries;
import static net.mindview.util.SwingConsole.run;

/**
 * @author hefy:
 * @date 2019年7月13日 下午12:06:09
 * @version 1.0 类说明 文本区域
 */
public class Test_8_TextArea extends JFrame {
	private JButton b = new JButton("Add Data"), c = new JButton("Clear Data");
	private JTextArea t = new JTextArea(20, 40);
	private Map<String, String> m = new HashMap<String, String>();

	public Test_8_TextArea() {
		m.putAll(Countries.capitals());
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (Map.Entry me : m.entrySet())
					t.append(me.getKey() + ":" + me.getValue() + "\n");
			}
		});
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.setText("");
			}
		});
		setLayout(new FlowLayout());
		add(new JScrollPane(t));
		add(b);
		add(c);
	}

	public static void main(String[] args) {
		run(new Test_8_TextArea(), 475, 425);
	}
}

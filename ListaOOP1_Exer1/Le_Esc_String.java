package ListaOOP1_Exer1;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Le_Esc_String {
    static List<String> strings = new ArrayList<String>();

    public static String LerString(String message) {
        return JOptionPane.showInputDialog(message);
    }

    public static void ResetString() {
        strings.clear();
    }

    public static void EscreverString(String message) {
        strings.add(message);
    }

    public static void PrintString() {
        String str = String.join("\n", strings);
        JOptionPane.showMessageDialog(null, str);
    }
}

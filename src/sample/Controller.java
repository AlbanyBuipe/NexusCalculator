package sample;

import javafx.scene.control.TextField;

public class Controller {

    // TextField Functions
    public static String getInput(TextField txt) {
        /*Takes a TextField obj and returns its content as String*/
        return txt.getText();
    }

    public static void setOutput(TextField txt, String res) {
        /* setOutput() requires two parameters:
        TextField obj, txt, and String obj, res.
        It sets the text of txt to res.
         */
        txt.setText(res);
    }

    public static Boolean isValid(char ch, String txt) {
        /* isValid() requires two parameters: a char obj, ch,
         and a String obj, txt. The char ch, can be o, or any
         other character. Character o checks to see if there is
         no operator (e.g. +, -, ×, ÷) in txt; this is to ensure
         correct evaluation of functions like
         sin, cos, tan, !, sq. sqrt, inv., and log
         which are unary functions.

         Characters beside o check to see if txt has an operator.
         This is to ensure correct evaluation of functions
         associated with the operators*/
        Boolean res;
        switch (ch) {
            case 'o':
                if (!txt.contains("+") || !txt.contains("-") ||
                        !txt.contains("×") || !txt.contains("÷"))
                    res = true;
                else
                    res = false;
                break;
            default:
                if (txt.contains("+") || txt.contains("-") ||
                        txt.contains("×") || txt.contains("÷"))
                    res = true;
                else
                    res = false;
        }
        return res;
    }

    // Trig. Functions
    public static double sin(double x) {
        return Math.sin(x);
    }

    public static double sin(int x) {
        return Math.sin(x);
    }

    public static double cos(double x) {
        return Math.cos(x);
    }

    public static double cos(int x) {
        return Math.cos(x);
    }

    public static double tan(double x) {
        return Math.tan(x);
    }

    public static double tan(int x) {
        return Math.tan(x);
    }

    public static double factorial(int x) {
        if (x == 0 || x == 1)
            return 1;
        else
            return x * factorial(x - 1);
    }

    public static int sq(int x) {
        return x * x;
    }

    public static double sq(double x) {
        return x * x;
    }

    public static double sqrt(double x) {
        return Math.sqrt(x);
    }

    public static double sqrt(int x) {
        return Math.sqrt(x);
    }

    public static double inv(double x) {
        return 1 / x;
    }

    public static double inv(int x) {
        return 1 / (double) x;
    }

    public static double log(double x) {
        return Math.log10(x);
    }

    public static void clr(TextField txt) {
        txt.setText("");
    }

    private static char getOperator(String txt) {
        char ch = '0';
        if (txt.contains("+"))
            ch = txt.charAt(txt.indexOf("+"));
        if (txt.contains("-"))
            ch = txt.charAt(txt.indexOf("-"));
        if (txt.contains("×"))
            ch = txt.charAt(txt.indexOf("×"));
        if (txt.contains("÷"))
            ch = txt.charAt(txt.indexOf("÷"));
        return ch;
    }

    public static String sign(String txtStr) {
        char op = getOperator(txtStr);
        String val = txtStr.substring(txtStr.lastIndexOf(op) + 2);
        return "-" + val;
    }

    public static String signOrig(String txt) {
            if(!txt.equals("")) {
                char sign = txt.charAt(0);
                if(sign != '-') {
                    txt = "-" + txt;
                } else {
                    txt = txt.substring(1);
                }
            }
            return txt;
    }

    public static String signN(String txt) {
        if(txt.length() == 1)
            txt = "-" + txt;
        if(txt.length() == 4)
                txt = txt + "-";
        if(txt.charAt(4) == '-')
            txt = txt.substring(0, txt.length() - 1);
        return txt;
    }


    public static void main(String[] args) {
    }

}

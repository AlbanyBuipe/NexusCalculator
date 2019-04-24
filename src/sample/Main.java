package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    String input = "";
    double ans = 0;

    private TextField txtInput;
    private HBox row0;

    private Button btnSin;
    private Button btnCos;
    private Button btnTan;
    private Button btnFact;
    private HBox row1;

    private Button btnSqrt;
    private Button btnSq;
    private Button btnInv;
    private Button btnClr;
    private HBox row2;

    private Button btnPow;
    private Button btnLog;
    private Button btnBkSpace;
    private Button btnDiv;
    private HBox row3;

    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnTimes;
    private HBox row4;

    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btnMinus;
    private HBox row5;

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btnPlus;
    private HBox row6;

    private Button btnSign;
    private Button btn0;
    private Button btnDot;
    private Button btnEqual;
    private HBox row7;

    @Override
    public void start(Stage primaryStage) throws Exception {

        txtInput = new TextField();
        // txtInput.setText("0");
        txtInput.setEditable(false);
        txtInput.setAlignment(Pos.BOTTOM_RIGHT);
        txtInput.setMinSize(210, 50);
        row0 = new HBox();
        row0.getChildren().add(txtInput);

        btnSin = new Button("Sin");
        btnSin.setMinSize(50, 50);
        btnSin.setOnAction(event -> {
            if(!txtInput.getText().contains("=")) {
                if(!txtInput.getText().equals("")) {
                    if(txtInput.getText().contains(".")) {
                        double val = Double.parseDouble(txtInput.getText());
                        double res = Math.cos(val);
                        input = String.valueOf(res);
                        txtInput.setText("Sin(" + val + ") = " + input);
                    } else {
                        int val = Integer.parseInt(txtInput.getText());
                        double res = Math.cos(val);
                        input = String.valueOf(res);
                        txtInput.setText("Sin(" + val + ") = " + input);
                    }
                }
            }
        });

        btnCos = new Button("Cos");
        btnCos.setMinSize(50, 50);
        btnCos.setOnAction(event -> {
            if(!txtInput.getText().contains("=")) {
                if(!txtInput.getText().equals("")) {
                    if(txtInput.getText().contains(".")) {
                        double val = Double.parseDouble(txtInput.getText());
                        double res = Math.cos(val);
                        input = String.valueOf(res);
                        txtInput.setText("Cos(" + val + ") = " + input);
                    } else {
                        int val = Integer.parseInt(txtInput.getText());
                        double res = Math.cos(val);
                        input = String.valueOf(res);
                        txtInput.setText("Cos(" + val + ") = " + input);
                    }
                }
            }
        });

        btnTan = new Button("Tan");
        btnTan.setMinSize(50, 50);
        btnTan.setOnAction(event -> {
            if(!txtInput.getText().contains("=")) {
                if(!txtInput.getText().equals("")) {
                    if(txtInput.getText().contains(".")) {
                        double val = Double.parseDouble(txtInput.getText());
                        double res = Math.tan(val);
                        input = String.valueOf(res);
                        txtInput.setText("Tan(" + val + ") = " + input);
                    } else {
                        int val = Integer.parseInt(txtInput.getText());
                        double res = Math.tan(val);
                        input = String.valueOf(res);
                        txtInput.setText("Tan(" + val + ") = " + input);
                    }
                }
            }
        });

        btnFact = new Button("!");
        btnFact.setMinSize(50, 50);
        btnFact.setOnAction(event -> {
            if(!txtInput.getText().contains("=")) {
                if (!txtInput.getText().equals("")) {
                    int val = Integer.parseInt(txtInput.getText());
                    int res = factorialX(val);
                    input = String.valueOf(res);
                    txtInput.setText(val + "! = " + input);
                }
            }
        });

        row1 = new HBox();
        row1.getChildren().addAll(btnSin, btnCos, btnTan, btnFact);
        row1.setSpacing(3);

        btnSqrt = new Button("√");
        btnSqrt.setMinSize(50, 50);
        btnSqrt.setOnAction(event -> {
            if(!txtInput.getText().contains("=")) {
                if(!txtInput.getText().equals("")) {
                    if(txtInput.getText().contains(".")) {
                        double val = Double.parseDouble(txtInput.getText());
                        double res = Math.sqrt(val);
                        input = String.valueOf(res);
                        txtInput.setText("√" + val + " = " + input);
                    } else {
                        int val = Integer.parseInt(txtInput.getText());
                        double res = Math.sqrt(val);
                        input = String.valueOf(res);
                        txtInput.setText("√" + val + " = " + input);
                    }
                }
            }
        });

        btnSq = new Button("Sq.");
        btnSq.setMinSize(50, 50);
        btnSq.setOnAction(event -> {
            if(!txtInput.getText().contains("=")) {
                if(!txtInput.getText().equals("")) {
                    if(txtInput.getText().contains(".")) {
                        double val = Double.parseDouble(txtInput.getText());
                        double res = val * val;
                        input = String.valueOf(res);
                        txtInput.setText("Sq(" + val + ") = " + input);
                    } else {
                        int val = Integer.parseInt(txtInput.getText());
                        int res = val * val;
                        input = String.valueOf(res);
                        txtInput.setText("Sq(" + val + ") = " + input);
                    }
                }
            }
        });

        btnInv = new Button("Inv.");
        btnInv.setMinSize(50, 50);
        btnInv.setOnAction(event -> {
            if(!txtInput.getText().contains("=")) {
                if(!txtInput.getText().equals("")) {
                    if(!txtInput.getText().contains(".")) {
                        int val = Integer.parseInt(txtInput.getText());
                        double res = 1 / (double) val;
                        input = String.valueOf(res);
                        txtInput.setText("Inv(" + val + ") = " + input);
                    } else {
                        double val = Double.parseDouble(txtInput.getText());
                        double res = 1 / val;
                        input = String.valueOf(res);
                        txtInput.setText("Inv(" + val + ") = " + input);
                    }
                }
            }
        });

        btnClr = new Button("Clr");
        btnClr.setMinSize(50, 50);
        btnClr.setOnAction(event -> {
            input = "";
            txtInput.setText("");
        });

        row2 = new HBox();
        row2.getChildren().addAll(btnSqrt, btnSq, btnInv, btnClr);
        row2.setSpacing(3);

        btnPow = new Button("^");
        btnPow.setMinSize(50, 50);
        btnPow.setOnAction(event -> {
            input += btnPow.getText();
            txtInput.setText(input);
        });

        btnLog = new Button("log");
        btnLog.setMinSize(50, 50);
        btnLog.setOnAction(event -> {
            if(!txtInput.getText().contains("=")) {
                if(!txtInput.getText().equals("") && !txtInput.getText().equals("0")) {
                    if(txtInput.getText().contains(".")) {
                        double val = Double.parseDouble(txtInput.getText());
                        double res = Math.log10(val);
                        input = String.valueOf(res);
                        txtInput.setText("log(" + val + ") = " + input);
                    } else {
                        int val = Integer.parseInt(txtInput.getText());
                        double res = Math.log10(val);
                        input = String.valueOf(res);
                        txtInput.setText("log(" + val + ") = " + input);
                    }
                }
            }
        });

        btnBkSpace = new Button("←");
        btnBkSpace.setMinSize(50, 50);
        btnBkSpace.setOnAction(event -> {
            if(!txtInput.getText().equals("")) {
                String val = txtInput.getText();
                String res = val.substring(0, val.length() - 1);
                input = res;
                txtInput.setText(res);
            }
        });
        btnDiv = new Button(" ÷ ");
        btnDiv.setMinSize(50, 50);
        btnDiv.setOnAction(event -> {
            input += btnDiv.getText();
            txtInput.setText(input);
        });
//        btnDiv.setOnAction(event -> {
//            if(!txtInput.getText().equals("")) {
//                if(txtInput.getText().contains(" + ") || txtInput.getText().contains(" - ") ||
//                        txtInput.getText().contains(" × ") || txtInput.getText().contains(" ÷ ") ||
//                        txtInput.getText().contains(" ^ ") || txtInput.getText().contains(" = ")) {
//                    if(txtInput.getText().contains(" + ")) {
//                        if(txtInput.getText().contains(".")) {
//                            String[] val = txtInput.getText().split(" + ");
//                            double num1 = Double.parseDouble(val[0]);
//                            double num2 = Double.parseDouble(val[1]);
//                            double res = num1 + num2;
//                            ans = res;
//                            input += String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        } else {
//                            String[] val = txtInput.getText().split(" + ");
//                            int num1 = Integer.parseInt(val[0]);
//                            int num2 = Integer.parseInt(val[1]);
//                            int res = num1 + num2;
//                            ans = res;
//                            input += String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        }
//                    }
//                    if(txtInput.getText().contains(" - ")) {
//                        if(txtInput.getText().contains(".")) {
//                            String[] val = txtInput.getText().split(" - ");
//                            double num1 = Double.parseDouble(val[0]);
//                            double num2 = Double.parseDouble(val[1]);
//                            double res = num1 - num2;
//                            ans = res;
//                            input = String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        } else {
//                            String[] val = txtInput.getText().split(" - ");
//                            int num1 = Integer.parseInt(val[0]);
//                            int num2 = Integer.parseInt(val[1]);
//                            int res = num1 - num2;
//                            ans = res;
//                            input = String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        }
//                    }
//                    if(txtInput.getText().contains(" ÷ ")) {
//                        if(txtInput.getText().contains(".")) {
//                            String[] val = txtInput.getText().split(" ÷ ");
//                            double num1 = Double.parseDouble(val[0]);
//                            double num2 = Double.parseDouble(val[1]);
//                            double res = num1 / num2;
//                            ans = res;
//                            input = String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        } else {
//                            String[] val = txtInput.getText().split(" ÷ ");
//                            int num1 = Integer.parseInt(val[0]);
//                            int num2 = Integer.parseInt(val[1]);
//                            int res = num1 / num2;
//                            ans = res;
//                            input = String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        }
//                    }
//                    if(txtInput.getText().contains(" × ")) {
//                        if (txtInput.getText().contains(".")) {
//                            String[] val = txtInput.getText().split(" × ");
//                            double num1 = Double.parseDouble(val[0]);
//                            double num2 = Double.parseDouble(val[1]);
//                            double res = num1 * num2;
//                            ans = res;
//                            input = String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        } else {
//                            String[] val = txtInput.getText().split(" × ");
//                            int num1 = Integer.parseInt(val[0]);
//                            int num2 = Integer.parseInt(val[1]);
//                            int res = num1 * num2;
//                            ans = res;
//                            input = String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        }
//                    }
//                } else {
//                    if(!txtInput.getText().contains("×")) {
//                        input = txtInput.getText();
//                        input += btnTimes.getText();
//                        txtInput.setText(input);
//                    }
//                }
//            }
//        });

        row3 = new HBox();
        row3.getChildren().addAll(btnPow, btnLog, btnBkSpace, btnDiv);
        row3.setSpacing(3);

        btn7 = new Button("7");
        btn7.setMinSize(50, 50);
        btn7.setOnAction(event -> {
            input += btn7.getText();
            txtInput.setText(input);
        });
        btn8 = new Button("8");
        btn8.setMinSize(50, 50);
        btn8.setOnAction(event -> {
            input += btn8.getText();
            txtInput.setText(input);
        });
        btn9 = new Button("9");
        btn9.setMinSize(50, 50);
        btn9.setOnAction(event -> {
            input += btn9.getText();
            txtInput.setText(input);
        });
        btnTimes = new Button(" × ");
        btnTimes.setMinSize(50, 50);
        btnTimes.setOnAction(event -> {
            input += btnTimes.getText();
            txtInput.setText(input);
        });
//        btnTimes.setOnAction(event -> {
//            if(!txtInput.getText().equals("")) {
//                if(txtInput.getText().contains(" + ") || txtInput.getText().contains(" - ") ||
//                        txtInput.getText().contains(" × ") || txtInput.getText().contains(" ÷ ") ||
//                        txtInput.getText().contains(" ^ ") || txtInput.getText().contains(" = ")) {
//                    if(txtInput.getText().contains(" + ")) {
//                        if(txtInput.getText().contains(".")) {
//                            String[] val = txtInput.getText().split(" + ");
//                            double num1 = Double.parseDouble(val[0]);
//                            double num2 = Double.parseDouble(val[1]);
//                            double res = num1 + num2;
//                            ans = res;
//                            input += String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        } else {
//                            String[] val = txtInput.getText().split(" + ");
//                            int num1 = Integer.parseInt(val[0]);
//                            int num2 = Integer.parseInt(val[1]);
//                            int res = num1 + num2;
//                            ans = res;
//                            input += String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        }
//                    }
//                    if(txtInput.getText().contains(" - ")) {
//                        if(txtInput.getText().contains(".")) {
//                            String[] val = txtInput.getText().split(" - ");
//                            double num1 = Double.parseDouble(val[0]);
//                            double num2 = Double.parseDouble(val[1]);
//                            double res = num1 - num2;
//                            ans = res;
//                            input = String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        } else {
//                            String[] val = txtInput.getText().split(" - ");
//                            int num1 = Integer.parseInt(val[0]);
//                            int num2 = Integer.parseInt(val[1]);
//                            int res = num1 - num2;
//                            ans = res;
//                            input = String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        }
//                    }
//                    if(txtInput.getText().contains(" ÷ ")) {
//                        if(txtInput.getText().contains(".")) {
//                            String[] val = txtInput.getText().split(" ÷ ");
//                            double num1 = Double.parseDouble(val[0]);
//                            double num2 = Double.parseDouble(val[1]);
//                            double res = num1 / num2;
//                            ans = res;
//                            input = String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        } else {
//                            String[] val = txtInput.getText().split(" ÷ ");
//                            int num1 = Integer.parseInt(val[0]);
//                            int num2 = Integer.parseInt(val[1]);
//                            int res = num1 / num2;
//                            ans = res;
//                            input = String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        }
//                    }
//                    if(txtInput.getText().contains(" × ")) {
//                        if (txtInput.getText().contains(".")) {
//                            String[] val = txtInput.getText().split(" × ");
//                            double num1 = Double.parseDouble(val[0]);
//                            double num2 = Double.parseDouble(val[1]);
//                            double res = num1 * num2;
//                            ans = res;
//                            input = String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        } else {
//                            String[] val = txtInput.getText().split(" × ");
//                            int num1 = Integer.parseInt(val[0]);
//                            int num2 = Integer.parseInt(val[1]);
//                            int res = num1 * num2;
//                            ans = res;
//                            input = String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        }
//                    }
//                } else {
//                    if(!txtInput.getText().contains("×")) {
//                        input = txtInput.getText();
//                        input += btnTimes.getText();
//                        txtInput.setText(input);
//                    }
//                }
//            }
//        });

        row4 = new HBox();
        row4.getChildren().addAll(btn7, btn8, btn9, btnTimes);
        row4.setSpacing(3);

        btn4 = new Button("4");
        btn4.setMinSize(50, 50);
        btn4.setOnAction(event -> {
            input += btn4.getText();
            txtInput.setText(input);
        });
        btn5 = new Button("5");
        btn5.setMinSize(50, 50);
        btn5.setOnAction(event -> {
            input += btn5.getText();
            txtInput.setText(input);
        });
        btn6 = new Button("6");
        btn6.setMinSize(50, 50);
        btn6.setOnAction(event -> {
            input += btn6.getText();
            txtInput.setText(input);
        });
        btnMinus = new Button(" - ");
        btnMinus.setMinSize(50, 50);
        btnMinus.setOnAction(event -> {
            input += btnMinus.getText();
            txtInput.setText(input);
        });
//        btnMinus.setOnAction(event -> {
//            if(!txtInput.getText().equals("")) {
//                if(txtInput.getText().contains(" + ") || txtInput.getText().contains(" - ") ||
//                        txtInput.getText().contains(" × ") || txtInput.getText().contains(" ÷ ") ||
//                        txtInput.getText().contains(" ^ ") || txtInput.getText().contains(" = ")) {
//                    if(txtInput.getText().contains(" + ")) {
//                        if(txtInput.getText().contains(".")) {
//                            String[] val = txtInput.getText().split(" + ");
//                            double num1 = Double.parseDouble(val[0]);
//                            double num2 = Double.parseDouble(val[1]);
//                            double res = num1 + num2;
//                            ans = res;
//                            input += String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        } else {
//                            String[] val = txtInput.getText().split(" + ");
//                            int num1 = Integer.parseInt(val[0]);
//                            int num2 = Integer.parseInt(val[1]);
//                            int res = num1 + num2;
//                            ans = res;
//                            input += String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        }
//                    }
//                    if(txtInput.getText().contains(" - ")) {
//                        if(txtInput.getText().contains(".")) {
//                            String[] val = txtInput.getText().split(" - ");
//                            double num1 = Double.parseDouble(val[0]);
//                            double num2 = Double.parseDouble(val[1]);
//                            double res = num1 - num2;
//                            ans = res;
//                            input = String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        } else {
//                            String[] val = txtInput.getText().split(" - ");
//                            int num1 = Integer.parseInt(val[0]);
//                            int num2 = Integer.parseInt(val[1]);
//                            int res = num1 - num2;
//                            ans = res;
//                            input = String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        }
//                    }
//                    if(txtInput.getText().contains(" ÷ ")) {
//                        if(txtInput.getText().contains(".")) {
//                            String[] val = txtInput.getText().split(" ÷ ");
//                            double num1 = Double.parseDouble(val[0]);
//                            double num2 = Double.parseDouble(val[1]);
//                            double res = num1 / num2;
//                            ans = res;
//                            input = String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        } else {
//                            String[] val = txtInput.getText().split(" ÷ ");
//                            int num1 = Integer.parseInt(val[0]);
//                            int num2 = Integer.parseInt(val[1]);
//                            int res = num1 / num2;
//                            ans = res;
//                            input = String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        }
//                    }
//                    if(txtInput.getText().contains(" × ")) {
//                        if (txtInput.getText().contains(".")) {
//                            String[] val = txtInput.getText().split(" × ");
//                            double num1 = Double.parseDouble(val[0]);
//                            double num2 = Double.parseDouble(val[1]);
//                            double res = num1 * num2;
//                            ans = res;
//                            input = String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        } else {
//                            String[] val = txtInput.getText().split(" × ");
//                            int num1 = Integer.parseInt(val[0]);
//                            int num2 = Integer.parseInt(val[1]);
//                            int res = num1 * num2;
//                            ans = res;
//                            input = String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        }
//                    }
//                } else {
//                    if(!txtInput.getText().contains("×")) {
//                        input = txtInput.getText();
//                        input += btnTimes.getText();
//                        txtInput.setText(input);
//                    }
//                }
//            }
//        });


        row5 = new HBox();
        row5.getChildren().addAll(btn4, btn5, btn6, btnMinus);
        row5.setSpacing(3);

        btn1 = new Button("1");
        btn1.setMinSize(50, 50);
        btn1.setOnAction(event -> {
            input += btn1.getText();
            txtInput.setText(input);
        });
        btn2 = new Button("2");
        btn2.setMinSize(50, 50);
        btn2.setOnAction(event -> {
            input += btn2.getText();
            txtInput.setText(input);
        });
        btn3 = new Button("3");
        btn3.setMinSize(50, 50);
        btn3.setOnAction(event -> {
            input += btn3.getText();
            txtInput.setText(input);
        });
        btnPlus = new Button(" + ");
        btnPlus.setMinSize(50, 50);
        btnPlus.setOnAction(event -> {
            input += btnPlus.getText();
            txtInput.setText(input);
        });
//        btnPlus.setOnAction(event -> {
//            if(!txtInput.getText().equals("")) {
//                if(txtInput.getText().contains(" + ") || txtInput.getText().contains(" - ") ||
//                        txtInput.getText().contains(" × ") || txtInput.getText().contains(" ÷ ") ||
//                        txtInput.getText().contains(" ^ ") || txtInput.getText().contains(" = ")) {
//                    if(txtInput.getText().contains(" + ")) {
//                        if(txtInput.getText().contains(".")) {
//                            String[] val = txtInput.getText().split(" + ");
//                            double num1 = Double.parseDouble(val[0]);
//                            double num2 = Double.parseDouble(val[1]);
//                            double res = num1 + num2;
//                            ans = res;
//                            input += String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        } else {
//                            String[] val = txtInput.getText().split(" + ");
//                            int num1 = Integer.parseInt(val[0]);
//                            int num2 = Integer.parseInt(val[1]);
//                            int res = num1 + num2;
//                            ans = res;
//                            input += String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        }
//                    }
//                    if(txtInput.getText().contains(" - ")) {
//                        if(txtInput.getText().contains(".")) {
//                            String[] val = txtInput.getText().split(" - ");
//                            double num1 = Double.parseDouble(val[0]);
//                            double num2 = Double.parseDouble(val[1]);
//                            double res = num1 - num2;
//                            ans = res;
//                            input = String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        } else {
//                            String[] val = txtInput.getText().split(" - ");
//                            int num1 = Integer.parseInt(val[0]);
//                            int num2 = Integer.parseInt(val[1]);
//                            int res = num1 - num2;
//                            ans = res;
//                            input = String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        }
//                    }
//                    if(txtInput.getText().contains(" ÷ ")) {
//                        if(txtInput.getText().contains(".")) {
//                            String[] val = txtInput.getText().split(" ÷ ");
//                            double num1 = Double.parseDouble(val[0]);
//                            double num2 = Double.parseDouble(val[1]);
//                            double res = num1 / num2;
//                            ans = res;
//                            input = String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        } else {
//                            String[] val = txtInput.getText().split(" ÷ ");
//                            int num1 = Integer.parseInt(val[0]);
//                            int num2 = Integer.parseInt(val[1]);
//                            int res = num1 / num2;
//                            ans = res;
//                            input = String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        }
//                    }
//                    if(txtInput.getText().contains(" × ")) {
//                        if (txtInput.getText().contains(".")) {
//                            String[] val = txtInput.getText().split(" × ");
//                            double num1 = Double.parseDouble(val[0]);
//                            double num2 = Double.parseDouble(val[1]);
//                            double res = num1 * num2;
//                            ans = res;
//                            input = String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        } else {
//                            String[] val = txtInput.getText().split(" × ");
//                            int num1 = Integer.parseInt(val[0]);
//                            int num2 = Integer.parseInt(val[1]);
//                            int res = num1 * num2;
//                            ans = res;
//                            input = String.valueOf(res);
//                            txtInput.setText(input);
//                            // input = "";
//                        }
//                    }
//                } else {
//                    if(!txtInput.getText().contains("×")) {
//                        input = txtInput.getText();
//                        input += btnTimes.getText();
//                        txtInput.setText(input);
//                    }
//                }
//            }
//        });

        row6 = new HBox();
        row6.getChildren().addAll(btn1, btn2, btn3, btnPlus);
        row6.setSpacing(3);

        btnSign = new Button("±");
        btnSign.setMinSize(50, 50);
        btnSign.setOnAction(event -> {
            if(!txtInput.getText().equals("")) {
                char sign = txtInput.getText().charAt(0);
                if(sign != '-') {
                    input = "-" + input;
                } else {
                    input = input.substring(1, input.length());
                }
                txtInput.setText(input);
            }
        });
        btn0 = new Button("0");
        btn0.setMinSize(50, 50);
        btn0.setOnAction(event -> {
            input += btn0.getText();
            txtInput.setText(input);
        });
        btnDot = new Button(".");
        btnDot.setMinSize(50, 50);
        btnDot.setOnAction(event -> {
            if(txtInput.getText().equals("")) {
                input = "0" + btnDot.getText();
                txtInput.setText(input);
            } else {
                if(!txtInput.getText().contains(".")) {
                    input += btnDot.getText();
                    txtInput.setText(input);
                } else {
                    if(txtInput.getText().contains("+") || txtInput.getText().contains("-") ||
                            txtInput.getText().contains("×") || txtInput.getText().contains("÷")) {
                        String valPl = input.substring(input.lastIndexOf('+'), input.length());
                        if(!valPl.contains(".")) {
                            input += btnDot.getText();
                            txtInput.setText(input);
                        }
                    }
                }
            }
        });
        btnEqual = new Button(" = ");
        btnEqual.setDefaultButton(true);
        btnEqual.setMinSize(50, 50);

        row7 = new HBox();
        row7.getChildren().addAll(btnSign, btn0, btnDot, btnEqual);
        row7.setSpacing(3);

        GridPane root = new GridPane();
        root.addRow(0, row0);
        root.addRow(1, row1);
        root.addRow(2, row2);
        root.addRow(3, row3);
        root.addRow(4, row4);
        root.addRow(5, row5);
        root.addRow(6, row6);
        root.addRow(7, row7);

        root.setAlignment(Pos.CENTER);
        root.setVgap(3);

        Scene scene = new Scene(root, 225, 435);

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Calculator");
        primaryStage.show();

    }

    private int factorialX(int x) {
        if (x == 0 || x == 1)
            return 1;
        else
            return x * factorialX(x - 1);
    }


    public static void main(String[] args) {
        launch(args);
    }
}

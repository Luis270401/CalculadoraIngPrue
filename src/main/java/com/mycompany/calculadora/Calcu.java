
package com.mycompany.calculadora;

public class Calcu extends javax.swing.JFrame {
    //declaracion de variables (numeros a sumar )
    double num1,num2;
    String signo; //Variable para el signo
    
    //Constructor
    public Calcu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Pantalla = new javax.swing.JLabel();
        BtnLimpiar = new javax.swing.JButton();
        BtnDivision = new javax.swing.JButton();
        BtnMultiplicacion = new javax.swing.JButton();
        BtnResta = new javax.swing.JButton();
        BtnSiete = new javax.swing.JButton();
        BtnOcho = new javax.swing.JButton();
        BtnNueve = new javax.swing.JButton();
        BtnSuma = new javax.swing.JButton();
        BtnCinco = new javax.swing.JButton();
        BtnCuatro = new javax.swing.JButton();
        BtnSeis = new javax.swing.JButton();
        BtnDos = new javax.swing.JButton();
        BtnUno = new javax.swing.JButton();
        BtnTres = new javax.swing.JButton();
        BtnIgual = new javax.swing.JButton();
        BtnCero = new javax.swing.JButton();
        btnPuntoDecimal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        Pantalla.setBackground(new java.awt.Color(255, 255, 255));
        Pantalla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Pantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Pantalla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        Pantalla.setOpaque(true);

        BtnLimpiar.setText("C");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnDivision.setText("/");
        BtnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDivisionActionPerformed(evt);
            }
        });

        BtnMultiplicacion.setText("X");
        BtnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultiplicacionActionPerformed(evt);
            }
        });

        BtnResta.setText("-");
        BtnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRestaActionPerformed(evt);
            }
        });

        BtnSiete.setText("7");
        BtnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSieteActionPerformed(evt);
            }
        });

        BtnOcho.setText("8");
        BtnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOchoActionPerformed(evt);
            }
        });

        BtnNueve.setText("9");
        BtnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNueveActionPerformed(evt);
            }
        });

        BtnSuma.setText("+");
        BtnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSumaActionPerformed(evt);
            }
        });

        BtnCinco.setText("5");
        BtnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCincoActionPerformed(evt);
            }
        });

        BtnCuatro.setText("4");
        BtnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCuatroActionPerformed(evt);
            }
        });

        BtnSeis.setText("6");
        BtnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeisActionPerformed(evt);
            }
        });

        BtnDos.setText("2");
        BtnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDosActionPerformed(evt);
            }
        });

        BtnUno.setText("1");
        BtnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUnoActionPerformed(evt);
            }
        });

        BtnTres.setText("3");
        BtnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTresActionPerformed(evt);
            }
        });

        BtnIgual.setText("=");
        BtnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIgualActionPerformed(evt);
            }
        });

        BtnCero.setText("0");
        BtnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCeroActionPerformed(evt);
            }
        });

        btnPuntoDecimal.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnPuntoDecimal.setText(".");
        btnPuntoDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoDecimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Pantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BtnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnTres, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(btnPuntoDecimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BtnSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnCero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPuntoDecimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(BtnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //funcion para limpiar la pantalla
    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        // TODO add your handling code here:
        Pantalla.setText("");
    }//GEN-LAST:event_BtnLimpiarActionPerformed
    
    //funcion que realiza division 
    private void BtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDivisionActionPerformed
        // TODO add your handling code here:
        num1=Double.parseDouble(Pantalla.getText());
        signo="/";
        Pantalla.setText("");
    }//GEN-LAST:event_BtnDivisionActionPerformed
    
    //funcion que realiza suma
    private void BtnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSumaActionPerformed
        // TODO add your handling code here:
        num1=Double.parseDouble(Pantalla.getText());
        signo="+";
        //Pantalla.setText("");
        Pantalla.setText("+");
    }//GEN-LAST:event_BtnSumaActionPerformed

    private void BtnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCeroActionPerformed
        // TODO add your handling code here:
        Pantalla.setText(Pantalla.getText()+"0");
    }//GEN-LAST:event_BtnCeroActionPerformed

    private void BtnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUnoActionPerformed
        // TODO add your handling code here:
        Pantalla.setText(Pantalla.getText()+"1");
    }//GEN-LAST:event_BtnUnoActionPerformed

    private void BtnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDosActionPerformed
        // TODO add your handling code here:
        Pantalla.setText(Pantalla.getText()+"2");
    }//GEN-LAST:event_BtnDosActionPerformed

    private void BtnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTresActionPerformed
        // TODO add your handling code here:
        Pantalla.setText(Pantalla.getText()+"3");
    }//GEN-LAST:event_BtnTresActionPerformed

    private void BtnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCuatroActionPerformed
        // TODO add your handling code here:
        Pantalla.setText(Pantalla.getText()+"4");
    }//GEN-LAST:event_BtnCuatroActionPerformed

    private void BtnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCincoActionPerformed
        // TODO add your handling code here:
        Pantalla.setText(Pantalla.getText()+"5");
    }//GEN-LAST:event_BtnCincoActionPerformed

    private void BtnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeisActionPerformed
        // TODO add your handling code here:
        Pantalla.setText(Pantalla.getText()+"6");
    }//GEN-LAST:event_BtnSeisActionPerformed

    private void BtnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSieteActionPerformed
        // TODO add your handling code here:
        Pantalla.setText(Pantalla.getText()+"7");
    }//GEN-LAST:event_BtnSieteActionPerformed

    private void BtnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOchoActionPerformed
        // TODO add your handling code here:
        Pantalla.setText(Pantalla.getText()+"8");
    }//GEN-LAST:event_BtnOchoActionPerformed

    private void BtnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNueveActionPerformed
        // TODO add your handling code here:
        Pantalla.setText(Pantalla.getText()+"9");
    }//GEN-LAST:event_BtnNueveActionPerformed

    //funcion que realiza multiplicacion
    private void BtnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMultiplicacionActionPerformed
        // TODO add your handling code here:
        num1=Double.parseDouble(Pantalla.getText());
        signo="*";
        Pantalla.setText("");
    }//GEN-LAST:event_BtnMultiplicacionActionPerformed

    //funcion que realiza resta
    private void BtnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRestaActionPerformed
        // TODO add your handling code here:
        num1=Double.parseDouble(Pantalla.getText());
        signo="-";
        Pantalla.setText("");
    }//GEN-LAST:event_BtnRestaActionPerformed

    //Funcion para el boton del igual que nos da el resultado
    private void BtnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIgualActionPerformed
        
        //declaracion del segundo numero
        num2=Double.parseDouble(Pantalla.getText());
        double resultado, redondeo;
        
        //Realizamos esta condicion para definir la operacion que el usuario selecciono
        switch(signo){
            case "+":
                Pantalla.setText("");
                resultado = num1 + num2;
                redondeo = Math.round(resultado * 100.0) / 100.0;
                
                Pantalla.setText(Double.toString(redondeo));
                break;
                
            case "-":
                resultado = num1 - num2;
                redondeo = Math.round(resultado * 100.0) / 100.0;
                
                Pantalla.setText(Double.toString(redondeo));
                break;
                
            case "*":
                resultado = num1 * num2;
                redondeo = Math.round(resultado * 100.0) / 100.0;
                
                Pantalla.setText(Double.toString(redondeo));
                break;
            case "/":
                resultado = num1 / num2;
                redondeo = Math.round(resultado * 100.0) / 100.0;
                
                Pantalla.setText(Double.toString(redondeo));
                break;
        }
    }//GEN-LAST:event_BtnIgualActionPerformed
    
    //Funcion para boton del punto decimal
    private void btnPuntoDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoDecimalActionPerformed
        //Pantalla.setText(Pantalla.getText()+".");
        
        String cadena;
        cadena = Pantalla.getText();
        
        if (cadena.length() <= 0){
            Pantalla.setText("0.");
        }else{
            if (!ExistePunto(Pantalla.getText())){
                Pantalla.setText(Pantalla.getText() + ".");
            }
        }
        
        
    }//GEN-LAST:event_btnPuntoDecimalActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCero;
    private javax.swing.JButton BtnCinco;
    private javax.swing.JButton BtnCuatro;
    private javax.swing.JButton BtnDivision;
    private javax.swing.JButton BtnDos;
    private javax.swing.JButton BtnIgual;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnMultiplicacion;
    private javax.swing.JButton BtnNueve;
    private javax.swing.JButton BtnOcho;
    private javax.swing.JButton BtnResta;
    private javax.swing.JButton BtnSeis;
    private javax.swing.JButton BtnSiete;
    private javax.swing.JButton BtnSuma;
    private javax.swing.JButton BtnTres;
    private javax.swing.JButton BtnUno;
    private javax.swing.JLabel Pantalla;
    private javax.swing.JButton btnPuntoDecimal;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
    //Metodo que nos permite validar que no se repita el punto decimal
    public static boolean ExistePunto(String cadena) {
        boolean resultado;
        resultado = false;
        
        for (int i=0; i<cadena.length(); i++){
            if (cadena.substring(i, i+1).equals(".")){
                resultado = true;
                break;
            }
        }
        
        return resultado;
    }
    
    
}

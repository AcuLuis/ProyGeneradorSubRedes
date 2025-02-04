package Main;
import java.awt.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
public class IU_Generador extends javax.swing.JFrame {
    public IU_Generador() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.rbtn_decimal.setSelected(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_opciones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Mascara = new javax.swing.JTextField();
        txt_IP = new javax.swing.JTextField();
        btn_Ejecutar = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        txt_validar = new javax.swing.JButton();
        scrollpanel = new javax.swing.JScrollPane();
        lbl_mostrar = new javax.swing.JTextArea();
        rbtn_decimal = new javax.swing.JRadioButton();
        rbtn_binario = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("GENERADOR DE SUBREDES");

        jLabel2.setText("Ingresar IP");

        jLabel3.setText("Mascara de Red");

        txt_IP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IPActionPerformed(evt);
            }
        });

        btn_Ejecutar.setText("Ejecutar");
        btn_Ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EjecutarActionPerformed(evt);
            }
        });

        btn_Limpiar.setText("Limpiar");
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });

        txt_validar.setText("validar");
        txt_validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_validarActionPerformed(evt);
            }
        });

        lbl_mostrar.setColumns(20);
        lbl_mostrar.setRows(5);
        scrollpanel.setViewportView(lbl_mostrar);

        grupo_opciones.add(rbtn_decimal);
        rbtn_decimal.setText("Decimal");

        grupo_opciones.add(rbtn_binario);
        rbtn_binario.setText("Binario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollpanel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_IP, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                    .addComponent(txt_Mascara))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_Limpiar)
                                    .addComponent(txt_validar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtn_binario)
                            .addComponent(rbtn_decimal))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(rbtn_decimal)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_IP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Limpiar)
                                    .addComponent(rbtn_binario))
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_Mascara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_validar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btn_Ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(scrollpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void txt_IPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IPActionPerformed
        
    }//GEN-LAST:event_txt_IPActionPerformed
    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        this.txt_IP.setText("");
        this.txt_Mascara.setText("");
        this.lbl_mostrar.setText("");
    }//GEN-LAST:event_btn_LimpiarActionPerformed
    private boolean esIPValida(String ip) {
        if (this.rbtn_binario.isSelected()) {
            String binarioRegex = "^([01]{8}\\.){3}[01]{8}$";
            return ip.matches(binarioRegex);
        } else {
            String ipRegex = "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)(\\.|$)){4}$";
            return ip.matches(ipRegex);
        }
    }

    private boolean esMascaraValida(String mask) {
        if (this.rbtn_binario.isSelected(   )) {
            String binarioRegex = "^([01]{8}\\.){3}[01]{8}$";
            if (!mask.matches(binarioRegex)) {
                return false;
            }
            mask = convertirBinarioADecimal(mask);
        }
        String cidrRegex = "^/(\\d|[1-2]\\d|3[0-2])$";
        if (mask.matches(cidrRegex)) {
            return true;
        }
        String[] mascarasValidas = {
            "128.0.0.0", "192.0.0.0", "224.0.0.0", "240.0.0.0", "248.0.0.0",
            "252.0.0.0", "254.0.0.0", "255.0.0.0", "255.128.0.0", "255.192.0.0",
            "255.224.0.0", "255.240.0.0", "255.248.0.0", "255.252.0.0", "255.254.0.0",
            "255.255.0.0", "255.255.128.0", "255.255.192.0", "255.255.224.0",
            "255.255.240.0", "255.255.248.0", "255.255.252.0", "255.255.254.0",
            "255.255.255.0", "255.255.255.128", "255.255.255.192", "255.255.255.224",
            "255.255.255.240", "255.255.255.248", "255.255.255.252", "255.255.255.254",
            "255.255.255.255"
        };
        for (String m : mascarasValidas) {
            if (mask.equals(m)) {
                return true;
            }
        }
        return false;
    }
    private void txt_validarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_validarActionPerformed
        String ip = this.txt_IP.getText().trim();
        String mask = this.txt_Mascara.getText().trim();
        if (esIPValida(ip) && esMascaraValida(mask)) {
            JOptionPane.showMessageDialog(null, "¡IP y Máscara de Red válidas!");
        } else if (!esIPValida(ip)) {
            JOptionPane.showMessageDialog(null, "La dirección IP no es válida.");
        } else {
            JOptionPane.showMessageDialog(null, "La máscara de red no es válida.");
        }
    }//GEN-LAST:event_txt_validarActionPerformed
    private String convertirDecimalABinario(String decimal) {
        String[] octetos = decimal.split("\\.");
        StringBuilder binario = new StringBuilder();
        for (String octeto : octetos) {
            int valor = Integer.parseInt(octeto);
            binario.append(String.format("%8s", Integer.toBinaryString(valor)).replace(' ', '0')).append(".");
        }
        return binario.substring(0, binario.length() - 1);
    }

    private String convertirBinarioADecimal(String binario) {
        String[] octetos = binario.split("\\.");
        StringBuilder decimal = new StringBuilder();
        for (String octeto : octetos) {
            int valor = Integer.parseInt(octeto, 2);
            decimal.append(valor).append(".");
        }
        return decimal.substring(0, decimal.length() - 1);
    }
    private int convertirMascaraACIDR(String mask) {
        if (mask.startsWith("/")) {
            return Integer.parseInt(mask.substring(1));
        } else {
            String[] octetos = mask.split("\\.");
            int cidr = 0;
            for (String octeto : octetos) {
                int valor = Integer.parseInt(octeto);
                cidr += Integer.bitCount(valor);
            }
            return cidr;
        }
    }
    private String calcularDireccionRed(String ip, int cidr) {
        int ipNum = ipToInt(ip);
        int mascara = (int) (0xFFFFFFFFL << (32 - cidr));
        int redNum = ipNum & mascara;
        return intToIP(redNum);
    }

    private String calcularDireccionBroadcast(String ip, int cidr) {
        int ipNum = ipToInt(ip);
        int mascara = (int) (0xFFFFFFFFL << (32 - cidr));
        int broadcastNum = ipNum | ~mascara;
        broadcastNum = broadcastNum & 0xFFFFFFFF;  // Asegurar que sea un valor positivo
        return intToIP(broadcastNum);
    }
    private int ipToInt(String ip) {
        String[] octetos = ip.split("\\.");
        int resultado = 0;
        for (int i = 0; i < 4; i++) {
            resultado |= (Integer.parseInt(octetos[i]) & 0xFF) << (24 - (i * 8));
        }
        return resultado;
    }

    private String intToIP(int valor) {
        return String.format("%d.%d.%d.%d",
            (valor >> 24) & 0xFF,
            (valor >> 16) & 0xFF,
            (valor >> 8) & 0xFF,
            valor & 0xFF
        );
    }
    private ArrayList<String> generarSubredes(String direccionRed, int cidr) {
        ArrayList<String> subredes = new ArrayList<>();
        int bitsSubred = 32 - cidr;
        int numSubredes = 1 << bitsSubred;
        String[] octetos = direccionRed.split("\\.");
        int redBase = 0;
        for (int i = 0; i < 4; i++) {
            redBase |= Integer.parseInt(octetos[i]) << (24 - (i * 8));
        }
        int incremento = 1 << bitsSubred;
        for (int i = 0; i < numSubredes; i++) {
            int subred = redBase + (i * incremento);
            subredes.add(String.format("%d.%d.%d.%d",
                (subred >> 24) & 0xFF,
                (subred >> 16) & 0xFF,
                (subred >> 8) & 0xFF,
                subred & 0xFF
            ));
        }
        return subredes;
    }   
     private String clasificarIP(String ip) {
        String[] octetos = ip.split("\\.");
        if (octetos.length != 4) {
            return "IP no válida";
        }
        try {
            int primerOcteto = Integer.parseInt(octetos[0]);
            if (primerOcteto >= 1 && primerOcteto <= 126) {
                return "Clase A - Máscara por defecto: 255.0.0.0 (/8)";
            } else if (primerOcteto >= 128 && primerOcteto <= 191) {
                return "Clase B - Máscara por defecto: 255.255.0.0 (/16)";
            } else if (primerOcteto >= 192 && primerOcteto <= 223) {
                return "Clase C - Máscara por defecto: 255.255.255.0 (/24)";
            } else {
                return "Dirección IP no pertenece a las clases A, B o C (Posible Clase D o E)";
            }
        } catch (NumberFormatException e) {
            return "IP no válida";
        }
    }
    private void btn_EjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EjecutarActionPerformed
        String ip = this.txt_IP.getText().trim();
        String mask = this.txt_Mascara.getText().trim();
        if (!esIPValida(ip)) {
            JOptionPane.showMessageDialog(null, "La dirección IP no es válida.");
            return;
        }
        if (!esMascaraValida(mask)) {
            JOptionPane.showMessageDialog(null, "La máscara de red no es válida.");
            return;
        }
        if (this.rbtn_binario.isSelected()) {
            ip = convertirBinarioADecimal(ip);
            mask = convertirBinarioADecimal(mask);
        }
        if (!this.lbl_mostrar.getText().equals("")) {
            this.lbl_mostrar.setText("");
        }
        int cidr = convertirMascaraACIDR(mask);
        String direccionRed = calcularDireccionRed(ip, cidr);
        String direccionBroadcast = calcularDireccionBroadcast(ip, cidr);
        ArrayList<String> subredes = generarSubredes(direccionRed, cidr);
        StringBuilder resultado = new StringBuilder();
        resultado.append("Dirección de Red: ").append(this.rbtn_binario.isSelected() ? convertirDecimalABinario(direccionRed) : direccionRed).append("\n");
        resultado.append("Dirección de Broadcast: ").append(this.rbtn_binario.isSelected() ? convertirDecimalABinario(direccionBroadcast) : direccionBroadcast).append("\n\n");
        resultado.append("Clasificación: ").append(this.clasificarIP(ip)).append("\n\n");
        resultado.append("SubRedes: \n\n");
        int i = 0;
        for (String subred : subredes) {
            i++;
            if (i < 4) {
                resultado.append(this.rbtn_binario.isSelected() ? convertirDecimalABinario(subred) : subred).append("\t");
            } else {
                resultado.append(this.rbtn_binario.isSelected() ? convertirDecimalABinario(subred) : subred).append("\n");
                i = 0;
            }
        }
        this.lbl_mostrar.setText(resultado.toString());
    }//GEN-LAST:event_btn_EjecutarActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IU_Generador().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Ejecutar;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.ButtonGroup grupo_opciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextArea lbl_mostrar;
    private javax.swing.JRadioButton rbtn_binario;
    private javax.swing.JRadioButton rbtn_decimal;
    private javax.swing.JScrollPane scrollpanel;
    private javax.swing.JTextField txt_IP;
    private javax.swing.JTextField txt_Mascara;
    private javax.swing.JButton txt_validar;
    // End of variables declaration//GEN-END:variables
}

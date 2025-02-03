
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollpanel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_IP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Mascara, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_validar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(44, 44, 44)
                        .addComponent(btn_Ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_IP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Limpiar))
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_Mascara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_validar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btn_Ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(scrollpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_IPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IPActionPerformed
        
    }//GEN-LAST:event_txt_IPActionPerformed

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        this.txt_IP.setText("");
        this.txt_Mascara.setText("");
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private boolean esIPValida(String ip) {
        String ipRegex = "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)(\\.|$)){4}$";
        Pattern pattern = Pattern.compile(ipRegex);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }
    
    private boolean esMascaraValida(String mask) {
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
        
        String cidrRegex = "^/(\\d|[1-2]\\d|3[0-2])$"; // Rango de 0 a 32
        Pattern pattern = Pattern.compile(cidrRegex);
        Matcher matcher = pattern.matcher(mask);
        
        if(matcher.matches()){
            return true;
        }
        return false;
    }
    
    private void txt_validarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_validarActionPerformed
        String ip = this.txt_IP.getText().trim();
        String mask = this.txt_Mascara.getText().trim();

        if (esIPValida(ip) && esMascaraValida(mask)) {
            JOptionPane.showMessageDialog(null,"¡IP y Máscara de Red válidas!");
        } else if (!esIPValida(ip)) {
            JOptionPane.showMessageDialog(null,"La dirección IP no es válida.");
        } else {
            JOptionPane.showMessageDialog(null,"La máscara de red no es válida.");
        }
    }//GEN-LAST:event_txt_validarActionPerformed

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
        String[] octetos = ip.split("\\.");
        int ipNum = 0;
        for (int i = 0; i < 4; i++) {
            ipNum |= Integer.parseInt(octetos[i]) << (24 - (i * 8));
        }
        int mascara = 0xFFFFFFFF << (32 - cidr);
        int redNum = ipNum & mascara;
        return String.format("%d.%d.%d.%d",
            (redNum >> 24) & 0xFF,
            (redNum >> 16) & 0xFF,
            (redNum >> 8) & 0xFF,
            redNum & 0xFF
        );
    }
    private String calcularDireccionBroadcast(String ip, int cidr) {
        String[] octetos = ip.split("\\.");
        int ipNum = 0;
        for (int i = 0; i < 4; i++) {
            ipNum |= Integer.parseInt(octetos[i]) << (24 - (i * 8));
        }
        int mascara = 0xFFFFFFFF << (32 - cidr);
        int broadcastNum = ipNum | ~mascara;
        return String.format("%d.%d.%d.%d",
            (broadcastNum >> 24) & 0xFF,
            (broadcastNum >> 16) & 0xFF,
            (broadcastNum >> 8) & 0xFF,
            broadcastNum & 0xFF
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

        if (!this.lbl_mostrar.getText().equals("")) {
            this.lbl_mostrar.setText("");
        }

        int cidr = convertirMascaraACIDR(mask);
        String direccionRed = calcularDireccionRed(ip, cidr);
        String direccionBroadcast = calcularDireccionBroadcast(ip, cidr);
        ArrayList<String> subredes = generarSubredes(direccionRed, cidr);

        StringBuilder resultado = new StringBuilder();
        resultado.append("Dirección de Red: ").append(direccionRed).append("\n");
        resultado.append("Dirección de Broadcast: ").append(direccionBroadcast).append("\n\n");
        resultado.append("Clasificación: ").append(this.clasificarIP(ip)).append("\n\n");
        resultado.append("SubRedes: \n\n");

        int i = 0;
        for (String subred : subredes) {
            i++;
            if (i < 5) {
                resultado.append(subred).append("\t");
            } else {
                resultado.append(subred).append("\n");
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextArea lbl_mostrar;
    private javax.swing.JScrollPane scrollpanel;
    private javax.swing.JTextField txt_IP;
    private javax.swing.JTextField txt_Mascara;
    private javax.swing.JButton txt_validar;
    // End of variables declaration//GEN-END:variables
}

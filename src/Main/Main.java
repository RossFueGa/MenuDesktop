
package Main;

import form.CambiaPanel;
import form.PnlAddInventario;
import form.PnlCancelados;
import form.PnlInventario;
import form.PnlSolicitudes;
import form.PnlSolicitudesActivas;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import menu.MenuItem;
import form.CambiaPanel;

/**
 *
 * @author ross
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        execute(); 
    }

    private void execute() {
        ImageIcon iconPrestamos = new ImageIcon(getClass().getResource("/menu/prestamo.png"));
        ImageIcon iconInventario = new ImageIcon(getClass().getResource("/menu/inventario.png"));
        ImageIcon iconConsulta = new ImageIcon(getClass().getResource("/menu/database.png"));
        ImageIcon iconSubMenu = new ImageIcon(getClass().getResource("/menu/subMenu.png"));
        ImageIcon iconNext = new ImageIcon(getClass().getResource("/menu/next.png"));
        //  create submenu Prestamos
        MenuItem menuPrestamoUno = new MenuItem(iconSubMenu, "Solicitudes de Préstamos", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new CambiaPanel(panelBody, new form.PnlSolicitudes());
            }
        });
        
        MenuItem menuPrestamoDos = new MenuItem(iconSubMenu, "Prestamos Activos", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new CambiaPanel(panelBody, new form.PnlSolicitudesActivas());
            }
        });
        
        MenuItem menuPrestamoTres = new MenuItem(iconSubMenu, "Préstamos Cancelados", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CambiaPanel(panelBody, new form.PnlCancelados());
            }
        });
        //Submenu  
        MenuItem menuInventarioUno = new MenuItem(iconSubMenu, "Inventario existente", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CambiaPanel( panelBody,new form.PnlInventario());
            }
        });
        MenuItem menuInventarioDos = new MenuItem(iconSubMenu,"Agregar al inventario", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CambiaPanel(panelBody, new form.PnlAddInventario());
            }
        });
        
        MenuItem menuPrestamos = new MenuItem(iconPrestamos, "Préstamos", null, menuPrestamoUno, menuPrestamoDos, menuPrestamoTres);
        MenuItem menuInventario = new MenuItem(iconInventario, "Inventario", null, menuInventarioUno, menuInventarioDos);
        MenuItem menuConsultas = new MenuItem(iconConsulta, "Consultas", null);
        addMenu(menuPrestamos, menuInventario, menuConsultas);
    }

    private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            menus.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        menus.revalidate();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        panelBody = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelHeader.setBackground(new java.awt.Color(38, 86, 186));
        panelHeader.setPreferredSize(new java.awt.Dimension(561, 50));

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(panelHeader, java.awt.BorderLayout.PAGE_START);

        panelMenu.setBackground(new java.awt.Color(254, 254, 254));
        panelMenu.setPreferredSize(new java.awt.Dimension(250, 384));

        jScrollPane1.setBorder(null);

        menus.setBackground(new java.awt.Color(255, 255, 255));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        getContentPane().add(panelMenu, java.awt.BorderLayout.LINE_START);

        panelBody.setBackground(new java.awt.Color(255, 255, 255));
        panelBody.setLayout(new java.awt.BorderLayout());
        getContentPane().add(panelBody, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1100, 577));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}


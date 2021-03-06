package form;

import Fonts.Fuentes;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import datadashboard.DaoApartados;
import datadashboard.HeaderFooterPageEvent;
import java.awt.BorderLayout;
import java.awt.FontFormatException;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.ApartadoDetalle;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.*;

public class PnlConsultaCarreras extends javax.swing.JPanel {

    Fuentes tipoDeFuentes;
    private DefaultTableModel modelo;
    private DaoApartados data;
    private List<ApartadoDetalle> records;

    /**
     * Creates new form Panel1
     */
    public PnlConsultaCarreras() throws FontFormatException {
        initComponents();

        data = new DaoApartados();
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"ID", "EQUIPO", "ALUMNO", "MATRÍCULA", "CARRERA", "EDIFICIO", "AULA", "GRUPO", "FECHA(a/m/d)", "HORARIO"});
        tipoDeFuentes = new Fuentes();
        jLabelSolicitudesPrestamos.setFont(tipoDeFuentes.fuente(tipoDeFuentes.quickBold, 0, 17));
        cmbCarrera.setFont(tipoDeFuentes.fuente(tipoDeFuentes.quickRegular, 0, 12 ));
        labelCarrera.setFont(tipoDeFuentes.fuente(tipoDeFuentes.quicSemiBold, 0, 14));
        tHistorialCarrera.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelSolicitudesPrestamos = new javax.swing.JLabel();
        panelLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tHistorialCarrera = new javax.swing.JTable();
        panelBotones = new javax.swing.JPanel();
        labelCarrera = new javax.swing.JLabel();
        cmbCarrera = new javax.swing.JComboBox<>();
        btnBuscar = new rsbuttom.RSButtonMetro();
        rSButtonMetro1 = new rsbuttom.RSButtonMetro();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(java.awt.Color.white);

        jLabelSolicitudesPrestamos.setBackground(new java.awt.Color(127, 145, 232));
        jLabelSolicitudesPrestamos.setFont(new java.awt.Font("Roboto Lt", 1, 18)); // NOI18N
        jLabelSolicitudesPrestamos.setForeground(java.awt.Color.white);
        jLabelSolicitudesPrestamos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSolicitudesPrestamos.setText("Historial de préstamos por carrera");
        jLabelSolicitudesPrestamos.setOpaque(true);

        panelLista.setBackground(java.awt.Color.white);
        panelLista.setLayout(new java.awt.BorderLayout());

        tHistorialCarrera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tHistorialCarrera);

        panelLista.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panelBotones.setBackground(java.awt.Color.white);

        labelCarrera.setText("Carrera");

        cmbCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Académicos", "Contaduría", "Administración", "Gestion de negocios", "Sistemas computacionales", "Informática", "Ingeniería de software" }));
        cmbCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCarreraActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.setFont(new java.awt.Font("Quicksand-Regular.ttf", 1, 12)); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        rSButtonMetro1.setText("Generar PDF");
        rSButtonMetro1.setFont(new java.awt.Font("Quicksand-Regular.ttf", 1, 12)); // NOI18N
        rSButtonMetro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(labelCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelBotonesLayout.createSequentialGroup()
                        .addComponent(labelCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(cmbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSolicitudesPrestamos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelSolicitudesPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLista, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        showData(cmbCarrera.getSelectedIndex());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void rSButtonMetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro1ActionPerformed
        // TODO add your handling code here:
        if (modelo.getRowCount() > 0) {
            try {
                crearPdf();
            } catch (FileNotFoundException | DocumentException ex) {
                Logger.getLogger(PnlConsultaCarreras.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No existen registros", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_rSButtonMetro1ActionPerformed

    private void cmbCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCarreraActionPerformed

    private void showData(int carrera) {
        records = data.getRecords(carrera);
        System.out.println("Cargando");
        JOptionPane.showMessageDialog(null, "Buscando...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        if (!records.isEmpty()) {
            for (ApartadoDetalle record : records) {
                modelo.addRow(new Object[]{record.getIdApartado(), record.getNombreEquipo(), record.getNombre(),
                    record.getMatricula(), record.getCarrera(), record.getEdificio(), record.getAula(),
                    record.getGrupo(), record.getFecha(), record.getHoraInicio() + "-" + record.getHoraFinal()});
            }
            JOptionPane.showMessageDialog(null, "Registros cargados con éxito", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No existen registros", "Aviso", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void crearPdf() throws FileNotFoundException, DocumentException {
        if (!records.isEmpty()) {

            String ruta = "/home/alsorc/Documents/Reportes/reporte_carrera_" + cmbCarrera.getSelectedItem() + ".pdf";
            Document documento = new Document(PageSize.A4.rotate(), 0, 0, 8, 8);
            java.io.FileOutputStream ficheroPdf = new java.io.FileOutputStream(ruta);
            PdfWriter writer = PdfWriter.getInstance(documento, ficheroPdf);
            documento.open();
            PdfPTable tabla = new PdfPTable(10);
            tabla.setWidths(new int[]{1, 2, 1, 2, 2, 1, 1, 1, 2, 2});
            HeaderFooterPageEvent event = new HeaderFooterPageEvent();
            event.onStartPage(writer, documento);
            writer.setPageEvent(event);

            tabla.addCell("ID");
            tabla.addCell("EQUIPO");
            tabla.addCell("ALUMNO");
            tabla.addCell("MATRÍCULA");
            tabla.addCell("CARRERA");
            tabla.addCell("EDIFICIO");
            tabla.addCell("AULA");
            tabla.addCell("GRUPO");
            tabla.addCell("FECHA(a/m/d)");
            tabla.addCell("HORARIO");
            for (ApartadoDetalle record : records) {
                tabla.addCell(String.valueOf(record.getIdApartado()));
                tabla.addCell(record.getNombreEquipo());
                tabla.addCell(record.getNombre());
                tabla.addCell(record.getMatricula());
                tabla.addCell(record.getCarrera());
                tabla.addCell(record.getEdificio());
                tabla.addCell(record.getAula());
                tabla.addCell(record.getGrupo());
                tabla.addCell(record.getFecha());
                tabla.addCell(record.getHoraInicio() + "-" + record.getHoraFinal());
            }
            documento.add(tabla);
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado");
        } else {
            JOptionPane.showMessageDialog(null, "No existen registros para reporte");
        }

    }

    private void loadData() {
        System.out.println("Mostrando...");
        DefaultCategoryDataset data = new DefaultCategoryDataset();

        final String C1 = "Contaduría";
        final String C2 = "Administración";

        data.addValue(100, C1, "periodo a evaluar");
        data.addValue(50, C2, "periodo a evaluar");

        JFreeChart grafica = ChartFactory.createBarChart3D("DUMMY TITTLE", "Carreras", "Cantidad", data, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel contenedor = new ChartPanel(grafica);
        panelLista.add(contenedor, BorderLayout.CENTER);
        panelLista.validate();
    }

    private void limpiarTabla() {
        modelo.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnBuscar;
    private javax.swing.JComboBox<String> cmbCarrera;
    private javax.swing.JLabel jLabelSolicitudesPrestamos;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCarrera;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelLista;
    private rsbuttom.RSButtonMetro rSButtonMetro1;
    private javax.swing.JTable tHistorialCarrera;
    // End of variables declaration//GEN-END:variables
}

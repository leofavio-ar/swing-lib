/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.fl.dialogs;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;
/**
 *
 * @author Leo Aguilar
 */
public class HelpPane extends JPanel {

    private JPanel contentPane;
    private JLabel titleLabel;
    private JEditorPane contentArea;
    private JLabel bottomLabel;
    private String title;
    private String content;
    private String documentURL;
    private ImageIcon closeNormal;
    private ImageIcon closeHover;
    private ImageIcon closePress;
    private MouseListener mouseListener;
    private Font font = new Font("Verdana", Font.PLAIN, 12);

    /**
     * Crea un nuevo <code>HelpPane</code>.
     */
    public HelpPane() {
        this("Panel de ayuda", "");
    }
    /**
     * Crea un nuevo <code>HelpPane</code>.
     * @param title El título que llevará el <code>HelpPane</code>.
     * @param content El texto del contenido de la ayuda, de preferencia en HTML.
     */
    public HelpPane(String title, String content) {
        super();
        this.title = title;
        this.content = content;
        initComponents();
    }
    /**
     * Asigna el título al <code>HelpPane</code>.
     * @param title El título que llevará el <code>HelpPane</code>.
     */
    public void setTitle(String title)  {
        this.title = title;
        titleLabel.setText(title);
    }
    /**
     * Asigna el contenido de la ayuda.
     * @param content El texto del contenido de la ayuda, de preferencia en HTML.
     */
    public void setContent(String content) {
        this.content = content;
        contentArea.setText(content);
    }
    /**
     * Asigna la URL de un documento HTML para mostrarlo en el área de contenido.
     * @param documentPath La URL de un documento HTML para mostrarlo en el área de contenido.
     */
    public void setDocumentURL(String documentPath) {
        this.documentURL = documentPath;
        try {
            contentArea.setPage(documentPath);
        } catch (IOException ex) {
            Logger.getLogger(HelpPane.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void setDocumentURL(URL documentURL) {
        this.documentURL = documentURL.toString();
        try {
            contentArea.setPage(documentURL);
        } catch (IOException ex) {
            Logger.getLogger(HelpPane.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Recupera el título del <code>HelpPane</code>.
     * @return El título del <code>HelpPane</code>.
     */
    public String getTitle() {
        return title;
    }
    /**
     * Recupera el contenido de la ayuda.
     * @return El contenido de la ayuda.
     */
    public String getContent() {
        return content;
    }
    /**
     * Recupera la URL del documento HTML mostrado en el área de contenido.
     * @return La URL del documento HTML mostrado en el área de contenido.
     */
    public String getDocumentURL() {
        return documentURL;
    }
    /**
     * Instala el <code>MouseListener</code> para el <code>JLabel</code> inferior del <code>HelpPane</code>.
     * @param listener
     */
    public void installCloseButtonClickListener(MouseListener listener) {
        if (mouseListener != null) {
            bottomLabel.removeMouseListener(mouseListener);
        }
        mouseListener = listener;
        bottomLabel.addMouseListener(mouseListener);
    }
    //<editor-fold defaultstate="collapsed" desc="initializeComponents">
    @SuppressWarnings("unchecked")
    private void initComponents() {
        contentPane = createContentPane();
        titleLabel = new JLabel();
        contentArea = new JEditorPane();
        bottomLabel = new JLabel();
        closeNormal = new ImageIcon(getClass().getResource("/img/px16/close.png"));
        closeHover = new ImageIcon(getClass().getResource("/img/px16/close_hover.png"));
        closePress = new ImageIcon(getClass().getResource("/img/px16/close_pressed_red.png"));

        titleLabel.setFont(font);
        titleLabel.setIconTextGap(10);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setText(title);
        titleLabel.setIcon(new ImageIcon(getClass().getResource("/img/px24/help2.png")));
        titleLabel.setHorizontalAlignment(JLabel.LEFT);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(9, 10, 5, 10));

        contentArea.setContentType("text/html");
        contentArea.putClientProperty(JEditorPane.HONOR_DISPLAY_PROPERTIES, Boolean.TRUE);
        contentArea.setFont(font);
        contentArea.setOpaque(false);
        contentArea.setEditable(false);
        contentArea.setText(content);
        contentArea.setBackground(new Color(255, 255, 255));
        contentArea.setForeground(Color.BLACK);
        contentArea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JScrollPane scrollPane = new JScrollPane(contentArea);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        GroupLayout layout = new javax.swing.GroupLayout(contentPane);
        contentPane.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bottomLabel.setText("Cerrar panel de ayuda");
        bottomLabel.setFont(font);
        bottomLabel.setHorizontalAlignment(JLabel.LEFT);
        bottomLabel.setForeground(Color.WHITE);
        bottomLabel.setIcon(closeNormal);
        bottomLabel.setBorder(BorderFactory.createEmptyBorder(5, 10, 9, 5));
        bottomLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bottomLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                bottomLabel.setIcon(closePress);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                bottomLabel.setIcon(closeNormal);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                bottomLabel.setIcon(closeHover);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                bottomLabel.setIcon(closeNormal);
            }
        });
        setLayout(new BorderLayout());
        add(titleLabel, BorderLayout.NORTH);
        add(contentPane, BorderLayout.CENTER);
        add(bottomLabel, BorderLayout.SOUTH);
    }
    //</editor-fold>
    private JPanel createContentPane() {
        return new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D)g.create();
                g2.setColor(Color.WHITE);
                Shape shape = new Rectangle2D.Float(4, 0, getWidth() - 8, getHeight());
                g2.fill(shape);
                g2.dispose();
            }
            @Override
            protected void paintBorder(Graphics g) {
                Graphics2D g2 = (Graphics2D)g.create();
                g2.setColor(Color.BLACK);
                g2.setStroke(new BasicStroke(4.0f));
                g2.drawLine(6, 0, 6, getHeight());
                g2.drawLine(getWidth() - 6, 0, getWidth() - 6, getHeight());
                g2.dispose();
            }
        };
    }
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Composite old = g2.getComposite();
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
        Shape shape = new RoundRectangle2D.Float(4, 4, getWidth() - 8, getHeight() - 8, 16, 16);
        g2.setColor(Color.BLACK);
        g2.fill(shape);
        g2.setComposite(old);
        g2.dispose();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.setLayout(new BorderLayout());
        HelpPane help = new HelpPane();
        frame.add(help, BorderLayout.CENTER);
        help.setTitle("Panel de ayuda");
        help.setDocumentURL("http://www.google.com");
        frame.setVisible(true);
    }

}
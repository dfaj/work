package model.gui;


import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


/** 
 * A simple panel that provides a button that will launch a properly configured JFileChooser.
 */
public class FileLoaderPanel extends javax.swing.JPanel {

	RunInspectorApp parent;


	/** 
	 * Creates new form FileLoaderPanel 
	 * 
	 * @param parent - 
	 */
	public FileLoaderPanel(RunInspectorApp parent) {
		this.parent = parent;
		initComponents();
	}


	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        browseButton = new javax.swing.JButton();

        jLabel1.setText("Load a summary file :");

        browseButton.setText("Browse");
        browseButton.setPreferredSize(new java.awt.Dimension(1000, 1000));
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(browseButton, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(1177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(browseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1214, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
	//launch a JFileChooser - send to file to parent...
	JFileChooser jfc = new JFileChooser();
	FileNameExtensionFilter filter = new FileNameExtensionFilter(
		"Serialized Log Files", "slg");
	jfc.setFileFilter(filter);
	int returnVal = jfc.showOpenDialog(parent);
	if (returnVal == JFileChooser.APPROVE_OPTION) {
		//send file to parent
		File file = jfc.getSelectedFile();
		parent.loadFile(file);
	}
	
	parent.showSummaryTab();
	
	
	
}//GEN-LAST:event_browseButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
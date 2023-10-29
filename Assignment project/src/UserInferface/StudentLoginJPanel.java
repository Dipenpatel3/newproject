/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInferface;

import MainModel.CourseHistory;
import MainModel.StudentClass;
import MainModel.StudentDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author dipenpatel
 */
public class StudentLoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentLoginJPanel
     */
//    public StudentLoginJPanel() {
//        initComponents();
//    }
    private JPanel WorkArea;
    private StudentDirectory StudentDirectory;
    private StudentClass Studentclass;
    private CourseHistory courseHistory;
    
    StudentLoginJPanel(JPanel WorkArea,StudentDirectory StudentDirectory,StudentClass Studentclass, CourseHistory courseHistory) {
     initComponents();
     this.WorkArea=WorkArea;
     this.StudentDirectory=StudentDirectory;
     this.Studentclass=Studentclass;
     this.courseHistory=courseHistory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        btnUpdateProfile = new javax.swing.JButton();
        btnViewProfile = new javax.swing.JButton();
        btnAddCourse = new javax.swing.JButton();
        btnViewCourse = new javax.swing.JButton();
        btnTranscripts = new javax.swing.JButton();

        setBackground(new java.awt.Color(186, 79, 84));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Wlecome To Student Login Page");

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnUpdateProfile.setText("Update Profile Details");
        btnUpdateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProfileActionPerformed(evt);
            }
        });

        btnViewProfile.setText("View Profile Details");
        btnViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfileActionPerformed(evt);
            }
        });

        btnAddCourse.setText("Add Course");
        btnAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCourseActionPerformed(evt);
            }
        });

        btnViewCourse.setText("View Course");
        btnViewCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCourseActionPerformed(evt);
            }
        });

        btnTranscripts.setText("Transcripts ");
        btnTranscripts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranscriptsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogOut)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTranscripts)
                    .addComponent(btnViewCourse)
                    .addComponent(btnAddCourse)
                    .addComponent(btnViewProfile)
                    .addComponent(btnUpdateProfile))
                .addContainerGap(332, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddCourse, btnTranscripts, btnUpdateProfile, btnViewCourse, btnViewProfile});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(btnViewProfile)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateProfile)
                .addGap(18, 18, 18)
                .addComponent(btnAddCourse)
                .addGap(18, 18, 18)
                .addComponent(btnViewCourse)
                .addGap(18, 18, 18)
                .addComponent(btnTranscripts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(btnLogOut)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        int dialogButton=JOptionPane.YES_NO_OPTION;
        int dialogResult=JOptionPane.showConfirmDialog(null,"Would you Like to Log Out","Warring",dialogButton);
        if(dialogButton==JOptionPane.YES_NO_OPTION){
            WorkArea.remove(this);
            CardLayout layout=(CardLayout) WorkArea.getLayout();
            layout.previous(WorkArea);
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnUpdateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProfileActionPerformed
        // TODO add your handling code here:
        UpdateStudentdetailsJPanel updatestudentdetialsjpanel=new UpdateStudentdetailsJPanel(WorkArea,Studentclass);
        WorkArea.add("UpdateStudentdetailsJPanel",updatestudentdetialsjpanel);
        CardLayout layout=(CardLayout) WorkArea.getLayout();
        layout.next(WorkArea);
    }//GEN-LAST:event_btnUpdateProfileActionPerformed

    private void btnViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfileActionPerformed
        // TODO add your handling code here:
        ViewStudentDetailsJPanel viewstudentdetialsjpanel=new ViewStudentDetailsJPanel(WorkArea,Studentclass);
        WorkArea.add("ViewStudentDetailsJPanel",viewstudentdetialsjpanel);
        CardLayout layout=(CardLayout) WorkArea.getLayout();
        layout.next(WorkArea);
    }//GEN-LAST:event_btnViewProfileActionPerformed

    private void btnTranscriptsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTranscriptsActionPerformed
        // TODO add your handling code here:
        StudentTranscriptviewJPanel studenttrancsriptviewjpanel=new StudentTranscriptviewJPanel(WorkArea);
        WorkArea.add("StudentTranscriptviewJPanel",studenttrancsriptviewjpanel);
        CardLayout layout=(CardLayout) WorkArea.getLayout();
        layout.next(WorkArea);
    }//GEN-LAST:event_btnTranscriptsActionPerformed

    private void btnAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCourseActionPerformed
        // TODO add your handling code here:
        AddCourseJPanel addcoursejpanel=new AddCourseJPanel(WorkArea, courseHistory);
        WorkArea.add("AddCourseJPanel",addcoursejpanel);
        CardLayout layout=(CardLayout) WorkArea.getLayout();
        layout.next(WorkArea);
    }//GEN-LAST:event_btnAddCourseActionPerformed

    private void btnViewCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewCourseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCourse;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnTranscripts;
    private javax.swing.JButton btnUpdateProfile;
    private javax.swing.JButton btnViewCourse;
    private javax.swing.JButton btnViewProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}

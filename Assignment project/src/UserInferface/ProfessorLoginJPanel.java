/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInferface;

import MainModel.Course;
import MainModel.CourseHistory;
import MainModel.Professor;
import MainModel.ProfessorHistory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author dipenpatel
 */
public class ProfessorLoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProfessorLoginJPanel
     */
//    public ProfessorLoginJPanel() {
//        initComponents();
//    }
    private JPanel WorkArea;
    private ProfessorHistory ProfessorHistory;
    private Professor Professor;
    private CourseHistory CourseHistory;
    
    
    ProfessorLoginJPanel(JPanel WorkArea, ProfessorHistory ProfessorHistory,Professor Professor,CourseHistory CourseHistory) {
        initComponents();
        this.WorkArea=WorkArea;
        this.ProfessorHistory=ProfessorHistory;
        this.Professor=Professor;
        this.CourseHistory=CourseHistory;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnViewProfielDetails = new javax.swing.JButton();
        btnUpdateDetails = new javax.swing.JButton();
        btnCreateCourse = new javax.swing.JButton();
        btnViewCourse = new javax.swing.JButton();
        btnAddExperince = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setBackground(new java.awt.Color(186, 79, 84));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to Professor Panel");

        btnViewProfielDetails.setText("View Profile Details");
        btnViewProfielDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfielDetailsActionPerformed(evt);
            }
        });

        btnUpdateDetails.setText("Update Profile Details");
        btnUpdateDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDetailsActionPerformed(evt);
            }
        });

        btnCreateCourse.setText("Create Course ");
        btnCreateCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCourseActionPerformed(evt);
            }
        });

        btnViewCourse.setText("View Course ");
        btnViewCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCourseActionPerformed(evt);
            }
        });

        btnAddExperince.setText("Add Experience ");

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddExperince)
                    .addComponent(btnUpdateDetails)
                    .addComponent(btnViewProfielDetails)
                    .addComponent(btnCreateCourse)
                    .addComponent(btnViewCourse))
                .addContainerGap(343, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(62, 62, 62))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddExperince, btnCreateCourse, btnUpdateDetails, btnViewCourse, btnViewProfielDetails});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(btnViewProfielDetails)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateDetails)
                .addGap(28, 28, 28)
                .addComponent(btnCreateCourse)
                .addGap(18, 18, 18)
                .addComponent(btnViewCourse)
                .addGap(18, 18, 18)
                .addComponent(btnAddExperince)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCourseActionPerformed
        // TODO add your handling code here:
        ViewCourseProfessorJPanel viewcourseprofessorjpanel=new ViewCourseProfessorJPanel(WorkArea,CourseHistory,Professor);
        WorkArea.add("ViewCourseProfessorjpanel",viewcourseprofessorjpanel);
        CardLayout layout=(CardLayout) WorkArea.getLayout();
        layout.next(WorkArea);
    }//GEN-LAST:event_btnViewCourseActionPerformed

    private void btnViewProfielDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfielDetailsActionPerformed
        // TODO add your handling code here:
        ViewProfileProfessorJPanel viewprofileprofessorjpanel=new ViewProfileProfessorJPanel(WorkArea,Professor);
        WorkArea.add("ViewProfileProfessorJPanel",viewprofileprofessorjpanel);
        CardLayout layout=(CardLayout) WorkArea.getLayout();
        layout.next(WorkArea);
    }//GEN-LAST:event_btnViewProfielDetailsActionPerformed

    private void btnUpdateDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDetailsActionPerformed
        // TODO add your handling code here:
        UpdateProfileProfessorJPanel updateprofileprofessorjpanel=new UpdateProfileProfessorJPanel(WorkArea,Professor);
        WorkArea.add("UpdateProfileProfessorJPanel",updateprofileprofessorjpanel);
        CardLayout layout=(CardLayout) WorkArea.getLayout();
        layout.next(WorkArea);
    }//GEN-LAST:event_btnUpdateDetailsActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int dialogButton=JOptionPane.YES_NO_OPTION;
        int dialogResult=JOptionPane.showConfirmDialog(null, "Would you like to Logout","Warring",dialogButton);
        if(dialogButton==JOptionPane.YES_NO_OPTION){
            WorkArea.remove(this);
            CardLayout layout=(CardLayout) WorkArea.getLayout();
            layout.previous(WorkArea);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnCreateCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCourseActionPerformed
        // TODO add your handling code here:
        CreateCourseProfessorJPanel createcourseprofessorjpanel=new CreateCourseProfessorJPanel(WorkArea,CourseHistory,Professor);
        WorkArea.add("CreateCourseProfessorJPanel",createcourseprofessorjpanel);
        CardLayout layout=(CardLayout) WorkArea.getLayout();
        layout.next(WorkArea);
    }//GEN-LAST:event_btnCreateCourseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddExperince;
    private javax.swing.JButton btnCreateCourse;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdateDetails;
    private javax.swing.JButton btnViewCourse;
    private javax.swing.JButton btnViewProfielDetails;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

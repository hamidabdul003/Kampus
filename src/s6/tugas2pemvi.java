package s6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tugas2pemvi {
    public static void main(String[] args) {
        JFrame frametugas2=new JFrame();
        JLabel datamahasiwa=new JLabel("Data Mahasiswa");
        JLabel NPM=new JLabel("NPM");
        JLabel Nama=new JLabel("Nama");
        JLabel Agama=new JLabel("Agama");
        JLabel JK=new JLabel("Jenis Kelamin");
        JLabel Hobi=new JLabel("Hobi");
        JTextField Jtextnpm=new JTextField();
        JTextField Jtextname=new JTextField();

        String [] agama={"Islam","Hindu","Budha","Kristen"};
        JComboBox AGAMA=new JComboBox(agama);

        JCheckBox membaca=new JCheckBox("Membaca");
        JCheckBox olahraga=new JCheckBox("Olahraga");
        JCheckBox menyanyi=new JCheckBox("Menyanyi");
        JCheckBox menari=new JCheckBox("Menari");
        JCheckBox memasak=new JCheckBox("Memasak");
        JCheckBox menulis=new JCheckBox("Menulis");

        JRadioButton pria=new JRadioButton("Laki-laki");
        JRadioButton wanita=new JRadioButton("Perempuan");
        ButtonGroup JKgroup=new ButtonGroup();
        JKgroup.add(pria);
        JKgroup.add(wanita);

        JButton bsimpan=new JButton("Save");
        JButton bedit=new JButton("Edit");
        JButton bdelete=new JButton("Delete");
        JButton bexit=new JButton("Exit");

        datamahasiwa.setBounds(150,10,200,20);
        NPM.setBounds(10,40,100,20);
        Nama.setBounds(10,70,100,20);
        Agama.setBounds(10,100,100,20);
        JK.setBounds(10,130,100,20);
        Hobi.setBounds(10,160,100,20);

        Jtextnpm.setBounds(110,40,120,20);
        Jtextname.setBounds(110,70,200,20);

        AGAMA.setBounds(110,100,100,20);

        pria.setBounds(110,130,100,20);
        wanita.setBounds(200,130,200,20);

        membaca.setBounds(110,160,100,20);
        olahraga.setBounds(110,190,100,20);
        menyanyi.setBounds(110,220,100,20);
        menari.setBounds(200,160,100,20);
        memasak.setBounds(200,190,100,20);
        menulis.setBounds(200,220,100,20);

        bsimpan.setBounds(50,250,80,20);
        bsimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jtextnpm.setText(null);
                Jtextname.setText(null);
                JKgroup.clearSelection();
                membaca.setSelected(false);
                olahraga.setSelected(false);
                menyanyi.setSelected(false);
                menari.setSelected(false);
                memasak.setSelected(false);
                menulis.setSelected(false);
                JOptionPane.showMessageDialog(null, "Data disimpan!");
            }
        });
        bedit.setBounds(150,250,80,20);
        bedit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jtextnpm.setText(null);
                Jtextname.setText(null);
                JKgroup.clearSelection();
                membaca.setSelected(false);
                olahraga.setSelected(false);
                menyanyi.setSelected(false);
                menari.setSelected(false);
                memasak.setSelected(false);
                menulis.setSelected(false);
                JOptionPane.showMessageDialog(null, "Tidak ada data yang di Edit!");
            }
        });
        bdelete.setBounds(250,250,80,20);
        bdelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jtextnpm.setText(null);
                Jtextname.setText(null);
                JKgroup.clearSelection();
                membaca.setSelected(false);
                olahraga.setSelected(false);
                menyanyi.setSelected(false);
                menari.setSelected(false);
                memasak.setSelected(false);
                menulis.setSelected(false);
                JOptionPane.showMessageDialog(null, "Tidak ada data yang di Delete!");
            }
        });
        bexit.setBounds(350,250,80,20);
        bexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frametugas2.add(datamahasiwa);
        frametugas2.add(NPM);
        frametugas2.add(Nama);
        frametugas2.add(Agama);
        frametugas2.add(JK);
        frametugas2.add(Hobi);
        frametugas2.add(Jtextnpm);
        frametugas2.add(Jtextname);
        frametugas2.add(AGAMA);
        frametugas2.add(pria);
        frametugas2.add(wanita);
        frametugas2.add(membaca);
        frametugas2.add(olahraga);
        frametugas2.add(menari);
        frametugas2.add(memasak);
        frametugas2.add(menulis);
        frametugas2.add(menyanyi);
        frametugas2.add(bsimpan);
        frametugas2.add(bedit);
        frametugas2.add(bdelete);
        frametugas2.add(bexit);


        frametugas2.setSize(500,400);
        frametugas2.setLayout(null);
        frametugas2.setVisible(true);
    }
}

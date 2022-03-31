package s6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tugas1 {
    public static void main(String [] args){
        JFrame f=new JFrame("Data Mahasiswa");
        JLabel npm=new JLabel("NPM");
        JLabel name=new JLabel("Nama");
        JLabel prodi=new JLabel("Prodi");
        JLabel alamat=new JLabel("Alamat");
        JLabel nohp=new JLabel("No. Telepon");
        JLabel strip=new JLabel("--");
        JTextField tNPM=new JTextField();
        JTextField tNama=new JTextField();
        JTextField tProdi=new JTextField();
        JTextField talamat=new JTextField();
        JTextField tnodepan=new JTextField();
        JTextField tnobelakang=new JTextField();
        JButton bsimpan=new JButton("Simpan");
        npm.setBounds(10,10,80,20);
        name.setBounds(10,40,100,20);
        prodi.setBounds(10,75,80,20);
        alamat.setBounds(10,100,150,20);
        nohp.setBounds(10,130,100,20);
        strip.setBounds(160,130,100,20);
        tNPM.setBounds(110,10,120,20);
        tNama.setBounds(110,40,210,20);
        tProdi.setBounds(110,70,180,20);
        talamat.setBounds(110,100,280,20);
        tnodepan.setBounds(110,130,40,20);
        tnobelakang.setBounds(180,130,100,20);
        bsimpan.setBounds(70,210,100,40);
        bsimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tNPM.setText(null);
                tNama.setText(null);
                tProdi.setText(null);
                talamat.setText(null);
                tnodepan.setText(null);
                tnobelakang.setText(null);
                JOptionPane.showMessageDialog(null, "Data disimpan!");
            }
        });
        f.add(npm);
        f.add(name);
        f.add(prodi);
        f.add(alamat);
        f.add(nohp);
        f.add(tNPM);
        f.add(tNama);
        f.add(tProdi);
        f.add(talamat);
        f.add(tnodepan);
        f.add(strip);
        f.add(tnobelakang);
        f.add(bsimpan);
        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}

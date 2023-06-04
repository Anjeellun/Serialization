/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serialization;

/**
 *
 * @author DELL
 */
import java.io.*;
import java.util.ArrayList;

public class CrudMhs {
    private ArrayList <DataMhs> student;
    private final File file;
    
    public CrudMhs (String fileName){
        student = new ArrayList<>();
        file = new File(fileName);
        if (file.exists()){
            readMahasiswi();
        }
    }
    public ArrayList<DataMhs> getMahasiswa(){
        return student;
    }
    public void setMahasiswa (ArrayList<DataMhs> student){
        this.student = student;
    }
    
    public void insertMahasiswa(DataMhs mahasiswa){
        student.add(mahasiswa);
    
    }

    public void updateMahasiswa(DataMhs mahasiswa){
        for (DataMhs mhs : student) {
            if (mhs.getNim().equals(mahasiswa.getNim())) {
                mhs.setNama(mahasiswa.getNama());
                mhs.setAsal(mahasiswa.getAsal());
                mhs.setKelas(mahasiswa.getKelas());
                break;
            }
        }
    }

    public void deleteMahasiswi(String nama) {
        for (DataMhs mhs : student) {
            if (mhs.getNama().equals(nama)) {
                student.remove(mhs);
                break;
            }
        }
    }

    public void printMahasiswa() {
        System.out.println("List Mahasiswi :");
        for (DataMhs mhs : student) {
            System.out.println("Nama : " + mhs.getNama());
            System.out.println("Nim : " + mhs.getNim());
            System.out.println("Kelas : " + mhs.getKelas());
            System.out.println("Asal : " + mhs.getAsal());
            System.out.println("-----------------------");
        }
    }

    public void saveMahasiswa() {
        try {
            try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(student);
            }
        } catch (IOException e) {
        }
    }

    @SuppressWarnings("unchecked")
    private void readMahasiswi() {
        try {
            try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
                student = (ArrayList<DataMhs>) ois.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
        }
    }
}
    


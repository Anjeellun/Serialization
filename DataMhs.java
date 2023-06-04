/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serialization;

/**
 *
 * @author DELL
 */
import java.io.Serializable;

public class DataMhs implements Serializable{
    private String nama;
    private String nim;
    private String kelas;
    private String asal;
    
    public DataMhs (String nama, String nim, String kelas, String asal){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.asal = asal;
    }
    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public String getKelas(){
        return kelas;
    }
    public String getAsal(){
        return asal;
    }
    public void setNama (String nama){
        this.nama = nama;
    }
    public void setNim (String nim){
        this.nim = nim;
    }
    public void setKelas (String kelas){
        this.kelas = kelas;
    }
    public void setAsal (String asal){
        this.asal = asal;
    }
    
    @Override
    public String toString(){
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", nim='" + nim + '\'' +
                ", kelas='" + kelas + '\'' +
                ", asal='" + asal + '\'' +
                '}';
    }
   }

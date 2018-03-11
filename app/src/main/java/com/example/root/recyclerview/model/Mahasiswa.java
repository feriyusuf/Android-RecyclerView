package com.example.root.recyclerview.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by root on 3/11/18.
 */

@Getter
@Setter
public class Mahasiswa {
    private String nama;
    private String npm;
    private String noHp;

    public Mahasiswa(String nama, String npm, String noHp){
        this.nama       = nama;
        this.npm        = npm;
        this.noHp       = noHp;
    }
}

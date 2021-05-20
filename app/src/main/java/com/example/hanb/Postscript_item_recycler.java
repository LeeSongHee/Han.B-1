package com.example.hanb;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

class Postscript_item {
    public String programName;
    public String postscript;
    public Integer grade;

    public Postscript_item(String programName, String postscript, Integer grade) {
        this.programName = programName;
        this.postscript = postscript;
        this.grade = grade;
    }
}
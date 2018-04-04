package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String path = "/Users/wuxiaodong/Downloads/ESC-50/audio/1-137-A-32.wav";
        ReadWav pre = new ReadWav();
        pre.bacaFile(path);
        pre.getNilaiSample();
        double array[] = new double[pre.getNilaiSample().size()];
        for (int i = 0; i <array.length; i++){
            array[i] = pre.getNilaiSample().get(i);
        }
        MFCC mfcc = new MFCC();
        mfcc.process(array);
        System.out.println(Arrays.toString(array));
    }
}

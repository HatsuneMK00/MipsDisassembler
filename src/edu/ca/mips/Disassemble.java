package edu.ca.mips;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Disassemble {
    public static void main(String[] args) {
        String sampleFilepath = "/Users/makise/IdeaProjects/MipsDisassembler/files/sample.txt";

        File sample = new File(sampleFilepath);

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(sample)));
            ArrayList<String> binaryCodes = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                binaryCodes.add(line);
            }

            Disassembler disassembler = new Disassembler();
            disassembler.parse(binaryCodes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package edu.ca.mips;

import edu.ca.mips.instructions.Instruction;
import edu.ca.mips.instructions.iinstruction.IInstruction;
import edu.ca.mips.instructions.jinstruction.JInstruction;
import edu.ca.mips.instructions.rinstruction.RInstruction;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Disassembler {

    HashMap<String, String> opcode2Instruction = new HashMap<>();

    public Disassembler() {
        opcode2Instruction.put("010000", "J");
        opcode2Instruction.put("010001", "JR");
        opcode2Instruction.put("010010", "BEQ");
        opcode2Instruction.put("010011", "BLTZ");
        opcode2Instruction.put("010100", "BGTZ");
        opcode2Instruction.put("010101", "BREAK");
        opcode2Instruction.put("010110", "SW");
        opcode2Instruction.put("010111", "LW");
        opcode2Instruction.put("011000", "SLL");
        opcode2Instruction.put("011001", "SRL");
        opcode2Instruction.put("011010", "SRA");
        opcode2Instruction.put("011011", "NOP");

        opcode2Instruction.put("110000", "ADD");
        opcode2Instruction.put("110001", "SUB");
        opcode2Instruction.put("110010", "MUL");
        opcode2Instruction.put("110011", "AND");
        opcode2Instruction.put("110100", "OR");
        opcode2Instruction.put("110101", "XOR");
        opcode2Instruction.put("110110", "NOR");
        opcode2Instruction.put("110111", "SLT");
        opcode2Instruction.put("111000", "ADDI");
        opcode2Instruction.put("111001", "ANDI");
        opcode2Instruction.put("111010", "ORI");
        opcode2Instruction.put("111011", "XORI");
    }

    public void parse(List<String> binaryCodes) {
        ArrayList<Instruction> assembleProgram = new ArrayList<>();
        for (String binaryCode : binaryCodes) {
            String opcode = binaryCode.substring(0, 6);
            String mnemonic = opcode2Instruction.get(opcode);

            switch (mnemonic) {
                case "ADD":
                case "AND":
                case "BREAK":
                case "JR":
                case "MUL":
                case "NOP":
                case "NOR":
                case "OR":
                case "SLL":
                case "SLT":
                case "SRA":
                case "SRL":
                case "SUB":
                case "XOR":
                {
                    assembleProgram.add(new RInstruction(mnemonic, opcode, binaryCode));
                    break;
                }
                case "J":
                {
                    assembleProgram.add(new JInstruction(mnemonic, opcode, binaryCode));
                }
                case "ADDI":
                case "ANDI":
                case "BEQ":
                case "BGTZ":
                case "BLTZ":
                case "LW":
                case "ORI":
                case "SW":
                case "XORI":
                {
                    assembleProgram.add(new IInstruction(mnemonic, opcode, binaryCode));
                }
            }
        }


    }
}

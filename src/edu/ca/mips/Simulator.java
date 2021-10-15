package edu.ca.mips;

import edu.ca.mips.data.Data;
import edu.ca.mips.instructions.Instruction;
import edu.ca.mips.utils.FileUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Simulator {

    private int cycle = 1;

    private final List<Instruction> mAssembleProgram;
    private final List<Data> mProgramData;

    private final int dataStartAddress;
    private final int dataEndAddress;

    private final int programStartAddress;

    private final List<Integer> registers;
    private final List<Integer> memory;

    final String resultFilepath = "result/simulation.txt";

    public Simulator(List<Instruction> assembleProgram, List<Data> programData) {
        this.mAssembleProgram = assembleProgram;
        this.mProgramData = programData;
        this.dataStartAddress = mProgramData.get(0).getDataAddress();
        this.dataEndAddress = mProgramData.get(mProgramData.size() - 1).getDataAddress();
        this.programStartAddress = mAssembleProgram.get(0).getInstructionAddress();

        registers = new ArrayList<>();
        memory = new ArrayList<>();
    }

    public void simulate() throws IOException {
        int pc;
        initialize();

        PrintWriter out = FileUtil.getPrintWriter(resultFilepath);
        if (out == null) {
            return;
        }

        Instruction instruction = mAssembleProgram.get(0);
        while (!instruction.getMnemonic().equals("BREAK")) {
            pc = instruction.execute(registers, memory, dataStartAddress);
            out.println("--------------------");
            out.println("Cycle:" + (cycle++) + " " + instruction.getInstructionAddress() + "\t" + instruction);
            printRegisterAndMemory(out);
            instruction = mAssembleProgram.get((pc - programStartAddress) / 4);
        }
        out.println("--------------------");
        out.println("Cycle:" + (cycle++) + " " + instruction.getInstructionAddress() + "\t" + instruction);
        printRegisterAndMemory(out);
        out.close();
    }

    public void initialize() {
        for (Data datum : mProgramData) {
            memory.add(datum.getValue());
        }
        for (int i = 0; i < 32; i++) {
            registers.add(0);
        }
    }

    public void printRegisterAndMemory(PrintWriter out) throws IOException {
        out.println();
        out.println("Registers");
        for (int i = 0; i < registers.size(); i++) {
            if (i % 8 == 0) {
                out.printf("R%02d:\t", i);
            }
            if (i % 8 == 7) {
                out.print(registers.get(i));
                out.println();
            } else {
                out.print(registers.get(i) + "\t");
            }
        }
        out.println();
        out.println("Data");
        for (int i = 0; i < memory.size(); i++) {
            if (i % 8 == 0) {
                out.printf("%03d:\t", dataStartAddress + i * 4);
            }
            if (i % 8 == 7) {
                out.print(memory.get(i));
                out.println();
            } else {
                out.print(memory.get(i) + "\t");
            }
        }
        out.println();
    }
}

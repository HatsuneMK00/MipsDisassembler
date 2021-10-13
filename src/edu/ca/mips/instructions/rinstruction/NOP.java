package edu.ca.mips.instructions.rinstruction;

public class NOP extends RInstruction{
    public NOP() {
        super("NOP", "011011", "00000", "00000", "00000", "00000");
    }

    @Override
    public void execute() {

    }
}

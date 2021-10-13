package edu.ca.mips.instructions.iinstruction;

public class ADDI extends IInstruction {
    public ADDI(String rd, String rs, String immediate) {
        super("ADDI", "111000", rd, rs, immediate);
    }

    @Override
    public void execute() {

    }
}

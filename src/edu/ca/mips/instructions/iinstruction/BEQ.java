package edu.ca.mips.instructions.iinstruction;

public class BEQ extends IInstruction {
    public BEQ(String rd, String rs, String immediate) {
        super("BEQ", "010010", rd, rs, immediate);
    }

    @Override
    public void execute() {

    }
}

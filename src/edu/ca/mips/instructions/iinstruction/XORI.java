package edu.ca.mips.instructions.iinstruction;

public class XORI extends IInstruction {
    public XORI(String rd, String rs, String immediate) {
        super("XORI", "111011", rd, rs, immediate);
    }

    @Override
    public void execute() {

    }
}

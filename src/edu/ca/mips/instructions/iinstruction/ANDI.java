package edu.ca.mips.instructions.iinstruction;

public class ANDI extends IInstruction {
    public ANDI(String rd, String rs, String immediate) {
        super("ANDI", "111001", rd, rs, immediate);
    }

    @Override
    public void execute() {

    }
}

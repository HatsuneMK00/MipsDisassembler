package edu.ca.mips.instructions.iinstruction;

public class BLTZ extends IInstruction {
    public BLTZ(String rd, String rs, String immediate) {
        super("BLTZ", "010011", rd, rs, immediate);
    }

    @Override
    public void execute() {

    }
}

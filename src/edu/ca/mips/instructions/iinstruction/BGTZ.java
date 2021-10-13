package edu.ca.mips.instructions.iinstruction;

public class BGTZ extends IInstruction {
    public BGTZ(String rd, String rs, String immediate) {
        super("BGTZ", "010100", rd, rs, immediate);
    }

    @Override
    public void execute() {

    }
}

package edu.ca.mips.instructions.iinstruction;

public class SW extends IInstruction {
    public SW(String rd, String rs, String immediate) {
        super("SW", "010110", rd, rs, immediate);
    }

    @Override
    public void execute() {

    }
}

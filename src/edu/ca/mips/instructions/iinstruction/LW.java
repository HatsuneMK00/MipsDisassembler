package edu.ca.mips.instructions.iinstruction;

public class LW extends IInstruction {
    public LW(String rd, String rs, String immediate) {
        super("LW", "010111", rd, rs, immediate);
    }

    @Override
    public void execute() {

    }
}

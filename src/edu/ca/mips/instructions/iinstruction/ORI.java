package edu.ca.mips.instructions.iinstruction;

public class ORI extends IInstruction {
    public ORI(String rd, String rs, String immediate) {
        super("ORI", "111010", rd, rs, immediate);
    }

    @Override
    public void execute() {

    }
}

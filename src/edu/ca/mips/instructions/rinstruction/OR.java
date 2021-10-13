package edu.ca.mips.instructions.rinstruction;

public class OR extends RInstruction{
    public OR(String rd, String rt, String rs) {
        super("OR", "110100", rd, rt, rs, "00000");
    }

    @Override
    public void execute() {

    }
}

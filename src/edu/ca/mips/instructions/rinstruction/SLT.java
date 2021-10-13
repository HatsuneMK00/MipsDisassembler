package edu.ca.mips.instructions.rinstruction;

public class SLT extends RInstruction{
    public SLT(String rd, String rt, String rs) {
        super("SLT", "110111", rd, rt, rs, "00000");
    }

    @Override
    public void execute() {

    }
}

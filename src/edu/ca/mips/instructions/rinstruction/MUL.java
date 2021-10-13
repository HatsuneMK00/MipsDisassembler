package edu.ca.mips.instructions.rinstruction;

public class MUL extends RInstruction{
    public MUL(String rd, String rt, String rs) {
        super("MUL", "110010", rd, rt, rs, "00000");
    }

    @Override
    public void execute() {

    }
}

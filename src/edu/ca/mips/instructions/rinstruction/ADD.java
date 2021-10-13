package edu.ca.mips.instructions.rinstruction;

public class ADD extends RInstruction{
    public ADD(String rd, String rt, String rs) {
        super("ADD", "110000", rd, rt, rs, "00000");
    }

    @Override
    public void execute() {

    }
}

package edu.ca.mips.instructions.rinstruction;

public class SRA extends RInstruction{
    public SRA(String rd, String rt, String rs, String offset) {
        super("SRA", "011010", rd, rt, rs, offset);
    }

    @Override
    public void execute() {

    }
}

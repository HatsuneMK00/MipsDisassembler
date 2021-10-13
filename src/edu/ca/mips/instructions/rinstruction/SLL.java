package edu.ca.mips.instructions.rinstruction;

public class SLL extends RInstruction{
    public SLL(String rd, String rt, String rs, String offset) {
        super("SLL", "011000", rd, rt, rs, offset);
    }

    @Override
    public void execute() {

    }
}

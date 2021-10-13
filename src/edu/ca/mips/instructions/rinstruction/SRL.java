package edu.ca.mips.instructions.rinstruction;

public class SRL extends RInstruction{
    public SRL(String rd, String rt, String rs, String offset) {
        super("SRL", "011001", rd, rt, rs, offset);
    }

    @Override
    public void execute() {

    }
}

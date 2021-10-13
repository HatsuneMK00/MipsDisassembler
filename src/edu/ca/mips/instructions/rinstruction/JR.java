package edu.ca.mips.instructions.rinstruction;

public class JR extends RInstruction{
    public JR(String rd, String rt, String rs, String offset) {
        super("JR", "010001", rd, rt, rs, offset);
    }

    @Override
    public void execute() {

    }
}

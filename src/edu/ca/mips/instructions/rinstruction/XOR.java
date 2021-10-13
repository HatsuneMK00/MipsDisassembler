package edu.ca.mips.instructions.rinstruction;

public class XOR extends RInstruction{
    public XOR(String rd, String rt, String rs) {
        super("XOR", "110101", rd, rt, rs, "00000");
    }

    @Override
    public void execute() {

    }
}

package edu.ca.mips.instructions.rinstruction;

public class NOR extends RInstruction{
    public NOR(String rd, String rt, String rs) {
        super("NOR", "110110", rd, rt, rs, "00000");
    }

    @Override
    public void execute() {

    }
}

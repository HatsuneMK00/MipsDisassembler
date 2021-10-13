package edu.ca.mips.instructions.rinstruction;

public class AND extends RInstruction{
    public AND(String rd, String rt, String rs) {
        super("AND", "110011", rd, rt, rs, "00000");
    }

    @Override
    public void execute() {

    }
}

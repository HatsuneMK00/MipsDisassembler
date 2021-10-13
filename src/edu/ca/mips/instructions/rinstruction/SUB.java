package edu.ca.mips.instructions.rinstruction;

public class SUB extends RInstruction{
    public SUB(String rd, String rt, String rs) {
        super("SUB", "110001", rd, rt, rs, "00000");
    }

    @Override
    public void execute() {

    }
}

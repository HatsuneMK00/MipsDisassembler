package edu.ca.mips.instructions.jinstruction;

public class J extends JInstruction{

    public J(String address) {
        super("J", "010000", address);
    }

    @Override
    public void execute() {

    }
}

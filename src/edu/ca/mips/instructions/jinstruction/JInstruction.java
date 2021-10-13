package edu.ca.mips.instructions.jinstruction;

import edu.ca.mips.instructions.Instruction;

public abstract class JInstruction extends Instruction {
    String address;

    public JInstruction(String mnemonic, String opcode, String address) {
        super(mnemonic, opcode);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

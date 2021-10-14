package edu.ca.mips.instructions.jinstruction;

import edu.ca.mips.instructions.Instruction;

public class JInstruction extends Instruction {
    private String address;

    public JInstruction(String mnemonic, String opcode, String binaryCode) {
        super(mnemonic, opcode, "J");
        this.address = binaryCode.substring(6, 32);
    }

    @Override
    public void execute() {

    }

    public String getAddress() {
        return String.valueOf(Integer.parseInt(address, 2) * 4);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return getMnemonic() + " #" + getAddress();
    }
}

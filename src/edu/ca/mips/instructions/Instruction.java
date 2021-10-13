package edu.ca.mips.instructions;

public abstract class Instruction {
    String mnemonic;  // 指令名称
    String opcode;

    public Instruction(String mnemonic, String opcode) {
        this.mnemonic = mnemonic;
        this.opcode = opcode;
    }

    abstract public void execute();

    public String getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    public String getOpcode() {
        return opcode;
    }

    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }
}

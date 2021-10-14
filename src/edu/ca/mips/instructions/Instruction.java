package edu.ca.mips.instructions;

public abstract class Instruction {
    String mnemonic;  // 指令名称
    String opcode;
    String type;  // 指令类型

    public Instruction(String mnemonic, String opcode, String type) {
        this.mnemonic = mnemonic;
        this.opcode = opcode;
        this.type = type;
    }

    public Instruction() {
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

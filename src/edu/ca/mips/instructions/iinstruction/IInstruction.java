package edu.ca.mips.instructions.iinstruction;

import edu.ca.mips.instructions.Instruction;

public class IInstruction extends Instruction {
    String rd;
    String rs;
    String immediate;

    public IInstruction(String mnemonic, String opcode, String binaryCode) {
        super(mnemonic, opcode, "I");
        this.rs = binaryCode.substring(6, 11);
        this.rd = binaryCode.substring(11,16);
        this.immediate = binaryCode.substring(16, 32);
    }

    public String getRd() {
        return rd;
    }

    public void setRd(String rd) {
        this.rd = rd;
    }

    public String getRs() {
        return rs;
    }

    public void setRs(String rs) {
        this.rs = rs;
    }

    public String getImmediate() {
        return immediate;
    }

    public void setImmediate(String immediate) {
        this.immediate = immediate;
    }

    @Override
    public void execute() {

    }
}

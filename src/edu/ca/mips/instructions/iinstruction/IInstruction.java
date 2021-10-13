package edu.ca.mips.instructions.iinstruction;

import edu.ca.mips.instructions.Instruction;

public abstract class IInstruction extends Instruction {
    String rd;
    String rs;
    String immediate;

    public IInstruction(String mnemonic, String opcode, String rd, String rs, String immediate) {
        super(mnemonic, opcode);

        this.rd = rd;
        this.rs = rs;
        this.immediate = immediate;
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
}

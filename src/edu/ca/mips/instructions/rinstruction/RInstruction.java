package edu.ca.mips.instructions.rinstruction;

import edu.ca.mips.instructions.Instruction;

public abstract class RInstruction extends Instruction {
    String rd; // 长度为5
    String rt;
    String rs;
    String offset; // 长度为5
    String funct = "000000"; // 长度为6

    public RInstruction(String mnemonic, String opcode, String rd, String rt, String rs, String offset) {
        super(mnemonic, opcode);
        this.rd = rd;
        this.rt = rt;
        this.rs = rs;
        this.offset = offset;
    }

    public RInstruction(String mnemonic, String opcode, String rd, String rt, String rs, String offset, String funct) {
        super(mnemonic, opcode);
        this.rd = rd;
        this.rt = rt;
        this.rs = rs;
        this.offset = offset;
        this.funct = funct;
    }

    public String getRd() {
        return rd;
    }

    public void setRd(String rd) {
        this.rd = rd;
    }

    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    public String getRs() {
        return rs;
    }

    public void setRs(String rs) {
        this.rs = rs;
    }
}

package edu.ca.mips.instructions.rinstruction;

import edu.ca.mips.instructions.Instruction;

public class RInstruction extends Instruction {
    String rd; // 长度为5
    String rt;
    String rs;
    String offset; // 长度为5
    String funct; // 长度为6

    public RInstruction(String mnemonic, String opcode, String binaryCode) {
        super(mnemonic, opcode, "R");
        this.rs = binaryCode.substring(6, 11);
        this.rt = binaryCode.substring(11, 16);
        this.rd = binaryCode.substring(16, 21);
        this.offset = binaryCode.substring(21, 26);
        this.funct = binaryCode.substring(26, 32);
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

    @Override
    public void execute() {

    }
}

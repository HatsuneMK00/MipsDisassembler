package edu.ca.mips.instructions.rinstruction;

import edu.ca.mips.instructions.Instruction;

public class RInstruction extends Instruction {
    private String rd; // 长度为5
    private String rt;
    private String rs;
    private String offset; // 长度为5
    private String funct; // 长度为6

    public RInstruction(String mnemonic, String opcode, String binaryCode) {
        super(mnemonic, opcode, "R");
        this.rs = binaryCode.substring(6, 11);
        this.rt = binaryCode.substring(11, 16);
        this.rd = binaryCode.substring(16, 21);
        this.offset = binaryCode.substring(21, 26);
        this.funct = binaryCode.substring(26, 32);
    }

    public String getRd() {
        return "R" + Integer.parseInt(rd, 2);
    }

    public void setRd(String rd) {
        this.rd = rd;
    }

    public String getRt() {
        return "R" + Integer.parseInt(rt, 2);
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    public String getRs() {
        return "R" + Integer.parseInt(rs, 2);
    }

    public void setRs(String rs) {
        this.rs = rs;
    }

    public String getOffset() {
        return String.valueOf(Integer.parseInt(offset, 2));
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getFunct() {
        return funct;
    }

    public void setFunct(String funct) {
        this.funct = funct;
    }

    @Override
    public void execute() {

    }

    @Override
    public String toString() {
        switch (getMnemonic()) {
            case "BREAK":
            case "NOP":
            {
                return getMnemonic();
            }
            case "SLL":
            case "SRL":
            case "SRA":
            {
                return getMnemonic() + " " + getRd() + ", " + getRt() + ", " + "#" + getOffset();
            }
            case "JR":
            {
                return getMnemonic() + " " + getRs();
            }
        }
        return getMnemonic() + " " + getRd() + ", " + getRs() + ", " + getRt();
    }
}

package edu.ca.mips.instructions.iinstruction;

import edu.ca.mips.instructions.Instruction;

public class IInstruction extends Instruction {
    private String rt;
    private String rs;
    private String immediate;

    public IInstruction(String mnemonic, String opcode, String binaryCode) {
        super(mnemonic, opcode, "I");
        this.rs = binaryCode.substring(6, 11);
        this.rt = binaryCode.substring(11,16);
        this.immediate = binaryCode.substring(16, 32);
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

    public String getImmediate() {
        if (getMnemonic().equals("BEQ") ||
                getMnemonic().equals("BGTZ") ||
                getMnemonic().equals("BLTZ")) {
            return String.valueOf(Integer.parseUnsignedInt(immediate, 2) * 4);
        } else {
            return String.valueOf(Integer.parseUnsignedInt(immediate, 2));
        }
    }

    public void setImmediate(String immediate) {
        this.immediate = immediate;
    }

    @Override
    public void execute() {

    }

    @Override
    public String toString() {
        switch (getMnemonic()) {
            case "LW":
            case "SW":
            {
                return getMnemonic() + " " + getRt() + ", " + getImmediate() + "(" + getRs() + ")";
            }
            case "BEQ":
            {
                return getMnemonic() + " " + getRs() + ", " + getRt() + ", " + "#" + getImmediate();
            }
            case "BGTZ":
            case "BLTZ":
            {
                return getMnemonic() + " " + getRs() + ", " + "#" + getImmediate();
            }
        }
        return getMnemonic() + " " + getRt() + ", " + getRs() + ", " + "#" + getImmediate();
    }
}

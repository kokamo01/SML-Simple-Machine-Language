package sml;

public class SubInstruction extends Instruction {

    private int result;
    private int op1;
    private int op2;

    public SubInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public SubInstruction(String label, int result, int op1, int op2) {
        super(label,"sub");
        this.result = result;
        this.op1 = op1;
        this.op2 = op2;
    }

    @Override
    public void execute(Machine machine) {
        int value1 = machine.getRegisters().getRegister(op1);
        int value2 = machine.getRegisters().getRegister(op2);
        //System.out.println(value1 +" "+ value2 + " " + result );
        //System.out.println(machine.getRegisters());
        machine.getRegisters().setRegister(result, value1 - value2);
    }

    @Override
    public String toString() {
        return super.toString() + " register " + op1 + " - " + " register " + op2 + " output to register " + result;
    }
}

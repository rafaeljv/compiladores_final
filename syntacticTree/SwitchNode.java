package syntacticTree;

import parser.*;


public class SwitchNode extends StatementNode {
    public SwitchCaseNode sw1;

    public SwitchNode(Token t, SwitchCaseNode vSw1) {
        super(t);
        sw1 = vSw1;
        
    }
}

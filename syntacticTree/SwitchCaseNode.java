package syntacticTree;

import parser.*;


public class SwitchCaseNode extends StatementNode {
    public StatementNode stat1;
    public ExpreNode expr;

    public SwitchCaseNode(Token t, ExpreNode e1, StatementNode vStat1) {
        super(t);
        expr = e1;
        stat1 = vStat1;
        
    }
}
